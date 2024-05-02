package com.caching.caching.demo.using.caffeine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CachingDemoUsingCaffeineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CachingDemoUsingCaffeineApplication.class, args);
	}

}
