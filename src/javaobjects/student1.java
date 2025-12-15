package javaobjects;

public class student1 {
	int rollno;
	String name;
	int age;
	long phone_no;
	
	public   student1(int rollno,String name,int age1,long phone_no1) {
		this.rollno=rollno;
		this.name=name;
		age=age1;
		phone_no=phone_no1;		
	}
	void display() {
		System.out.println("Roll no:="+rollno);
		System.out.println("Name="+name);
		System.out.println("Age:="+age);
		System.out.println("Phone no:="+phone_no);
	}

}
