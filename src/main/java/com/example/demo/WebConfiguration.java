package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.time.LocalDate;

/**
 * Created by Administrator on 2018/1/16.
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {
    @Override public void addFormatters(FormatterRegistry registry) {
        registry.addFormatterForFieldType(LocalDate.class, new
                USLocalDateFormatter());
    }
}