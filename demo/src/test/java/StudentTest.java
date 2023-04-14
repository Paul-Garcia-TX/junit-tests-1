

public class StudentTest {

    public static void main (String[] args){
        Student student = new Student(4567408L, "Jill");
        student.getGrades(84);
        student.getGrades(73);
        student.getGrades(98);
        student.getGrades(88);

        Student jack = new Student(1234568790L, "Jack");

        jack.getGrades(84);
        jack.getGrades(76);
        jack.getGrades(85);
        jack.getGrades(95);

        double jackAvg = jack.getGradeAverage();

        double avg = student.getGradeAverage();
        System.out.println("Student " + student.getName() + " has the following grades" + student.grades + " which gives him an average of: " + avg);

        System.out.println("Student " + jack.getName() + " has the following grades " + jack.grades + " which gives him an a average of: " + jackAvg);
    }

}
