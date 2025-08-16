package com.leocavalhere.restproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.leocavalhere.restproject.security.JwtConfigurer;
import com.leocavalhere.restproject.security.JwtTokenProvider;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  @Autowired
  private JwtTokenProvider tokenProvider;

  @Bean 
  public BcryptPasswordEndcoder passWordEncoder() {
    public BCryptPasswordEncoder bCryptPassWordEncoder = new BcryptPasswordEncoder();

    return bCryptPassWordEncoder;
  }
  
  @Bean
  @Override

  public AuthenticationManager authenticationManagerBean() throws Exception {
    return super.authenticationManagerBean();
  }

  protected void configure(HttpSecurity http) throws Exceprion {
    http
      .httpBasic().disable()
      .csrf().disable()
      .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
      .and()
      .authorizeRequests()
      .antMatchers("/users").denyAll()
      .and()
      .cors()
      .and()
      .apply(new JwtConfigurer(tokenProvider));
  }
}