package com.xumiao.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

/**
 * @author xumiao
 * @description 跨域配置
 * @date 2020/9/7 11:41 下午
 */
@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter() {
        //这边在gateway中配置的,使用reactive包下的
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //允许任意请求头
        corsConfiguration.setAllowedHeaders(Arrays.asList("*"));
        //允许任意请求来源
        corsConfiguration.setAllowedOrigins(Arrays.asList("*"));
        //允许任意请求方法
        corsConfiguration.setAllowedMethods(Arrays.asList("*"));
        //允许携带cookie
        corsConfiguration.setAllowCredentials(true);
        source.registerCorsConfiguration("/**",corsConfiguration);
        CorsWebFilter corsWebFilter = new CorsWebFilter(source);
        return corsWebFilter;
    }

}
