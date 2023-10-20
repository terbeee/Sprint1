import java.util.Scanner;

/**
 * @author Admin
 * @date 20/10/2023
 * @project sprint1
 */
public class BlackJack {


    public static void main(String[] args) {
        int h1;
        int h2;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your 2 hand totals");
        h1 = myObj.nextInt();
        h2 = myObj.nextInt();
        System.out.println(play(h1,h2));
    }

    public static int play(int h1,int h2){
        if (h1 > 21){
            h1 = 0;
        }

        if(h2 > 21){
            h2 = 0;
        }

        if (h1 > h2){
            return h1;
        }else{
            return h2;
        }
    }
}
