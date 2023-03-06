import java.util.ArrayList;

public class PersonFactory {

    public ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        if (allPersons.size() == 0) {
            allPersons.add(person);
            return;
        }

        int i = 0;
        for (Person p : allPersons) {
            if (person.getLastName().compareTo(p.getLastName()) < 0) {
                allPersons.add(i, person);
                break;
            }
            i++;
        }
    }

    public ArrayList<Person> under18() {
        ArrayList<Person> under18 = new ArrayList<>();
        for (Person p: allPersons) {
            if (Integer.parseInt(p.getAge()) < 18) {
                under18.add(p);
            }
        }
        return under18;
    }

    public boolean checkLastName(String lastName) {
        for (Person p: allPersons) {
            if (p.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
