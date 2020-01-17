package edu.dmacc.coma510;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Tell Spring Main is the configuration class
@ComponentScan(value = {"edu.dmacc.coma510"}) // Have Spring search for all beans
public class Main {
    public static void main(String[] args) {
        //Create our context/IOC container and give it the configuration
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);
    }
}
