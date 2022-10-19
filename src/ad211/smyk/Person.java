package ad211.smyk;

public class Person {
     String surname;
     String name;
     int age;

    public Person(String surname, String name, int age){
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public String getSurname(){
        return surname;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Person " + surname + " " + name + ", age: " + age);
    }

}
