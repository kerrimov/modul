package Ekzam;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String gender, String subject) {
        super(name,age,gender);
        this.subject = subject;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String toString() {
        return super.toString() + ", subject: " + subject;
    }
}
