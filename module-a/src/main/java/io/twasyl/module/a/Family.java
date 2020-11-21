package io.twasyl.module.a;

import java.util.Collections;
import java.util.List;

import io.twasyl.module.b.Person;

public class Family {
    private List<Person> members;

    public Family(List<Person> members) {
        this.members = members;
    }

    public List<Person> getMembers() {
        return Collections.unmodifiableList(members);
    }

    public int countMembers() {
        return this.members.size();
    }
}
