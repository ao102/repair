package com.sanyau.repair.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/* 生成完代码后记得开启扫描 */
@MapperScan("com.sanyau.repair.mapper")
public class RepairConfig {
}
