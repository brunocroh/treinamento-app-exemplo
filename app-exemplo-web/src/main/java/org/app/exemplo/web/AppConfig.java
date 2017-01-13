package org.app.exemplo.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("org.app")
@EnableWebMvc
public class AppConfig {
	
	// @Bean e etc

}
