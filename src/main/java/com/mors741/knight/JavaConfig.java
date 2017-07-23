package com.mors741.knight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Random;

@Configuration
@PropertySource("classpath:/prop/knight.properties")
public class JavaConfig {

    @Autowired
    private Environment env;

//    @Bean
//    public Spear getSpear() {
//        return new Spear(new Random().nextInt(100));
//    }

    @Bean
    @Heavy
    public Sword getSword() {
        return new Sword(
                env.getProperty("sword.slayed", Integer.class, 0),
                env.getProperty("sword.name", "Unnamed"));
    }

}
