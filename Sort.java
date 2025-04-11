import java.util.*;
public class Sort
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array :");
     int size=sc.nextInt();
     int num[]=new int[size];
     System.out.println("Enter array elements :");
     for(int i=0;i<size;i++)
     {
        num[i] =sc.nextInt();
     }
     for(int i=0;i<size-1;i++)
     {
         for(int j=i+1;j<size;j++)
         {
             if(num[i]>num[j])
             {
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
             }
        }
    }
    System.out.println("Sorted array :");
    for(int number:num)
    {
         System.out.println(number+" ");
    }
  }
}