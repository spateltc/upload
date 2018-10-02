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

        registry.addResourceHandler("/index.html").addResourceLocations("/Web-Content/index.html");
        registry.addResourceHandler("/main.bundle.js").addResourceLocations("/Web-Content/main.bundle.js");
        registry.addResourceHandler("/inline.bundle.js").addResourceLocations("/Web-Content/inline.bundle.js");
        registry.addResourceHandler("/node_modules/ng2-drag-drop/style.css").addResourceLocations("/Web-Content/node_modules/ng2-drag-drop/style.css");
        registry.addResourceHandler("/vendor.bundle.js").addResourceLocations("/Web-Content/vendor.bundle.js");
        registry.addResourceHandler("/polyfills.bundle.js").addResourceLocations("/Web-Content/polyfills.bundle.js");
        registry.addResourceHandler("/styles.bundle.js").addResourceLocations("/Web-Content/styles.bundle.js");
        registry.addResourceHandler("/favicon.ico").addResourceLocations("/Web-Content/favicon.ico");
        
    	registry.addResourceHandler("/webtable.png").addResourceLocations("/Web-Content/webtable.png");
		registry.addResourceHandler("/BarChrat.png").addResourceLocations("/Web-Content/BarChrat.png");
		registry.addResourceHandler("/blank.png").addResourceLocations("/Web-Content/blank.png");
		registry.addResourceHandler("/PieChart.png").addResourceLocations("/Web-Content/PieChart.png");
		registry.addResourceHandler("/Add.png").addResourceLocations("/Web-Content/Add.png");
		
		
		
	//	Web-Content\Web-Content\assets\imgWeb-Content\assets\img
       
		//registry.addResourceHandler("/assets/img/webtable.png").addResourceLocations("/Web-Content/assets/img/webtable.png");
		
		 
	   // registry.addResourceHandler("/assets/**").addResourceLocations("/Web-Content/assets/**");
	        
	        
	        
       // registry.addResourceHandler("/assets/**").addResourceLocations("/Web-Content/assets/**");
        
        
        
        /*     registry.addResourceHandler("/assets/**").addResourceLocations("/Web-Content/");   */
	/*	registry.addResourceHandler("/TWB/assets/img/webtable.png").addResourceLocations("/Web-Content/webtable.png");
		registry.addResourceHandler("/TWB/assets/img/BarChrat.png").addResourceLocations("/Web-Content/BarChrat.png");
		registry.addResourceHandler("/TWB/assets/img/blank.png").addResourceLocations("/Web-Content/blank.png");
		registry.addResourceHandler("/TWB/assets/img/PieChart.png").addResourceLocations("/Web-Content/PieChart.png");*/
		
		
		
		
		
		
    	/*registry.addResourceHandler("/*").addResourceLocations("/Web-Content/*");
    /*	*/
    	/*registry.addResourceHandler("/*").addResourceLocations("/Web-Content/*.*.*");
    	registry.addResourceHandler("/styles.bundle.js").addResourceLocations("/Web-Content/styles.bundle.js");*/
    	
    	
    	
      //  registry.addResourceHandler("/index.html").addResourceLocations("/Web-Content/index.html");
        
      /*  registry.addResourceHandler("*.js").addResourceLocations("/Web-Content/js/");
        registry.addResourceHandler("*.js").addResourceLocations("/Web-Content/html/");
        registry.addResourceHandler(".js").addResourceLocations("/Web-Content/css/");
        */
    }

}