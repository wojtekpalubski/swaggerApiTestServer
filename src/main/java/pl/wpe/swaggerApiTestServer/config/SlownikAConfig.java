package pl.wpe.swaggerApiTestServer.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SlownikAConfig {

    @Bean
    public CommandLineRunner init1(){
        System.out.println("AAAA");
        return args -> {System.out.println(args);};
    }
    @Bean
    public CommandLineRunner init2(){
        System.out.println("AA22");
        return args -> {System.out.println(args);};
    }
}
