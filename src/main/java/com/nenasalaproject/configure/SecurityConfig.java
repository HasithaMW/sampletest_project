package com.nenasalaproject.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
@EnableWebMvcSecurity		// @EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	@Qualifier("userDetailsService")
	private UserDetailsService userDetailsService;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("username").password("password").roles("ADMIN");
		auth.userDetailsService(userDetailsService);
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		// TODO Auto-generated method stub 
		//super.configure(http);
		
		http.authorizeRequests().anyRequest().permitAll();
		
//		http.authorizeRequests()
//		.antMatchers("/login**", "/resources/**").permitAll()
//		.anyRequest().access("hasRole('ROLE_ADMIN')")
//		.and()
//		.formLogin()
//		.loginPage("/login")
//		.failureUrl("/login?error")
//		.usernameParameter("username")
//		.passwordParameter("password")
//		.and().logout().logoutSuccessUrl("/login?logout")
//		.and().csrf()
//		;
//		System.out.println("hjhjhj");
	}
}
