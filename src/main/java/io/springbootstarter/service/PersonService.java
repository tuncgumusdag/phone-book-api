package io.springbootstarter.service;

import io.springbootstarter.people.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {

    private List<Person> people = new ArrayList<>(Arrays.asList(
            new Person( "0", "Ahmet", "Veli", new String[]{"+905368915496"}, new String[]{"ahmetveli68@hotmail.com"}, "25/01/1968" ),
            new Person( "1", "Mehmet", "Arda", new String[]{"+905438961123"}, new String[]{"mehmetarda@hotmail.com", "mehmetarda@gmail.com"}, "08/11/1982" )
            ));

    public List<Person> getPeopleList(){
        return people;
    }

    public Person getPerson(String id){
        return people.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    public void addPerson(Person person){
        people.add(person);
    }

}
