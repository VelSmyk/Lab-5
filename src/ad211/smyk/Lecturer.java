package ad211.smyk;

public class Lecturer extends Person {
    String nameOfChair;
    int salary;
    public Lecturer(String nameOfChair,String surname, String name, int age, int salary){
        super(surname, name, age);
        this.nameOfChair = nameOfChair;
        this.salary = salary;
    }

   public String getNameOfChair(){
        return nameOfChair;
   }
   public int getSalary(){
        return salary;
   }

   public void setNameOfChair(String nameOfChair){
        this.nameOfChair = nameOfChair;
   }
   public void setSalary(int salary){
        this.salary = salary;
   }

    @Override
    public void printInfo() {
        System.out.println("Lecturer of chair of " + nameOfChair + " " + surname + " " + name + ", age: " + age + "\nSalary: " + salary);
    }
}
