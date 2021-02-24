#include<stdio.h>

int main()
{
        int i,j,n;
    printf("Enter Number :- \n");
    scanf("%d",&n);
    	for(int i=0;i<n;i++){
		for(int j=0;j<n-i;j++)
			printf(" ");

        for(int j=1;j<=i;j++)
			printf("%d",j);

		for(int j=i-1;j>0;j--)
			printf("%d",j);

            printf("\n");
	}
	for(int i=2;i<=n;i++){
		for(int j=1;j<i;j++)
			printf(" ");

        for(int j=1;j<=n-i+1;j++)
			printf("%d",j);

		for(int j=n-i;j>0;j--)
			printf("%d",j);
            
            printf("\n");
	}
}



