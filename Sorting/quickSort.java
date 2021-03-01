import java.io.IOException;
import java.util.Scanner;

public class quickSort
{
	public static void main(String args[]) throws IOException
	{ 
		int n; 
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
		int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

		Sort(arr, 0, n-1); 


		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" ");     
        }
    
    

	private static int partition(int arr[], int low, int high) 
	{ 
		int pivot = arr[high]; 
		int i = (low-1); 
		for (int j=low; j<high; j++) 
		{ 

			if (arr[j] <= pivot) 
			{ 
				i++; 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 

		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 

		return i+1; 
	} 
	private static void Sort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
	
			int pi = partition(arr, low, high); 

	
			Sort(arr, low, pi-1); 
			Sort(arr, pi+1, high); 
		} 
	} 

} 
