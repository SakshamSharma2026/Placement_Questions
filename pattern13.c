#include<stdio.h>
int main()
{
    int i,j,n;
    printf("Enter Number :- \n");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        for(j=n-i;j>=1;j--)
        {
            printf(" ");
        }
        for(j=0;j<2*i+1;j++)
        {
            printf("*");
        }
        printf("\n");
    }




    for(i=n-1;i>=1;i--)
    {
        for(j=0;j<n-i+1;j++)
        {
            printf(" ");
        }
        for(j=0;j<2*i-1;j++)
        {
            printf("*");
        }
        printf("\n");
    }


}