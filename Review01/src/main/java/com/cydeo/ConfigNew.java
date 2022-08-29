package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigNew {
    @Bean(name="Wellcome")
    String str(){
        return "Wellcome to Cydeo";
    }
    @Bean(name="Sprint")
    String str2(){
        return "Sprinc Core Practice";
    }
}
