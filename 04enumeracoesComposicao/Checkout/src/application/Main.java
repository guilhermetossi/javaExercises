package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        // declarando formato para chamar no LocalDate
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String nameClient = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        //birthDatefmt vai receber o valor da variavel birthDateClient no formato dado anteriormente
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDateClient = sc.nextLine();
        LocalDate birthDatefmt = LocalDate.parse(birthDateClient, fmt);

        Client client = new Client(nameClient, email, birthDatefmt);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();

        Order order = new Order(client, OrderStatus.valueOf(status));

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            sc.nextLine();
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            String name = sc.nextLine();

            System.out.print("Product price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(name, price);
            OrderItem orderitem = new OrderItem(quantity, product);
            order.addItem(orderitem);
        }

        System.out.println(order);

        sc.close();
    }
}