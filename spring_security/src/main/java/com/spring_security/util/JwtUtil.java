package com.spring_security.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
@Service
public class JwtUtil {

	private String secret = "sandeeep";

	public String extractUsername(String tokan) {
		return extractClaim(tokan, Claims::getSubject);
	}

	public Date extractExpiration(String tokan) {
		return extractClaim(tokan, Claims::getExpiration);
	}
	
	private Claims extractAllClaims(String tokan) {
		return Jwts.parser().setSigningKey(secret).parseClaimsJws(tokan).getBody();
	}

	public <T> T extractClaim(String tokan, Function<Claims,T> claimsResolver) {

		final Claims claims = extractAllClaims(tokan);
		return claimsResolver.apply(claims);

	}

	

	

	private Boolean isTokanExpired(String tokan) {
		return extractExpiration(tokan).before(new Date());
	}

	public String generatorTokan(String username) {
		Map<String, Object> claims = new HashMap<>();
		return createTokan(claims, username);
	}

	private String createTokan(Map<String, Object> claims, String subject) {
		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
				.signWith(SignatureAlgorithm.HS256,secret).compact();
	}

	public Boolean validateTokan(String tokan, UserDetails userDetails) {
		final String username = extractUsername(tokan);
		return (username.equals(userDetails.getUsername()) && isTokanExpired(tokan));
	}
}
