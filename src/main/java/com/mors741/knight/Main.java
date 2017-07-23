package com.mors741.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        BraveKnight knight = new BraveKnight(new PrincessSavingQuest(System.out));
//        knight.embarkOnQuest();

//        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest(125);
    }
}
