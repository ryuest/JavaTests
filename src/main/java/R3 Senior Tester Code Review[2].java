import java.io.IOException;
import java.util.List;

interface PersonDatabase<E> {
    List<Person> getAllPersons() throws IOException;
}

class Person implements PersonDatabase {

    private String firstName;
    private String lastName;
    String gender;
    private float height;

    private List<Person> personsList = null;

    static volatile Float totalHeight = 0.0f;

    public Person(String firstName, String lastName, float height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
    //    return height;
    }

    public float getHeight() {
        return height;
    }

    public void grow(float height) {
        float newHeight = this.height + height;
        if (newHeight < 1.0f || newHeight > 6.0f) {
            throw new IllegalArgumentException("height");
        }

        this.height += height;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.lastName.equals(((Person) obj).lastName));
    }

    public float countPersons(PersonDatabase<Person> personPersonDatabase) {

        try {
            personsList = personPersonDatabase.getAllPersons();
        } catch (IOException e) {

        }

        personsList.parallelStream().forEach(person -> {
            totalHeight += person.getHeight();
        });

        System.out.println(totalHeight);
        return totalHeight;
    }

    @Override
    public List<Person> getAllPersons() throws IOException {
        return personsList;
    }

    public void setAllPersons(Person person) throws IOException {
        personsList.add(person);
    }
}

