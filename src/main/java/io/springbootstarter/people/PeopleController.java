package io.springbootstarter.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PeopleController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/people")
    public List<Person> getPeopleList(){
        return personService.getPeopleList();
    }

    @RequestMapping("/people/{id}")
    public Person getPerson(@PathVariable String id){
        return personService.getPerson( id );
    }

    @RequestMapping(method=RequestMethod.POST, value="/people")
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }


}
