package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.producer.GoodMorning;
import com.sujata.producer.Greet;
import com.sujata.producer.WishingEveryone;

public class MainGreeting {

	public static void main(String[] args) {
		/*
		 * When we are consuming any component using spring:
		 * we need not to instantiate(create object) of that component,
		 * rather Spring container will going to run the life cycle of the component
		 * 
		 * Spring Container : BeanFactory or ApplicationContext
		 * ;
		 * Inversion of Control : seperating the dependecy logic from the 
		 * actual bussiness logic of an application
		 */
		
		/*
		 * Spring Container : 
		 * Spring Container require configuration file , which tells Spring Container about the components for which
		 * spring container is supposed to run the life cycle .
		 * 
		 * Configuration file : . xml, .java, also annotations
		 */
		
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(GreetConfiguration.class);
		
		WishingEveryone wishEveryone1=(WishingEveryone)springContainer.getBean("wishingEveryone");
		
		wishEveryone1.wish();
		
//		Greet g=new GoodMorning(); // depedency of good morning class is name
//		
//		WishingEveryone wishingEveryone=new WishingEveryone();
//		wishingEveryone.wish();

	}

}
