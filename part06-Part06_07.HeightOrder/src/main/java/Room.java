import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    // Constructor
    public Room() {
        this.persons = new ArrayList<>();
    }
    public void add(Person person) {
        persons.add(person);
    }
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        Person shortestPerson = persons.get(0);
        for (Person person : persons) {
            if (person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }
    public Person take() {
        if (persons.isEmpty()) {
            return null;
        }
        Person shortestPerson = this.shortest();
        persons.remove(shortestPerson);
        return shortestPerson;
    }
}
