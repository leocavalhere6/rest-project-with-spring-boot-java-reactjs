package com.leocavalhere.restproject.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
  
@Configuration
public class WebConfig implements WebMvcConfigurer {
  
  @Value("${cors.originPatterns:default}")
  private String corsOriginPatterns = "";

  public void addCorsMappings(CorsRegistry registry) {
     
    var allowedOrigins = corsOriginPatterns.split(",");
    
    registry.addMapping("/**")
      .allowedOrigins(allowedOrigins)
      //.allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS", "HEAD", "TRACE"); 
      .allowedMethods("*")
       .allowCredentials(true);
      
  }

  @Override
  public void configureContentNegotiation(ContentNegotiationConfigurer Configurer) {
    configurer.favorPathExtension(false)
      .favorParamenter(false)
      .ignoreAcceptHenader(false)
      .defaultContentType(MediaType.APPLICATION_JSON)
      .mediaType("json",Mediatype.APPLICATON_JSON)
      .mediaType("xml",MediaType.APPLICATION_XML)
      .mediaType("x-yaml", MEDIA_TYPE_YML);
  }
}