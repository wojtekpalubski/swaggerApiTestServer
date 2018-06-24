package pl.wpe.swaggerApiTestServer.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SlownikBConfig {

    @Bean
    public CommandLineRunner initb1(){
        System.out.println("BBBB");
        return args -> {System.out.println(args);};
    }
    @Bean
    public CommandLineRunner initb2(){
        System.out.println("BB22");
        return args -> {System.out.println(args);};
    }
}
