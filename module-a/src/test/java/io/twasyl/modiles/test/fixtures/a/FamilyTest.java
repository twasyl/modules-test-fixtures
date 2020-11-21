package io.twasyl.modiles.test.fixtures.a;

import org.junit.jupiter.api.Test;
import io.twasyl.fixtures.FamilyUtils;
import io.twasyl.module.b.Person;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static io.twasyl.fixtures.FamilyUtils.assertPerson;

public class FamilyTest {

    @Test
    void assertHomer() {
        assertPerson(FamilyUtils.HOMER, new Person("Homer"));
    }

    @Test
    void testCountMembers() {
        assertEquals(4, FamilyUtils.simpsons().countMembers());
    }
}
