package com.mors741.knight;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan
@ImportResource("/META-INF/spring/knight.xml")
@Import(JavaConfig.class)
public class KnightConfig {

}
