package example.springdata.hibernate.repo;
 
import org.springframework.data.repository.CrudRepository;

import example.springdata.hibernate.model.Person;
 
public interface PeopleRepository extends CrudRepository<Person, Long> {
     
}