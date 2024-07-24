package com.sujata.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sujata.producer.GoodEvening;
import com.sujata.producer.GoodMorning;
import com.sujata.producer.WishingEveryone;

@SpringBootApplication
public class GreetSpringbootDemoprojectPart2Application {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(GreetSpringbootDemoprojectPart2Application.class, args);
		WishingEveryone we=(WishingEveryone) springContainer.getBean("wishingEveryone");
		we.wish();
	}

	
	@Bean
	public GoodMorning gm()
	{
		GoodMorning gm=new GoodMorning();
		gm.setName("Shruti");
		return gm;
	}
	
	@Bean
	public GoodEvening ge()
	{
		return new GoodEvening("Shweta");
	}
	
	@Bean
	public WishingEveryone wishingEveryone() {
		return new WishingEveryone(ge());
	}
}
