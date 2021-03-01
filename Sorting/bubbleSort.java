import java.io.IOException;
import java.util.Scanner;

public class bubbleSort
{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n,temp;
        n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }


        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

        for(int k : arr)
        {
            System.out.print(k+" ");
        }

    }
}