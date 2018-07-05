package birthdayCakeCandles;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 * You are in-charge of the cake for your niece's birthday and have decided the cake will 
 * have one candle for each year of her total age. When she blows out the candles, she’ll 
 * only be able to blow out the tallest ones. Your task is to find out how many candles she 
 * can successfully blow out.For example, if your niece is turning  years old, and the cake 
 * will have  candles of height , , , , she will be able to blow out  candles successfully, 
 * since the tallest candle is of height  and there are  such candles.Complete the function 
 * birthdayCakeCandles that takes your niece's age and an integer array containing height of 
 * each candle as input, and return the number of candles she can successfully blow out.
 * 
 * Sample Input 
 * 4
 * 3 2 1 3
 * Sample Output 0
 * 2
 */
public class Solution {
	// Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
    int max = ar[0],val=1;
        Arrays.sort(ar);
 
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]==ar[ar.length-1])
                val++;
         
        }
        return val ;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      
        if(arCount<1&&arCount>Math.pow(10,5))
            System.exit(0);
        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
