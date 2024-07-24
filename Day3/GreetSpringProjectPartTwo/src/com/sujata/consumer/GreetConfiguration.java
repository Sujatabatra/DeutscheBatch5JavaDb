package com.sujata.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.GoodEvening;
import com.sujata.producer.GoodMorning;
import com.sujata.producer.WishingEveryone;

/*
 * @Configuration is used to specify this is the configuration class for Spring
 * Spring containber will read all the methods annotated with @Bean and will run the life cycle of all the components mentioned in these methods.
 */

@Configuration
public class GreetConfiguration {

	/*
	 * if we are not specifying name in @Bean then name of componebt will be same as that of your function
	 */
	
	@Bean
	public GoodMorning gm() {
		GoodMorning goodMorning= new GoodMorning();
		goodMorning.setName("Karan");
		return goodMorning;
	}
	
	@Bean
	public GoodEvening ge() {
		return new GoodEvening("Neha");
	}
	
	@Bean(name = "wishingEveryone")
	public WishingEveryone we() {
		WishingEveryone wishingEveryone=new WishingEveryone(ge());
		return wishingEveryone;
	}
	
	
}
