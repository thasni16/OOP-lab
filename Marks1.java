import java.util.*;
class Student
{
	String name;
	int sid,eng,math;
	public Student()
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter name:");
		name=x.next();
		System.out.println("Enter student id :");
		sid=x.nextInt();
		System.out.println("Enter marks in English :");
		eng=x.nextInt();
		System.out.println("Enter marks in Maths :");
		math=x.nextInt();
	}
}
class Sports extends Student
{
	String rank;
	public Sports()
	{
		Scanner y=new Scanner(System.in);
		System.out.println("Enter rank:");
		rank=y.next();
	}
}
class Result extends Sports
{
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Sid:"+sid);
		System.out.println("****ACADEMIC****");
		System.out.println("English:"+eng);
		System.out.println("Maths:"+math);
		System.out.println("****SPORTS****");
		System.out.println("Spotts rank:"+rank);
	}
}
public class Marks1
{
	public static void main(String[] args)
	{
		Result Student=new Result();
		Student.display();
	}
}
