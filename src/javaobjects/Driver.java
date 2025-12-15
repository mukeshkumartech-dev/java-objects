package javaobjects;

public class Driver {

	public static void main(String[]args) {
		student student1=new student();
		student1.rollno=101;
		student1.name="Mukeshkumar";
		student1.age=20;
		student1.phone_no=9345536911l;
		
		System.out.println("Roll no:"+student1.rollno);
		System.out.println("Name:"+student1.name);
		System.out.println("Age:"+student1.age);
		System.out.println("phone no:"+student1.phone_no);
		
		
		student student2=new student();
		student2.rollno=102;
		student2.name="Naveen";
		student2.age=21;
		student2.phone_no=9345776911l;
		
		
		System.out.println("Roll no:"+student2.rollno);
		System.out.println("Name:"+student2.name);
		System.out.println("Age:"+student2.age);
		System.out.println("phone no:"+student2.phone_no);
		
	}
}
