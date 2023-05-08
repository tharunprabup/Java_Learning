package com.tharun.firstspringboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity(debug = true)
public class TravellerSecurityConfig {
	
	@Autowired
	TravellerAuthProvider travellerAuthProvider;

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests().
				requestMatchers("/welcome/**").permitAll()
				.requestMatchers("/listtravellers/**").permitAll()
				.requestMatchers("/addtraveller/**").authenticated()
				.requestMatchers("/deletebyid/**").authenticated();	
		http.httpBasic();
		http.cors();
		http.csrf().disable(); // 403forbidden error
		return http.build();
	}
	
	@Bean
	public AuthenticationManager authManager(HttpSecurity http) throws Exception {

		AuthenticationManagerBuilder authenticationManagerBuilder = http
				.getSharedObject(AuthenticationManagerBuilder.class);
		authenticationManagerBuilder.authenticationProvider(travellerAuthProvider);
		return authenticationManagerBuilder.build();
	}
}
