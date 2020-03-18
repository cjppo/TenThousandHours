package com.cjppo.backend.war;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: jie_cao
 * @create: 2020-03-16 17:36
 **/
@Configuration
public class BeanConfiguration {

    @Bean(name = "modelmapper")
    public ModelMapper mapper() {
        ModelMapper mapper = new ModelMapper();
        return mapper;
    }
}