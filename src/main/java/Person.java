import java.util.Objects;
import java.util.OptionalInt;

public class Person {

    protected String name;
    protected String surname;
    protected OptionalInt age;
    protected String address;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = OptionalInt.of(age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && surname.equals(person.surname) && age.equals(person.age) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    public boolean hasAge() { /*...*/ return true;}
    public boolean hasAddress() { /*...*/ return true;}

    public void setAddress(String address) { /*...*/ }
    public void happyBirthday() {
        var age = this.age;

    }

    public PersonBuilder newChildBuilder() { /*...*/ return null;}
}