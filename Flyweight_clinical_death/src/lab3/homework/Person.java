// Abel Kahsay Gebreslassie
// PS70N2
package lab3.homework;

import java.util.ArrayList;
import java.util.Random;

public class Person {
    public enum Sex {Male, Female};
    public static ArrayList<Integer> ageGroups;
    ArrayList<Double> probabilityHospital;
    ArrayList<Double> probabilityHospitalDeath;
    ArrayList<Double> probabilitySuddenDeath;
    Sex sex;

    public Person(Sex sex, ArrayList<Double> probsHospital, ArrayList<Double> probsHospitalDeath,
                  ArrayList<Double> probsSuddenDeath) {
        this.sex = sex;
        this.probabilityHospital = probsHospital;
        this.probabilitySuddenDeath = probsSuddenDeath;
        this.probabilityHospitalDeath = probsHospitalDeath;
    }

    /**
     * A method computing what happens to a person that day
     * @return an array of String describing what happened (if anything), number of days in hospital
     *          and if the person is dead or not
     */
    public String[] newDay(Integer age,Integer daysInHospital, Boolean dead, Integer index) {
        //If dead, do nothing
        if (dead) return new String[] {"", String.valueOf(daysInHospital), String.valueOf(true)};

        //Calculate what age group this person belongs to
        int myGroup = 0;
        while (age > ageGroups.get(myGroup)) {
            myGroup++;
        }

        // create random object
        Random randomno = new Random();

        if (daysInHospital>0) { //If still in hospital, reduce days left in hospital
            daysInHospital = daysInHospital - 1;
        } else if (daysInHospital == 0) { //If at the end of hospital stay, see if dies or lives
            daysInHospital = daysInHospital - 1;
            if (randomno.nextDouble() < probabilityHospitalDeath.get(myGroup)) {
                dead = true;
                return  new String[] {"Agent "+index+" ("+sex+", age: "+age+") died in hospital",
                        String.valueOf(daysInHospital), String.valueOf(dead)};
            }
        } else { //Person not in hospital
            //Chance of sudden death
            if (randomno.nextDouble() < probabilitySuddenDeath.get(myGroup)) {
                dead = true;
                return new String[] {"Agent "+index+" ("+sex+", age: "+age+") died a sudden death",
                        String.valueOf(daysInHospital), String.valueOf(dead)};
            } else {
                //Chance of hospitalization
                if (randomno.nextDouble() < probabilityHospital.get(myGroup)) {
                    daysInHospital = 6;
                    return new String[] {"Agent "+index+" ("+sex+", age: "+age+") hospitalized",
                            String.valueOf(daysInHospital), String.valueOf(dead)};
                }
            }
        }
        return new String[] {"", String.valueOf(daysInHospital), String.valueOf(dead)};
    }
}
