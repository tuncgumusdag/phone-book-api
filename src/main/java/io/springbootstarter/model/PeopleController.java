package io.springbootstarter.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PeopleController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/model")
    public List<Person> getPeopleList(){
        return personService.getPeopleList();
    }

    @RequestMapping("/model/{id}")
    public Person getPerson(@PathVariable String id){
        return personService.getPerson( id );
    }

    @RequestMapping(method=RequestMethod.POST, value="/model")
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }


}
