public class Employee {

    public String name;
    public double Grosssalary;
    public double tax;

    public double NetSalary() {
        return Grosssalary - tax;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", NetSalary());
    }

    public void IncreaseSalary(double percentage) {
        Grosssalary += Grosssalary * percentage / 100;
    }
}
