// Abel Kahsay Gebreslassie
// PS70N2
package lab3.homework;

import java.util.*;

public class FlyFactory {
    HashMap<Person.Sex, Person> persons;
    int numPeople;
    public FlyFactory(){
        persons = new HashMap<>();
        ArrayList<Double> probsSuddenDeath = new ArrayList<>(Arrays.asList(2.03327E-07,2.03327E-07,2.03327E-07,1.19385E-06,8.87187E-06,1.97007E-05,9.73804E-05));
        ArrayList<Double> probsHospital = new ArrayList<>(Arrays.asList(0.000116508, 5.8254E-05, 0.000452839, 0.00083018, 0.000361234, 0.000542418, 0.000785243));
        ArrayList<Double> probsHospitalDeath = new ArrayList<>(Arrays.asList(0.004496926, 0.002248463, 0.006745389, 0.0085665, 0.013942758, 0.020936024, 0.030308462));
        persons.put(Person.Sex.Female, new Person(Person.Sex.Female, probsHospital, probsHospitalDeath, probsSuddenDeath));

        probsSuddenDeath = new ArrayList<>(Arrays.asList(3.79825E-07, 3.79825E-07, 3.79825E-07, 3.84118E-06, 2.00505E-05, 3.47985E-05, 0.000105441));
        probsHospital = new ArrayList<>(Arrays.asList(0.000217643, 0.000108821, 0.000845925, 0.00267109, 0.000816392, 0.000958105, 0.00085024));
        probsHospitalDeath = new ArrayList<>(Arrays.asList(0.008400475, 0.004200238, 0.012600713, 0.027562562, 0.031510735, 0.036980507, 0.032817199));
        persons.put(Person.Sex.Male, new Person(Person.Sex.Male, probsHospital, probsHospitalDeath, probsSuddenDeath));
    }
    public Person getPerson(Person.Sex sex){
        return persons.get(sex);
    }
}
