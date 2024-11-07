package com.example.authservice.config;

import com.example.authservice.util.JwtUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.authentication.AuthenticationManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final JwtUtil jwtUtil;

    // Constructor para inyección de dependencia de JwtUtil
    public SecurityConfig(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    // Configuración de la seguridad HTTP
    @Bean
    public HttpSecurity httpSecurity(HttpSecurity http) throws Exception {
        http.csrf().disable()  // Deshabilitar CSRF (para APIs REST)
                .authorizeRequests()
                .requestMatchers("/auth/login", "/auth/register").permitAll()  // Permitir acceso sin autenticación a estas rutas
                .anyRequest().authenticated();  // Cualquier otra solicitud requiere autenticación
        return http;
    }

    // Configuración del PasswordEncoder (usamos BCrypt)
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Configuración para el AuthenticationManager (no se pasa a través de HttpSecurity en Spring Security 6.x)
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder
                .userDetailsService(userDetailsService())  // Usar un servicio de UserDetails (el cual puedes personalizar)
                .passwordEncoder(passwordEncoder());  // Usar el PasswordEncoder
        return authenticationManagerBuilder.build();
    }

    // Configuración del UserDetailsService (aquí se puede definir la carga de usuarios desde tu base de datos)
    @Bean
    public UserDetailsService userDetailsService() {
        return username -> User.withUsername(username)
                .password(passwordEncoder().encode("password"))  // Puedes reemplazarlo con la carga de usuarios de tu base de datos
                .roles("USER")
                .build();
    }
}
