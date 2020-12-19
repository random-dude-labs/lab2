package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class Person implements Comparable<Person>, Serializable {

        private final String name;
        private final int age;
        private final ArrayList<String> friends;

        public Person(String name, int age, Collection<String> friends) {
            this.name = name;
            this.age = age;
            this.friends = new ArrayList(friends);
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public Collection<String> getFriends() {
            return Collections.unmodifiableCollection(this.friends);
        }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return person.name == this.name &&
                person.age == this.age &&
                person.friends.equals(this.friends);
    }

    @Override
    protected Object clone() {
        return new Person(name, age, friends);
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(age, o.age);
    }
}
