package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        // Step 1: Create a list of people
        List<Person> people = new ArrayList<>();
        people.add(new Person("Lexx", "Matula", 29));
        people.add(new Person("Peter", "Parker", 18));
        people.add(new Person("Joe", "Doe", 38));
        people.add(new Person("Alice", "Cooper", 19));
        people.add(new Person("Peter", "Cooper", 17));
        people.add(new Person("Michael", "Jaxon", 45));
        people.add(new Person("Emily", "Rose", 23));
        people.add(new Person("Deiter", "Laser", 30));
        people.add(new Person("Rachel", "Garcia", 40));
        people.add(new Person("Amethyst", "Kehlmann", 21));
        people.add(new Person("Melissa", "Wilson", 32));
        people.add(new Person("Broly", "Taylor", 29));

        // Step 2: Prompt the user for a name to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first or last name to search: ");
        String searchName = scanner.nextLine();

        // Find matches
        List<Person> matchingPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(searchName) ||
                    person.getLastName().equalsIgnoreCase(searchName)) {
                matchingPeople.add(person);
            }
        }

        // Display matches
        if (matchingPeople.isEmpty()) {
            System.out.println("No matches found for the name: " + searchName);
        } else {
            System.out.println("Matching people:");
            for (Person person : matchingPeople) {
                System.out.println(person);
            }
        }

        // Step 3: Calculate and display average age, oldest and youngest person
        if (!people.isEmpty()) {
            int totalAge = 0;
            int oldestAge = people.get(0).getAge();
            int youngestAge = people.get(0).getAge();

            for (Person person : people) {
                int age = person.getAge();
                totalAge += age;

                if (age > oldestAge) {
                    oldestAge = age;
                }
                if (age < youngestAge) {
                    youngestAge = age;
                }
            }

            double averageAge = (double) totalAge / people.size();
            System.out.printf("Average Age: %.2f%n", averageAge);
            System.out.println("Oldest Age: " + oldestAge);
            System.out.println("Youngest Age: " + youngestAge);
        }

    }
}