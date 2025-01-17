import java.util.ArrayList;

public class Student {
    public long id;
    public String name;

    ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    // returns the student's id
    public long getId(){
        return id;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(int grade){
        addGrade(grade);
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0.0;
        for (int grade : this.grades){
            sum += grade;
        }
        return sum / this.grades.size();
    }


}
