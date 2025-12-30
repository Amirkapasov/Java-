// Kapasov Amir
// SE-2502
// Assigment 2

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Amir", 17, 2.61f);
        Teacher t1 = new Teacher("Fedor", 10, "Calculus");

        Institution i1 = new Institution("AITU", "просп. Мангилик Ел, C1.4", 6, s1, t1);

        Institution i2 = new Institution("AITU", "просп. Мангилик Ел, C1.4", 6, s1, t1);


        s1.info();
        s1.checkStatus();
        System.out.println(s1);

        System.out.println();

        t1.info();
        t1.checkStatus();
        System.out.println(t1);


        System.out.println(i1);

        System.out.println();
        System.out.println("Student studies here: " + i1.hasStudent(s1));
        System.out.println("Teacher works here: " + i1.hasTeacher(t1));

        System.out.println();
        System.out.println("Institutions equal: " + i1.equals(i2));
        System.out.println("HashCodes equal: " + (i1.hashCode() == i2.hashCode()));
    }
}
