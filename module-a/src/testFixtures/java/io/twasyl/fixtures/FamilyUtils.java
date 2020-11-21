package io.twasyl.fixtures;

import java.util.List;

import io.twasyl.module.a.Family;
import io.twasyl.module.b.Person;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FamilyUtils {
    public static final Person HOMER = new Person("Homer");
    public static final Person MARGE = new Person("Marge");
    public static final Person LISA = new Person("Lisa");
    public static final Person BART = new Person("Bart");

    private FamilyUtils() {
    }

    public static Family simpsons() {
        return new Family(List.of(HOMER, MARGE, LISA, BART));
    }

    public static void assertPerson(final Person expected, final Person actual) {
        assertEquals(expected.getName(), actual.getName());
    }
}
