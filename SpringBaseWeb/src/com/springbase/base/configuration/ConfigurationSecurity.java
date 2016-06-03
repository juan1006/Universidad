package com.springbase.base.configuration;

import org.springframework.context.annotation.Configuration;

/**
 * @date : 1/6/2016
 * @time : 11:52:30
 * @author : Juan Quispe Odar
 */
@Configuration
//@EnableWebSecurity
public class ConfigurationSecurity {//extends WebSecurityConfigurerAdapter{

//	@Autowired
//    @Qualifier("customUserDetailsService")
//    UserDetailsService userDetailsService;
// 
//    @Autowired
//    PersistentTokenRepository tokenRepository;
// 
//    @Autowired
//    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService);
//        auth.authenticationProvider(authenticationProvider());
//    }
// 
////    ‘/’ & ‘/list’ : Accessible to everyone
////    ‘/newuser’ & ‘/delete-user-*’ : Accessible only to Admin
////    ‘/edit-user-*’ : Accessible to Admin & DBA
//    
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/", "/list")
//                .access("hasRole('USER') or hasRole('ADMIN') or hasRole('DBA')").antMatchers("/newuser/**", "/delete-user-*")
//                .access("hasRole('ADMIN')").antMatchers("/edit-user-*")
//                .access("hasRole('ADMIN') or hasRole('DBA')").and().formLogin().loginPage("/login")
//                .loginProcessingUrl("/login").usernameParameter("ssoId")
//                .passwordParameter("password").and()
//                .rememberMe().rememberMeParameter("remember-me").tokenRepository(tokenRepository)
//                .tokenValiditySeconds(86400).and().csrf().and().exceptionHandling().accessDeniedPage("/Access_Denied");
//    }
// 
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
// 
//    @Bean
//    public DaoAuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//        authenticationProvider.setUserDetailsService(userDetailsService);
//        authenticationProvider.setPasswordEncoder(passwordEncoder());
//        return authenticationProvider;
//    }
// 
//    @Bean
//    public PersistentTokenBasedRememberMeServices getPersistentTokenBasedRememberMeServices() {
//        PersistentTokenBasedRememberMeServices tokenBasedservice = new PersistentTokenBasedRememberMeServices(
//                "remember-me", userDetailsService, tokenRepository);
//        return tokenBasedservice;
//    }
// 
//    @Bean
//    public AuthenticationTrustResolver getAuthenticationTrustResolver() {
//        return new AuthenticationTrustResolverImpl();
//    }
 
    
}
