public class Student {

    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;
    public static final double aprovation = 60;

    public Double finalGrade() {
        return firstGrade + secondGrade + thirdGrade;

    }


    public boolean approved() {
        return finalGrade() > aprovation;
    }

    
    public double needToApprove() {
        if (approved()) {
            return 0;
        }
        return aprovation - finalGrade();
    }
}
