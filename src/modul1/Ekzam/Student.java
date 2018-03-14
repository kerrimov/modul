package modul1.Ekzam;

public class Student extends Person {
    private double mark;
    //private String subject;

    public Student(String name, int age, String gender, double mark) {
        super(name, age, gender);
        this.mark = mark;
    }
    public static double GPA(double mark1, double mark2, double mark3){
        double GPA = (mark1+mark2+mark3)/3;
        return GPA;
    }
    public static double GPA(){
        return GPA(4,4,4);
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String toString() {
        return  super.toString() + ", mark: " + mark;
    }
}
