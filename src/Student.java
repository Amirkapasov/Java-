import java.util.Objects;

class Student extends EducationEntity {

    private int age;
    private float gpa;

    public Student(String name, int age, float gpa) {
        super(name);
        this.age = age;
        this.gpa = gpa;
    }
    public float getGpa() { return gpa; }

    @Override
    public void checkStatus() {
        if (gpa > 2.67f) {
            System.out.println("GPA is acceptable");
        } else {
            System.out.println("GPA is below acceptable level");
        }
    }

    @Override
    public void info() {
        System.out.println("Student: " + name + ", Age: " + age + ", GPA: " + gpa);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", gpa=" + gpa + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return age == student.age &&
                Float.compare(student.gpa, gpa) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age, gpa);
    }
}
