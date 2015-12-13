package com.chocksaway.com.chocksaway.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * Created by milesd on 13/12/2015.
 */
public class Redis {
    @Autowired private StringRedisTemplate redis;

    /**
     * Check for key already existing in Redis
     * @param key   - Redis key
     * @param name
     * @return boolean - is Redis key present
     */
    public boolean checkForValueInRedis(String key, String name) {
        if (redis.opsForValue().get(key) == null) {
            return false;
        }

        redis.opsForValue().set(key, name);

        return true;
    }
}
