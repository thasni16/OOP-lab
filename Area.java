import java.util.*;
class Area
{
   void calArea(float x)
   {
       System.out.println("Area of the square:"+x*x+"sq units");
   }
   void calArea(float x,float y)
   {
       System.out.println("Area of the rectangle:"+x*y+"sq units");
   }
   void calArea(double r)
   {
       double area=3.14*r*r;
       System.out.println("Area of the circle:"+area+"sq units");
   }
   public static void main(String agrs[])
   {
      float s;
      float l,b;
      double r;
      Area obj=new Area();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter side of square");
      s=sc.nextFloat();
      System.out.println("Enter length and breadth of a rectangle");
      l=sc.nextFloat();
      b=sc.nextFloat();
      System.out.println("Enter radius of the circle");
      r=sc.nextDouble();
      obj.calArea(s);
      obj.calArea(l,b);
      obj.calArea(r);
   }
}
