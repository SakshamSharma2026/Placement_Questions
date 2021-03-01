import java.io.IOException;
import java.util.Scanner;

public class selectionSort {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n,min,i,temp=0;
        n= sc.nextInt();
        int[] arr = new int[n];
        for(int h=0;h<n;h++)
        {
            arr[h] = sc.nextInt();
        }

        for(i=0;i<arr.length-1;i++)
        {
            min = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int k : arr)
        {
            System.out.print(k+" ");
        }

    }
}
