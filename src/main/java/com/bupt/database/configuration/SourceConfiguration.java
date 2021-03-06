package com.bupt.database.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 使得Springboot可以读取本地磁盘的文件并且返回 url
 *
 * @author wangz
 */
@Configuration
public class SourceConfiguration implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/database/**").addResourceLocations("file:" + System.getProperties().getProperty("user.dir") + "/export_file/");

        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}