package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char cui = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String nameProduct = sc.nextLine();

            System.out.print("Price: ");
            double priceProduct = sc.nextDouble();

            if (cui == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(nameProduct, priceProduct, customsFee));
            } else if (cui == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = fmt.parse(sc.next());
                list.add(new UsedProduct(nameProduct,priceProduct,manufactureDate));
            } else {
                list.add(new Product(nameProduct, priceProduct));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product i : list) {
            System.out.println(i.priceTag());
        }

        sc.close();
    }
}