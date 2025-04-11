import java.util.*;
class Employee
{
   String f_name,l_name;
   double salary;
   Employee(String f,String l,double s)
   {
     this.f_name=f;
     this.l_name=l;
     this.salary=(s>0)?s:0.0;
   }
   public String getfname()
   {
      return this.f_name;
   }
   public String getlname()
   {
      return this.l_name;
   }
   public double sal()
   {
      return this.salary;
   }
   public double getYearSal()
   {
      return this.salary*12;
   }
   public void getraise()
   {
      this.salary+=this.salary*0.1;
   }
}
class EmployeeTest
{
    public static void main(String[] args) {
    Employee emp1 = new Employee("Shrisha", "Patil", 3000);
    Employee emp2 = new Employee("Riya", "Rane", 4000);
    System.out.println(emp1.getfname() + " " + emp1.getlname() +"\n"+ "Yearly Salary: " + emp1.getYearSal());
    System.out.println(emp2.getfname() + " " + emp2.getlname() +"\n"+ "Yearly Salary: " + emp2.getYearSal());
    emp1.getraise();
    emp2.getraise();
    System.out.println("================================================");
    System.out.println("After 10% Raise:");
    System.out.println("================================================");
    System.out.println("Name:"+emp1.getfname() + " " + emp1.getlname() + "\n"+"Yearly Salary: " + emp1.getYearSal());
    System.out.println("Name:"+emp2.getfname() + " " + emp2.getlname() + "\n"+"Yearly Salary: " + emp2.getYearSal());
}
}