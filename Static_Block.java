import java.io.*;
public class Static_Block
{
  static int a=40;
  int b=50;
  void simpleDisplay()
  {
     System.out.println(a);
     System.out.println(b);
  }
  static void staticDisplay()
  {
     System.out.println(a);
  }
  public static void main(String args[])
  {
      Static_Block b1=new Static_Block();
      b1.simpleDisplay();
      staticDisplay();
 }
}