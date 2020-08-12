package example.springdata.hibernate;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.springdata.hibernate.model.Person;
import example.springdata.hibernate.service.PeopleService;

public class Main {

    public static void main(String[] args) {
        try(ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("example.springdata.hibernate")) {
            PeopleService peopleService = context.getBean(PeopleService.class);
            Person person = peopleService.create("N T R Phani Kumar", "ntrphanikumar@gmail.com", "Hyderabad");
            System.out.println("Created new person with id: "+ person.getId());
        }
    }
}
