package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jack", "Connor", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies","Adamson", "Brown");
        List<Person> persons = new ArrayList<>();
        for(int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }

       long youngBoy =  persons.stream()
               .filter(value -> value.getAge() < 18)
               .count();

        //ArmyMan
       List<Person> Armyman = persons.stream()
               .filter(values -> values.getAge() >= 18 && values.getAge() <= 27)
               .filter( values -> values.getSex().equals(Sex.MAN))
               .collect(Collectors.toList());
       //worker
       List<Person> worker = persons.stream()
               .filter((values) -> (values.getSex().equals(Sex.MAN) && values.getAge() >= 18 && values.getAge() <= 65)
               ||(values.getSex().equals(Sex.WOMEN) && values.getAge() >= 18 && values.getAge() <= 55))
               .sorted(Comparator.comparing((values) -> values.getFamily()))
       .collect(Collectors.toList());

    }
}
