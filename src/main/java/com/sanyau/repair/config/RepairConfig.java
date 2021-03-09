package com.sanyau.repair.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
/* 生成完代码后记得开启扫描 */
@MapperScan("com.sanyau.repair.mapper")
public class RepairConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
