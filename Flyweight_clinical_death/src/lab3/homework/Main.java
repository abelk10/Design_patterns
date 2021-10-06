// Abel Kahsay Gebreslassie
// PS70N2
package lab3.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Household> houses = new ArrayList<>();
        Random r = new Random();
        Person.ageGroups = new ArrayList<>(Arrays.asList(4,14,29,59,69,79,101));

        FlyFactory factory = new FlyFactory();
        //Create 100 households, with 5 people each
        for (int i = 0; i < 100; i++) {
            ArrayList<Person> people = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                //see if male or female and add person accordingly
                people.add(factory.getPerson(r.nextBoolean() ? Person.Sex.Female : Person.Sex.Male));
                ages.add(r.nextInt(100));
            }
            houses.add(new Household(people, ages, i));
        }

        //Iterate for 100 days
        for (int i = 0; i < 10000; i++) {
            for (Household h : houses) {
                h.newDay();
            }
        }
    }
}
