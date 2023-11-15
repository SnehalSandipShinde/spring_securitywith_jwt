package com.security_demo.spring_securitywith_jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(
		scanBasePackages = "com.security_demo.spring_securitywith_jwt"
,
exclude={DataSourceAutoConfiguration.class}
)
//@EnableWebSecurity
public class SpringSecuritywithJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecuritywithJwtApplication.class, args);
	}

}
