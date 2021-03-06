package com.example.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository repository;

    protected static ApplicationContext applicationContext;
    public static void main(String[] args) {
        applicationContext = SpringApplication.run(Application.class, args);
    }



    @Override
    public void run(String... args) throws Exception {

//		User user = new User();
//		user.setUsername("1@uengine.org");
//		user.setPassword(passwordEncoder.encode("1"));
//		user.setNickname("유엔진");
//		user.setAddress("서울시 논현동");
//        user.setRole("USER_ADMIN");
//		user.setMoney(1000000L);
//
//		repository.save(user);
//
//        user.setUsername("2@uengine.org");
//        user.setPassword(passwordEncoder.encode("1"));
//        user.setNickname("홍길동");
//        user.setAddress("서울시 강남구");
//        user.setMoney(3000000L);
//
//        repository.save(user);
//
//        user.setUsername("3@uengine.org");
//        user.setPassword(passwordEncoder.encode("1"));
//        user.setNickname("신사임당");
//        user.setAddress("서울시 서초구");
//        user.setRole("USER_ADMIN");
//        user.setMoney(2000000L);
//
//        repository.save(user);

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

