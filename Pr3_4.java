import java.util.*;
class Student
{
   public int roll_no;
   Scanner sc=new Scanner(System.in);
   public void set()
   {
      System.out.println("Enter Roll No:");
      roll_no=sc.nextInt();
   }
}
class Test extends Student
{
   public int sub1,sub2;
   public void mark()
   {
      System.out.println("Enter First Subject Marks:");
      sub1=sc.nextInt();
      System.out.println("Enter Second Subject Marks:");
      sub2=sc.nextInt();
  }
}
class Result extends Test
{
   public int res;
   public void display()
   {
      System.out.println("Roll No. :"+roll_no);
      System.out.println("Subject1 Marks:"+sub1);
      System.out.println("Subject2 Marks:"+sub2);
      res=sub1+sub2;
      System.out.println("Result:"+res);
  }
}
public class Pr3_4{
  public static void main(String[] args)
  {
     Result r=new Result();
     r.set();
     r.mark();
     System.out.println("=================STUDENT DETAILS===================");
     r.display();
  }
}