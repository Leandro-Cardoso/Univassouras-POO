import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int age;
    List<Double> grades;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<Double>();
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    public double getAverageGrade() {
        if (this.grades.isEmpty()) {
            return 0;
        }
        else {
            double sum = 0;
            for (double grade : this.grades) {
                sum += grade;
            }
            return sum / this.grades.size();
        }
    }

    public boolean isPassing() {
        if (this.getAverageGrade() < 60) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        /*  */
        Student student = new Student("Leandro", 35);
        student.addGrade(100);
        student.addGrade(50);
        student.addGrade(100);

        System.out.println();
        System.out.println(" Sua média foi de " + student.getAverageGrade());
        System.out.println();

        if (student.isPassing()) {
            System.out.println(" Você foi aprovado !!!");
        }
        else {
            System.out.println(" Você foi reaprovado !!!");
        }
        System.out.println();
    }
}
