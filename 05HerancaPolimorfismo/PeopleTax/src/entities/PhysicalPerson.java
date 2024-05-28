package entities;

public class PhysicalPerson extends People{

    private Double healthCareExpenses;

    public PhysicalPerson() {
        super();
    }

    public PhysicalPerson(String name, Double annualIncome, Double healthCareExpenses) {
        super(name, annualIncome);
        this.healthCareExpenses = healthCareExpenses;
    }

    public Double getHealthCareExpenses() {
        return healthCareExpenses;
    }

    public void setHealthCareExpenses(Double healthCareExpenses) {
        this.healthCareExpenses = healthCareExpenses;
    }

    @Override
    public double tax() {
        double tax = 0.0;
         if (getAnnualIncome() <= 20000.00) {
             tax = getAnnualIncome() * 15/100;
         } else if(getAnnualIncome() > 20000.00) {
             tax = getAnnualIncome() * 25/100;
         }
         if (healthCareExpenses != 0.0) {
             tax -= healthCareExpenses * 50/100;
         }
         return tax;
    }

}
