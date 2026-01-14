import java.util.Objects;

class Teacher extends EducationEntity {

    private int experienceYears;
    private String subject;

    public Teacher(String name, int experienceYears, String subject) {
        super(name);
        this.experienceYears = experienceYears;
        this.subject = subject;
    }
    public int getExperienceYears() {
        return experienceYears;
    }
    @Override
    public void checkStatus() {
        if (experienceYears >= 5) {
            System.out.println("Experienced teacher");
        } else {
            System.out.println("Junior teacher");
        }
    }

    @Override
    public void info() {
        System.out.println("Teacher: " + name +
                ", Experience: " + experienceYears +
                " years, Subject: " + subject);
    }

    @Override
    public String toString() {
        return "Teacher{name='" + name + "', experienceYears=" +
                experienceYears + ", subject='" + subject + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return experienceYears == teacher.experienceYears &&
                Objects.equals(subject, teacher.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experienceYears, subject);
    }
}
