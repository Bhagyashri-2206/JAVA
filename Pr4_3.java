import java.util.*;
class Student
{
   int roll_no;
   Scanner sc=new Scanner(System.in);
   public void setRoll()
   {
      System.out.println("Enter Roll No:");
      roll_no=sc.nextInt();
   }
  public int getRoll()
  {
    return roll_no;
  }
}
class Test extends Student
{
   public int sub1,sub2;
   public void setMarks()
   {
      System.out.println("Enter First Subject Marks:");
      sub1=sc.nextInt();
      System.out.println("Enter Second Subject Marks:");
      sub2=sc.nextInt();
  }
  public void getMarks()
  {
    System.out.println("Subject1 Marks:"+sub1);
    System.out.println("Subject2 Marks:"+sub2);
  }

}
interface Sports
{
   int sMark=50;
   abstract void set();
}
class Result extends Test implements Sports
{
   public int res;
   public void set()
   {
      res=sub1+sub2+sMark;
   }
   public void display()
   {
      System.out.println("Roll No. :"+roll_no);
      System.out.println("Subject1 Marks:"+sub1);
      System.out.println("Subject2 Marks:"+sub2);
      System.out.println("Sports Marks:"+sMark);
      System.out.println("Result:"+res);
  }
}
public class Pr4_3{
  public static void main(String[] args)
  {
     Result r=new Result();
     r.setRoll();
     r.setMarks();
     r.getRoll();
     r.getMarks();
     r.set();
     System.out.println("=================STUDENT DETAILS===================");
     r.display();
  }
}