package com.app.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver vResolver = new InternalResourceViewResolver();
        vResolver.setPrefix("/WEB-INF/jsp/");
        vResolver.setSuffix(".jsp");
        vResolver.setOrder(0);
        return  vResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry handlerRegistry){
        handlerRegistry.addResourceHandler("/WEB-INF/pdf/");
    }
}
