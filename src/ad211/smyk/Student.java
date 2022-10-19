package ad211.smyk;

public class Student extends Person {
    int groupNumber;
    int studentID;

    public Student(int groupNumber, String surname, String name, int age, int studentID){
        super(surname, name, age);
        this.groupNumber = groupNumber;
        this.studentID = studentID;
    }

    public int getGroupNumber(){
        return groupNumber;
    }
    public int getStudentID(){
        return studentID;
    }

    public void setGroupNumber(int groupNumber){
        this.groupNumber = groupNumber;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    @Override
    public void printInfo(){
        System.out.println("Student of group " + groupNumber + " " + surname + " " + name + ", age: " + age + "\nNumber of student ID: " + studentID);
    }

}
