#include<stdio.h>
int main()
{
    int i,j,n;
    printf("Enter Number :- \n");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        for(j=0;j<n-i-1;j++)
        {
            printf(" ");
        }
        for(j=0;j<i+1;j++)
        {
            printf("* ");
        }
        printf("\n");
    }




    for(i=0;i<n;i++)
    {
        for(j=0;j<i;j++)
        {
            printf(" ");
        }
        for(j=0;j<n-i-1;j++)
        {
            printf("* ");
        }
        printf("\n");
    }


}