package example.springdata.hibernate.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.springdata.hibernate.model.Person;
import example.springdata.hibernate.repo.PeopleRepository;

@Transactional
@Service
public class PeopleService {

    @Autowired
    private PeopleRepository peopleRepository;
    
    public Person create(String name, String email, String address) {
        Person person = new Person();
        person.setName(name);
        person.setEmail(email);
        person.setAddress(address);
        return peopleRepository.save(person);
    }
}
