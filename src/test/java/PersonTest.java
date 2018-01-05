import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;

/**
 * Created by jboiko on 11/12/2017.
 */
class PersonTest {

    private Person person;

    @BeforeEach
    public void begin() throws IOException {
        person = new Person("Alan", "Turing", 5.3f);
    //    person.setAllPersons(person);

    }

    @Test
    public void testHeight() {
        float height = person.getHeight();
        Assertions.assertEquals(height, 5.3f);
    }

    @Test
    public void testGrow1() {
        person.grow(0.1f);
        float height = person.getHeight();
        Assertions.assertEquals(height, 5.4f);
    }

    @Test
    public void testGrow2() {
        person.grow(0.6f);
        float height = person.getHeight();
        Assertions.assertEquals(height, 5.9f);
    }

    @Test
    public void testGrow3() {
        person.grow(0.7f);
        float height = person.getHeight();
        Assertions.assertEquals(height, 6.0f);
    }


    @Test()
    public void testGrow4() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            person.grow(0.8f);
        });
    }

    @Test()
    public void testGrow5() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            person.grow(0.9f);
        });
    }

    @Test
    public void testEquals() {
        Person person2 = new Person("Alan", "Turing", 5.3f);
        Assertions.assertEquals(person.equals(person2), person.equals(person));
    }

    @Test
    public void testCountPersons() throws IOException {
     //   float height = person.countPersons();
      //  Assertions.assertEquals(height, 6.0f);
    }

}
