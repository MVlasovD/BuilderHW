import java.util.OptionalInt;

public class PersonBuilder {

    private Person person;
    StringBuilder sb = new StringBuilder();

    public PersonBuilder(){
        person = new Person();
    }

    public PersonBuilder setName(String name) throws IllegalStateException{
        person.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) throws IllegalStateException {
        person.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        person.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        person.address = address;
        return this;
    }

    public Person build() throws IllegalStateException, IllegalArgumentException{
        if (person.name == null) {
            sb.append("Name must not be null.");
        }
        if (person.surname == null) {
            sb.append("Surname must not be null.");
            throw new IllegalStateException(sb.toString());
        }
        if (person.age < 0 || person.age > 100) {
            sb.append("Age is not valid.");
            throw new IllegalArgumentException(sb.toString());
        }
        return person;
    }
}
