package com.caching.caching.demo.using.caffeine.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.concurrent.TimeUnit;

@Configuration
public class CacheConfig {

    @Bean
    public Caffeine<Object, Object> caffeineConfig() {
        return Caffeine.newBuilder()
                .expireAfterWrite(10, TimeUnit.MINUTES) // Cache expiration
                .maximumSize(53); // Cache up to 50 names
    }

    @Bean
    public org.springframework.cache.CacheManager cacheManager(Caffeine<Object, Object> caffeine) {
        var cacheManager = new org.springframework.cache.caffeine.CaffeineCacheManager("codesCache");
        cacheManager.setCaffeine(caffeine);
        return cacheManager;
    }
}
