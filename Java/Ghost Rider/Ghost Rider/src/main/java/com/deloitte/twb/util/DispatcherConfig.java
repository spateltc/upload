package com.deloitte.twb.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class DispatcherConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //registry.addResourceHandler("/table").addResourceLocations("/Web-Content/index.html");
        registry.addResourceHandler("/index.html").addResourceLocations("/Web-Content/index.html");
        registry.addResourceHandler("/main.bundle.js").addResourceLocations("/Web-Content/main.bundle.js");
        registry.addResourceHandler("/inline.bundle.js").addResourceLocations("/Web-Content/inline.bundle.js");
        registry.addResourceHandler("/vendor.bundle.js").addResourceLocations("/Web-Content/vendor.bundle.js");
        registry.addResourceHandler("/polyfills.bundle.js").addResourceLocations("/Web-Content/polyfills.bundle.js");
        registry.addResourceHandler("/styles.bundle.js").addResourceLocations("/Web-Content/styles.bundle.js");
        registry.addResourceHandler("/scripts.bundle.js").addResourceLocations("/Web-Content/scripts.bundle.js");
        registry.addResourceHandler("/favicon.ico").addResourceLocations("/Web-Content/favicon.ico"); 
    	registry.addResourceHandler("/spectrumLogo.png").addResourceLocations("/Web-Content/spectrumLogo.png");	
    }
}