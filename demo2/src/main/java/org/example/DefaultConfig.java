package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.*")
//@Import({Dog.class})
public class DefaultConfig {
}
