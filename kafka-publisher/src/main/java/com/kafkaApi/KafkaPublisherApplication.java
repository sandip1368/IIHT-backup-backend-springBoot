package com.kafkaApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaPublisherApplication {
	
	@Autowired
	private KafkaTemplate<String, Object> template;
	String topic="spring-kafka";
	
	@GetMapping("/publish/{name}")
	public String publishMassege(@PathVariable String name)
	{
		template.send(topic,"hi"+name);
		return "data has been published";
		
	}
	
	@GetMapping("/publishJson")
	public String publishMassege()
	
{	
		User user = new User(123,"sandeep",new String[] {"pune","dange chowk","pune-mumbai highway"});
		template.send(topic,user);
		return "Jsondata has been published";
		
	}


	public static void main(String[] args) {
		SpringApplication.run(KafkaPublisherApplication.class, args);
	}

}
