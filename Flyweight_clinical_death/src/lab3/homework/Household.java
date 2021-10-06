// Abel Kahsay Gebreslassie
// PS70N2
package lab3.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Household {
    ArrayList<Person> inhabitants;
    ArrayList<Integer> ages;
    ArrayList<Integer> daysInHospitals;
    ArrayList<Boolean> dead;
    Integer index;
    public Household(ArrayList<Person> people, ArrayList<Integer> ages, Integer index) {
        this.inhabitants = people;
        this.ages = ages;
        this.index = index;
        dead = new ArrayList<>(Arrays.asList(new Boolean[ages.size()]));
        daysInHospitals = new ArrayList<>(Arrays.asList(new Integer[ages.size()]));
        // set dead to false for all inhabitants
        Collections.fill(dead, false);
        // set days in hospital to -1 for all inhabitants
        Collections.fill(daysInHospitals, -1);
    }
    public void newDay() {
        Boolean printed = false;
        int housesize = inhabitants.size();
        for(int i=0;i < housesize;i++){
            String[] state = inhabitants.get(i).newDay(ages.get(i), daysInHospitals.get(i), dead.get(i), housesize*index+i);
            daysInHospitals.set(i, Integer.valueOf(state[1]));
            dead.set(i, Boolean.valueOf(state[2]));
            if (state[0].length()>0) {
                if (!printed) {
                    System.out.println("Household "+index);
                    printed = true;
                }
                System.out.println(state[0]);
            }
        }
    }
}
