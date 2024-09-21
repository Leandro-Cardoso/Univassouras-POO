import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" 1 - Adicionar aluno");
            System.out.println(" 2 - Adicionar nota");
            System.out.println(" 3 - Verificar aprovação");
            System.out.println(" 4 - Sair");
            System.out.println();
            System.out.print(" Escolha uma opção: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println(" Nome do aluno: ");
                    String name = scanner.next();
                    System.out.println(" Idade do aluno: ");
                    int age = scanner.nextInt();
                    Student student = new Student(name, age);
                    students.add(student);
                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.println();
                        System.out.println(" Nenhum aluno encontrado...");
                        System.out.println();
                    }
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(" " + (i + 1) + " - " + students.get(i));
                    }
                    System.out.print(" Escolha o número do aluno: ");
                    int studentId = scanner.nextInt() -1;
                    if (studentId >= 0 && studentId > students.size()) {
                        System.out.println(" Nota do aluno: ");
                        double grade = scanner.nextDouble();
                        students.get(studentId).addGrade(grade);
                        System.out.println(" Nota adicionada...");
                    }
                    else {
                        System.out.println(" Índice de aluno inválido...");
                    }
                    break;
                case 3:
                    if (students.isEmpty()) {
                        System.out.println();
                        System.out.println(" Nenhum aluno encontrado...");
                        System.out.println();
                    }
                    for (Student s : students) {
                        double averageGrade = s.getAverageGrade();
                        String status = averageGrade >= 60 ? "Aprovado" : "Reprovado";
                        System.out.println(" " + s.name + " - Média: " + averageGrade + " " + status);
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println(" Volte sempre, obrigado !!!");
                    System.out.println();
                    return;
                default:
                    System.out.println();
                    System.out.println(" Opção inválida !!!");
                    System.out.println();
            }
        }
    }
}
