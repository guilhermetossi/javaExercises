/*
    Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres
     do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada).
     Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou
     não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser
     aprovado (que é 60% da nota).
*/

 */
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();

        student.firstGrade = sc.nextDouble();
        student.secondGrade = sc.nextDouble();
        student.thirdGrade = sc.nextDouble();

        System.out.println("FINAL GRADE = " + student.finalGrade());


        if (student.approved()) {
            System.out.println("PASS!");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + student.needToApprove() + " POINTS");
        }

        sc.close();
    }
}
