package bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

    @Bean
    FullTimeEmployee fullTimeEmployee(){return new FullTimeEmployee();}

    @Bean
    PartTimeEmployee partTimeEmployee(){return new PartTimeEmployee();}

}
