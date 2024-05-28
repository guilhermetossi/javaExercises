package application;

import entities.LegalEntity;
import entities.People;
import entities.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<People> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Tax payer #" + i  + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ic = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (ic == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpanses = sc.nextDouble();
                list.add(new PhysicalPerson(name, anualIncome, healthExpanses));
            } else if (ic == 'c') {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                list.add(new LegalEntity(name, anualIncome, numberEmployees));
            }
        }

        System.out.println();
        double totalTax = 0.0;
        System.out.println("TAXES PAID: ");
        for (People i : list) {
            System.out.println(i.getName() + ": $" + String.format("%.2f", i.tax()));
            totalTax += i.tax();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", totalTax));
        sc.close();
    }
}