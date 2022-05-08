import java.util.Objects;

public class Person {

    protected String name;
    protected String surname;
    protected Integer age;
    protected String address;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    public boolean hasAge() {
        if (age == null) {
            return false;
        }
        return true;
    }

    public boolean hasAddress() {
        if (address == null) {
            return false;
        }
        return true;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        this.age = age + 1;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder person = new PersonBuilder();
        person.setSurname(getSurname());
        person.setAddress(getAddress());
        return person;
    }
}
