import java.util.*;
class Person
{
   String name;
   String gender;
   String address;
   int age;
   Person()
   {
       Scanner sc2=new Scanner(System.in);
       System.out.println("Enter person name:");
       name=sc2.next();
       System.out.println("Enter person gender:");
       gender=sc2.next();
       System.out.println("Enter person address:");
       address=sc2.next();
       System.out.println("Enter person age:");
       age=sc2.nextInt();
   }
}
class Employee extends Person
{
   int empid;
   String c_name;
   String qualification;
   double salary;
   Employee()
   {
       Scanner sc3=new Scanner(System.in);
       System.out.println("Enter employee id:");
       empid=sc3.nextInt();
       System.out.println("Enter company name:");
       c_name=sc3.next();
       System.out.println("Enter employee qualification:");
       qualification=sc3.next();
       System.out.println("Enter employee salary:");
       salary=sc3.nextDouble();
   }
}
class Teacher extends Employee
{
   int trid;
   String department;
   String subject;
   Teacher()
   {
       Scanner sc4=new Scanner(System.in);
       System.out.println("Enter tearcher id:");
       trid=sc4.nextInt();
       System.out.println("Enter department:");
       department=sc4.next();
       System.out.println("Enter subject:");
       subject=sc4.next();
   }
   void display()
   {
       System.out.println(".........................");
       System.out.println("NAME:"+name);
       System.out.println("GENDER:"+gender);
       System.out.println("ADDRESS:"+address);
       System.out.println("AGE:"+age);
       System.out.println("id:"+empid);
       System.out.println("COMPANY NAME:"+c_name);
       System.out.println("QUALIFICATION:"+qualification);
       System.out.println("SALARY:"+salary);
       System.out.println("TEACHER:"+trid);
       System.out.println("DEPARTMENT:"+department);
       System.out.println("SUBJECT:"+subject);
       System.out.println(".........................");
   }
}
class multiinheritance
{
   public static void main(String args[])
   {
      int n;
      Scanner sc1=new Scanner(System.in);
      System.out.println("Enter number of employees:");
      n=sc1.nextInt();
      Teacher t[]=new Teacher[n];
      for(int i=0;i<n;i++)
      {
         t[i]=new Teacher();
      }
      System.out.println("...............");
      System.out.println("...............");
      System.out.println("THE DETAILS ARE.....:");
      System.out.println("...............");
      for(int i=0;i<n;i++)
      {
         t[i].display();
      }
   }
}
