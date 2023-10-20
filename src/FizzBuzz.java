import java.util.Scanner;

/**
 * @author Admin
 * @date 20/10/2023
 * @project sprint1
 */
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter max range for FizzBuzz");
        int max = myObj.nextInt();
        String output = "";

        for (int i = 1; i <= max; i++){
            if ((i % 3) == 0){
                output += "Fizz";
            }
            if ((i % 5) == 0){
                output += "Buzz";
            }

            if (output.equals("")){
                output = Integer.toString(i);
            }

            System.out.println(output);
            output = "";
        }

    }
}
