package com.cg.rest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
            .withUser("user") // Set username
            .password("{noop}user") // Set password (using {noop} for plain text, not recommended for production)
            .roles("USER");
    }/*
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests().antMatchers("/").permitAll().and()
                .authorizeRequests().antMatchers("/h2-console/**").permitAll();
        httpSecurity.csrf().disable();
        httpSecurity.headers().frameOptions().disable();
    }*/
    /*
     * @Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests((requests)->
		requests.requestMatchers("/h2-console/**").permitAll().anyRequest().authenticated()
				);
		http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		http.httpBasic(Customizer.withDefaults());
		http.headers(headers -> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin));
		http.csrf(csrf->csrf.disable());
		return http.build();
	}

     * 
     */
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/public/**","/h2-console/**").permitAll() // Allow access to /public/**
                .antMatchers("/home").authenticated() // Require authentication for /home
                .anyRequest().authenticated()
                .and()
            .formLogin() // Use default Spring Security login form
                .and()
            .logout()
                .permitAll()
            	.and()
        .exceptionHandling().accessDeniedPage("/403"); // Customizing access denied page\
//        http.headers(headers -> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin));
		http.csrf(csrf->csrf.disable());

        http.headers().frameOptions().sameOrigin();
    }
}
