import java.io.IOException;
import java.util.Scanner;

public class insertionSort {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n,temp=0,j;
        n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<n;i++)
        {
            temp = arr[i];
            j=i;
            while(j > 0 && arr[j-1] > temp)
            {
                arr[j] = arr[j-1];
                j=j-1;
            }
            arr[j] =temp;
        }

        for(int k : arr)
        {
            System.out.print(k+" ");
        }



    }
}
