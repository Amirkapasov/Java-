import java.util.Objects;

class Institution extends EducationEntity {

    private String address;
    private int establishedYears;
    private Student student;
    private Teacher teacher;

    public Institution(String name,
                       String address,
                       int establishedYears,
                       Student student,
                       Teacher teacher) {
        super(name);
        this.address = address;
        this.establishedYears = establishedYears;
        this.student = student;
        this.teacher = teacher;
    }
    public boolean hasStudent(Student s) {
        return student.equals(s);
    }

    public boolean hasTeacher(Teacher t) {
        return teacher.equals(t);
    }
    @Override
    public void checkStatus() {
        if (establishedYears >= 10) {
            System.out.println("Established institution");
        } else {
            System.out.println("Young institution");
        }
    }

    @Override
    public void info() {
        System.out.println("Institution: " + name +
                ", Address: " + address +
                ", Years: " + establishedYears);
    }
    @Override
    public String toString() {
        return "Institution{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", establishedYears=" + establishedYears +
                ", student=" + student +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Institution)) return false;

        Institution that = (Institution) o;

        return Objects.equals(student, that.student) &&
                Objects.equals(teacher, that.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, teacher);
    }
}
