package entities;

public class LegalEntity extends People {

    private Integer numberOfEmployees;

    public LegalEntity() {
        super();
    }

    public LegalEntity(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double tax = 0.0;
        if (numberOfEmployees > 10) {
            tax = getAnnualIncome() * 14/100;
        } else {
            tax = getAnnualIncome() * 16/100;
        }
        return tax;
    }
}
