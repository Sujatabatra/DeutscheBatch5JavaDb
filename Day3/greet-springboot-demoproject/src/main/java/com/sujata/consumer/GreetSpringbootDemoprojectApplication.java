package com.sujata.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.producer.WishingEveryone;

/*
 * @SpringBootApplication : @Configuration & @ComponentScan
 */
@SpringBootApplication(scanBasePackages = "com.sujata.producer")
public class GreetSpringbootDemoprojectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(GreetSpringbootDemoprojectApplication.class, args);
	
		WishingEveryone wish=(WishingEveryone)springContainer.getBean("wishingEveryone");
		
		wish.wish();
	}

}
