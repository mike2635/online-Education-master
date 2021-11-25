package com.lcqh.orderservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.lcqh.orderservice.mapper")
public class OrderConfig {

}
