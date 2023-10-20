import java.util.Scanner;

/**
 * @author Admin
 * @date 20/10/2023
 * @project sprint1
 */
public class taxes {

    public static final double tfSalary = 14999;
    public static final double sconst = 500;
    public static final double mconst = 1499.85;
    public static final double lconst = 2999.8;

    public static void main(String[] args) {
        double tax;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your salary (in GBP£) :");
        double salary = myObj.nextInt();

        if (salary <= tfSalary){
            stringTax(0, salary);
        } else if (salary <=19999) {
            tax = sTax(salary - tfSalary);
            stringTax(tax, salary - tax);
        } else if (salary <=29999){
            tax = mTax(salary - 19999) + sconst;
            stringTax(tax, salary - tax);
        }else if (salary <=44999){
            tax = mTax(salary - 29999) + sconst + mconst;
            stringTax(tax, salary - tax);
        }else{
            tax = mTax(salary - 44999) + sconst + mconst + lconst;
            stringTax(tax, salary - tax);
        }
    }
    public static double sTax(double n){
        return n*0.1;
    }
    public static double mTax(double n){
        return n*0.15;
    }
    public static double lTax(double n){
        return n*0.2;
    }
    public static double xlTax(double n){
        return n*0.25;
    }

    public static void stringTax(double tax, double salary){
        System.out.printf("Your tax for this year is £%.2f\nYour salary post-tax is £%.2f", tax, salary);
    }
}
