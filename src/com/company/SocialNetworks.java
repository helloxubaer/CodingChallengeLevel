package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.*;

public class SocialNetworks {
    static ArrayList<Person> networks = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("social_network.txt"));
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
                String father = null;
                String mother = null;
                String input = scanner.nextLine();
                String[] data = input.split(",");
                String name = data[0];
                if (data.length > 1) {
                    father = data[1];
                } else {
                    father = null;
                }
                if (data.length > 2) {
                    mother = data[2];
                }
                Person person = new Person(name, father, mother);
                networks.add(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        //ancestor("Abel");
        //System.out.println("-------Cathy-----");
        ArrayList<String> newlist = new ArrayList<>();
        ancestor("Cathy");
        ancestor("Kay");
        System.out.println("-------------");
        //ancestor("Kay");

    }


    static ArrayList<String> ancestorPerson = new ArrayList<>();

    public static List ancestorsMother(String name) {
        for (int i = 0; i < networks.size(); i++) {
            Person person = (Person) networks.get(i);
            if (person.getName().equals(name)) {
                int index = i;
                Person person1 = (Person) networks.get(index);
                String person1Name = person.getName();
                String faterName = person1.getFather();
                String motherName = person1.getMother();
                if (faterName != null && motherName != null) {
                    ancestorPerson.add(faterName);
                    ancestorPerson.add(motherName);
                    ancestorsMother(motherName);
                    ancestorsMother(faterName);
                } else if (faterName != null && motherName != null) {
                    ancestorPerson.add(faterName);
                    ancestorsMother(faterName);
                } else if (faterName == null && motherName != null) {
                    ancestorPerson.add(motherName);
                    ancestorsMother(motherName);
                }
            }
        }
        return ancestorPerson;
    }

    public static void ancestor(String name) {
        ArrayList<String> ancestor = new ArrayList<>();
        ListIterator<String> j = ancestorsMother(name).listIterator();
        while (j.hasNext()) {
            ancestor.add(j.next());
        }
        if (ancestor.size() > 0) {
            Collections.sort(ancestor);
            System.out.println(ancestor);
        } else {
              System.out.println("None");
        }

    }
}

