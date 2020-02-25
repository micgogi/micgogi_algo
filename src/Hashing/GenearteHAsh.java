package Hashing;

/**
 * @author Micgogi
 * on 2/25/2020  11:02 PM
 * Micgogi
 */
public class GenearteHAsh {
    public static void main(String[] args) {
        Person person = new Person(23,"Rahul GOgyani","Male");
        System.out.println(genearateHash(person));
    }

    public static int genearateHash(Person person) {
        int hash = person.age;
        hash += person.name.length();
        if (person.gender.equals("M")) {
            hash += 1;
        }
        return hash%6;
    }
}

class Person {
    String name;
    String gender;
    int age;

    Person(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
