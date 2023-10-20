import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Admin
 * @date 20/10/2023
 * @project sprint1
 */
public class uniqueSum {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int sum = 0;
        HashMap<Integer, Boolean> numList = new HashMap<Integer, Boolean>();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your three numbers");
        n1 = myObj.nextInt();
        n2 = myObj.nextInt();
        n3 = myObj.nextInt();
        int[] intArray = new int[]{n1,n2,n3};
        for(int i = 0; i < 3; i++){
            if (numList.containsKey(intArray[i])){
                numList.replace(intArray[i],false);
            } else {
                numList.put(intArray[i], true);
            }
        }

        for (int i = 0; i < intArray.length; i++){
            if ((numList.get(intArray[i])).equals(true)){
                sum += intArray[i];
            }
        }
        System.out.println(sum);
    }
}
