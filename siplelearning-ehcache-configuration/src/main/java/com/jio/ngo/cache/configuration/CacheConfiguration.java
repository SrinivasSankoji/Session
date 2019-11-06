package com.jio.ngo.cache.configuration;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CacheConfiguration extends CachingConfigurerSupport
{

	@Override
	@Bean
	public CacheManager cacheManager() 
	{
		return new EhCacheCacheManager(ehCacheManager());
	}
	
	public net.sf.ehcache.CacheManager ehCacheManager()
	{
		net.sf.ehcache.config.CacheConfiguration tenSecondCache=new net.sf.ehcache.config.CacheConfiguration();
		tenSecondCache.setName("ten-second-cache");
		tenSecondCache.setMemoryStoreEvictionPolicy("LRU");
		tenSecondCache.maxEntriesLocalHeap(100);
		tenSecondCache.setTimeToLiveSeconds(10);
		
		net.sf.ehcache.config.CacheConfiguration twentySecondCache=new net.sf.ehcache.config.CacheConfiguration();
		twentySecondCache.setName("twenty-second-cache");
		twentySecondCache.setMemoryStoreEvictionPolicy("LRU");
		twentySecondCache.maxEntriesLocalHeap(100);
		twentySecondCache.setTimeToLiveSeconds(20);
		
		net.sf.ehcache.config.Configuration configuration=new net.sf.ehcache.config.Configuration();
		configuration.addCache(tenSecondCache);
		configuration.addCache(twentySecondCache);
		return net.sf.ehcache.CacheManager.newInstance(configuration);
	}

}
