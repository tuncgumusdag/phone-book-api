package io.springbootstarter.people;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PeopleController {

    @RequestMapping("/people")
    public List<Person> getAllPeople(){
        return Arrays.asList(
                new Person( "0", "Ahmet", "Veli", new String[]{"+905368915496"}, new String[]{"ahmetveli68@hotmail.com"}, "25/01/1968" ),
                new Person( "1", "Mehmet", "Arda", new String[]{"+905438961123"}, new String[]{"mehmetarda@hotmail.com", "mehmetarda@gmail.com"}, "08/11/1982" )
        );
    }
}
