package com.leocavalhere.restproject.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.leocavalhere.restproject.serialization.converter.YamlJackson2HttpMessageConverter

@Configuration
public class WebConfig implements WebMvcConfigurer {
  private static final Media MEDIA_TYPE_YML = MediaType.valueOf("application/x-yaml");

  public void extendMessageConverter(List<HttpMessageConverter<?>> converters) {
    converters.add(new YamlJackson2HttpMessageConverter());
  }

  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
      .allowedOrigins("http://localhost:3000", "http://localhost")
      .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS", "HEAD", "TRACE"); 
  }

  @Override
  public void configureContentNegotiation(ContentNegotiationConfigurer Configurer) {
    configurer.favorPathExtension(false)
      .favorParamenter(false)
      .ignoreAcceptHenader(false)
      .useRegisteredExtensionsonly(false)
      .defaultContentType(MediaType.APPLICATION_JSON)
      .mediaType("json",Mediatype.APPLICATON_JSON)
      .mediaType("xml",MediaType.APPLICATION_XML)
      .mediaType("x-yaml", MEDIA_TYPE_YML);
  }
}