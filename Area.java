import java.util.*;
public class Area
{
   int length,breadth;
   void setDim(int length,int breadth)
   {
     this.length=length;
     this.breadth=breadth;
   }
   int getArea()
   {
      return length*breadth;
   }
public static void main(String args[])
{
    Area a=new Area();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a length:");
    int length=sc.nextInt();
    System.out.println("Enter a breadth:");
    int breadth =sc.nextInt();
    a.setDim(length,breadth);
    System.out.println("Area of rectangle:"+a.getArea());
}
}