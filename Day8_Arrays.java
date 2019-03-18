import java.util.*;

public class Day8_Arrays {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        scanner.close();

        int len = arr.length;
        for (int j=0;j<len;j++)
        {
            if (j != (len - 1))
            {
                System.out.print((arr[len - j - 1]) + " ");
            }
            else
            {
                System.out.print(arr[len - j - 1]);
            }
            
        }
    }
}
