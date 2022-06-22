package com.mosa.gestions.security;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.inMemoryAuthentication().withUser("walid ben jannet").password("{noop}123").roles("directeur");
	auth.inMemoryAuthentication().withUser("sonia guarboug").password("{noop}123").roles("enseignant");
	auth.inMemoryAuthentication().withUser("mahassen khmiri").password("{noop}123").roles("enseignant");
	auth.inMemoryAuthentication().withUser("chokri boussetta").password("{noop}123").roles("enseignant");
	auth.inMemoryAuthentication().withUser("foulen ben falten").password("{noop}123").roles("secretaire");
	auth.inMemoryAuthentication().withUser("jamil ben brahim").password("{noop}123").roles("technicien");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests().antMatchers("/showCreate").hasAnyRole("enseignant");
	http.authorizeRequests().antMatchers("/saveRec").hasAnyRole("enseignant");
	http.authorizeRequests().antMatchers("/ListeRecs").hasAnyRole("directeur","secretaire");
	http.authorizeRequests().antMatchers("/supprimerRec","/modifierRec","/updateRec").hasAnyRole("enseignant");
	http.authorizeRequests().anyRequest().authenticated();
	http.formLogin().loginPage("/login");
	http.exceptionHandling().accessDeniedPage("/accessDenied");
	http.authorizeRequests().antMatchers("/login").permitAll();
	http.authorizeRequests().antMatchers("/webjars/**").permitAll();
	http.authorizeRequests().anyRequest().authenticated();
	}
	
}
