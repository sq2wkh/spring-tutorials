package pl.sq2wkh.spring.tutorial.javabasedconfiguration.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by adam on 08.06.14.
 */
@Configuration
public class SpringBeanConfig {

        @Bean
        public SpringBean springBean(){
            return new SpringBean();
        }
}
