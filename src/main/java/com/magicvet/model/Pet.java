package main.java.com.magicvet.model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Pet {

    static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

    private String type;
    private String sex;
    private String age;
    private String name;
    private String ownerName;

    private final LocalDateTime registrationDate = LocalDateTime.now();

    private Health healthState;

    public static final String Name1 = "Alan";

    public static final String Name2 = "Dilan";

    public static final String Name3 = "Billi";



    public Pet(Health healthState) {
        this.healthState = healthState;
    }


    public Pet() {

    };

    public Pet(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet {"
        + " type = " + type
        + ", age = " + age
        + ", name = " + name
        + ", sex = " + sex
        + ", ownerName = " + ownerName
        + ", registrationDate = " + registrationDate.format(FORMATTER)
        + " }";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(type, pet.type) && Objects.equals(sex, pet.sex) && Objects.equals(age, pet.age) && Objects.equals(name, pet.name) && Objects.equals(ownerName, pet.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sex, age, name, ownerName);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    public Health health() {
        return healthState;
    }

    public enum Health {
        bad(1),
        good(2),
        nice(3);

        private final int value;

        Health(int value) {
            this.value= value;
        }

        public int getValue() {
            return value;
        }
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }
}
