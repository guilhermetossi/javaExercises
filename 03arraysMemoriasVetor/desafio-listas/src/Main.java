import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> listEmployee = new ArrayList<>();

        for (int i=1; i<=n; i++) {
            System.out.println("Employee #" + i);
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            Employee employee = new Employee(id, name, salary);
            listEmployee.add(employee);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee idSearch = listEmployee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (idSearch != null) {
            System.out.print("Enter the percentage: ");
            double increase = sc.nextDouble();
            idSearch.increaseSalary(increase);
        } else {
            System.out.println("This id does not exist! ");
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee rerolEmployee : listEmployee) {
            System.out.println(rerolEmployee);
        }

        sc.close();
    }
}