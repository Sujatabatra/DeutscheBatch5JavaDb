package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.sujata.persistence.ShareDaoImpl;
import com.sujata.presentation.SharePresentationImpl;
import com.sujata.service.ShareServiceImpl;

@Configuration
public class ShareConfig {
	
	@Bean
	public ShareDaoImpl shareDaoImpl() {
		return new ShareDaoImpl();
	}
	
	@Bean
	public ShareServiceImpl shareServiceImpl() {
		ShareServiceImpl service=new ShareServiceImpl();
		service.setShareDao(shareDaoImpl());
		return service;
	}
	
	@Bean
	public SharePresentationImpl sharePresentationImpl() {
		return new SharePresentationImpl(shareServiceImpl());
	}

}
