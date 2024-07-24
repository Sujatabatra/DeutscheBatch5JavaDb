package com.sujata.consumer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * @Configuration is used to specify this is the configuration class for Spring
 * @ComponentScan tell Spring Container the path of the components whoes life cycle will be executed by spring container
 * spring container will identify the components by @Component
 */

@Configuration
@ComponentScan(basePackages = "com.sujata.producer")
public class GreetConfiguration {

}
