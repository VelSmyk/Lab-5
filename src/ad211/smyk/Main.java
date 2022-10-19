package ad211.smyk;

public class Main {
    public static void main(String[] args){
        Person[] people = new Person[8];
        people[0] = new Person("Fam", "Kolya",23);
        people[1] = new Person("Lugach", "July", 17);
        people[2] = new Person("Potter", "Harry", 18);
        people[3] = new Student(211,"Smyk", "Valeriya", 19, 11003);
        people[4] = new Student(215,"Soroka", "Viktoriya", 20, 11056);
        people[5] = new Student(191,"Plotnik", "Egor", 21, 10678);
        people[6] = new Lecturer("Information and Technology","Egoshina","Anna",33, 10500);
        people[7] = new Lecturer("Math","Malis","Sergei",45, 14000);
        for(Person person: people){
            printInfo(person);
        }
    }
    public static void printInfo(Person person){
        person.printInfo();
    }
}
