package com.alco.restapp;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class RESTfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(RESTfulApplication.class, args);
	}
	
	@Bean
	public LocaleResolver localeResolver() {
		//SessionLocaleResolver lr = new SessionLocaleResolver();
		//lr.setDefaultLocale(Locale.US);		
		
		AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
	}
	
//	@Bean
//	public ResourceBundleMessageSource messageSource() {
//		ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
//		ms.setBasename("messages");
//		return ms;
//	}
}
