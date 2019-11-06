package com.jio.ngo.ehcache.configuration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jio.ngo.ehcache.filter.CacheFilter;

@Configuration
@EnableCaching
public class CacheConfiguration 
{
	@Bean
	public CacheFilter cacheFilter() {
		return new CacheFilter();
	}


}
