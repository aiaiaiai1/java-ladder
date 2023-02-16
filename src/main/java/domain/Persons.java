package domain;

import java.util.ArrayList;
import java.util.List;

public class Persons {

    private final List<Person> persons = new ArrayList<>();

    public Persons(List<String> names) {
        addPerson(names);
    }

    public List<Person> getPersons() {
        return persons;
    }

    private void addPerson(List<String> names) {
        for (String name : names) {
            persons.add(new Person(name));
        }
    }

    public List<String> getPersonsName() {
        List<String> names = new ArrayList<>();

        for (Person person : persons) {
            names.add(person.getName());
        }
        return names;
    }
}