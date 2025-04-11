import java.util.Scanner;
public class Matrix
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int m1[][]= new int[2][2];
      int m2[][]= new int[2][2];
      int result[][]= new int[2][2];
      int n=0;
      System.out.println("Enter elements of the first matrix :");
      for(int i=0;i<2;i++)
      {
         for(int j=0;j<2;j++)
         {
            m1[i][j]=sc.nextInt();
         }
      }
      System.out.println("Enter elements of the second matrix :");
      for(int i=0;i<2;i++)
      {
         for(int j=0;j<2;j++)
         {
            m2[i][j]=sc.nextInt();
         }
      }
      System.out.println("1.Addition\n 2.Multiplication\n3.Transpose");
      do
      {
      System.out.println("Enter Choice:");
      int choice=sc.nextInt();
      switch (choice)
      {
         case 1:for(int i=0;i< 2;i++)
                {
                   for(int j=0;j< 2;j++)
                   {
                        result[i][j]=m1[i][j]+m2[i][j];
                   }
               }
               System.out.println("Addition of matrix :");
               for(int i=0;i<2;i++)
               {
                  for(int j=0;j<2;j++)
                  {
                     System.out.print(result[i][j]+" ");
                  }
                  System.out.println(" ");

               }
               break;
        case 2: for(int i=0;i< 2;i++)
                {
                   for(int j=0;j< 2;j++)
                   {
                       result[i][j]=0;
                       for(int k=0;k< 2;k++)
                       {
                            result[i][j]+=m1[i][k]*m2[k][j];
                       }
                    }
               }
               System.out.println("Multiplication of matrix :");
               for(int i=0;i<2;i++)
               {
                  for(int j=0;j<2;j++)
                  {
                     System.out.print(result[i][j]+" ");
                  }
                  System.out.println(" ");

               }
               break;
        case 3:System.out.println("Transpose of matrix:"); 
               for(int i=0;i< 2;i++)
                {
                   for(int j=0;j< 2;j++)
                   {
                      System.out.print(m1[j][i]+" ");
                   }
                 System.out.println(" ");
               }     
        }
       System.out.println("For next operation click '1' or For exit click '0':");
       n=sc.nextInt();

     }while(n==1);
   }
}
 