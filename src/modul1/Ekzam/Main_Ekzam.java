package modul1.Ekzam;

public class Main_Ekzam {

    public static void main(String[] args) {
        Person[] persons = new Person[5];

        System.out.println("Hi, student! You are at the faculty Computer Science.");

        persons[0] = new Teacher("Brad Pitt", 34, "M", "Computer Science");
        persons[1] = new Student("Tom Smith", 18, "M", Student.GPA(2,3,4.5));
        persons[2] = new Student("Ann Hoke", 16, "F", Student.GPA(3,4,5));
        persons[3] = new Student("Alex Hilton", 19,"M",Student.GPA(5,5,3.5));
        persons[4]= new Student("Alice Klerk",17,"F",Student.GPA());

        persons.toString();

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
            System.out.println(" ");
        }
    }
}
