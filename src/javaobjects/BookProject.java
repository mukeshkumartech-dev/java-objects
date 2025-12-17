package javaobjects;
import java.util.Scanner;
class book{
	double Price=0;
	Scanner sc=new Scanner(System.in);
	
    public void payment() {
    	System.out.println("Are sure you Place the order(yes/no) ");
    	String input=sc.nextLine();
    	switch(input) { 
    	case "yes":
    		System.out.println("Enter the Name");
    		String name=sc.nextLine();
    		System.out.println("Enter your Location");
    		String adds=sc.nextLine();
    		System.out.println(" Pay the amount"+Price);
    		 int pay=sc.nextInt();
             if(Price==pay) {
             	 System.out.println("Your order is placed!");
             	 System.out.println("+--------------------------+");
             	 System.out.println("Ordered by:-"+name);
             	 System.out.println("Delivered Address:-"+adds);
             	 System.out.println("+--------------------------+");
                  
             }else {
                  System.out.println("Pay the correct amount");
                   pay=sc.nextInt();
                   System.out.println("Your order is placed!");
              	 System.out.println("+--------------------------+");
              	 System.out.println("Ordered by:-"+name);
              	 System.out.println("Delivered Address:-"+adds);
              	 System.out.println("+--------------------------+");
             }
    		
    	case "No":
    		
    		
    	
    	}
    	
    }
	public void PrideandPrejudice() {
		Price=1500;
		System.out.println("Author        : Jane Austen");
		System.out.println("Published Year: 1813");
		System.out.println("The Price of the Book is:="+Price);
		
		
	}
	public void EveryoneHasaStory() {
		Price=350;
		System.out.println("Author        : Savi Sharma");
		System.out.println("Published Year: 2015");
		System.out.println("The Price of the Book is:="+Price);
	}
	
	public void Witches() {
		Price=800;
		System.out.println("Author        : Deborah Harkness");
		System.out.println("Published Year: 2011");
		System.out.println("The Price of the Book is:="+Price);
	}
	
	public void Witchmark() {
		Price=1200;
		System.out.println("Author        : C.L. Polk");
		System.out.println("Published Year: 2018");
		System.out.println("The Price of the Book is:="+Price);
	}
	
	public void TheOtherSide() {
		Price=600;
		System.out.println("Author        : Faraaz Kazi & Vivek Banerjee");
		System.out.println("Published Year: 2013");
		System.out.println("The Price of the Book is:="+Price);
	}
	public void TheDevourers() {
		Price=900;
		System.out.println("Author        : Indra Das");
		System.out.println("Published Year: 2015");
		System.out.println("The Price of the Book is:="+Price);
	}
	
	public void TheCalcuttaChromosome() {
		Price=550;
		System.out.println("Author        : Amitav Ghosh");
		System.out.println("Published Year: 2015");
		System.out.println("The Price of the Book is:="+Price);
	}
	
	public void ProjectHailMary() {
		Price=600;
		System.out.println("Author        :Andy Weir");
		System.out.println("Published Year: 2021");
		System.out.println("The Price of the Book is:="+Price);
	}
	
	public void TheBookofColdCases() {
		Price=800;
		System.out.println("Author        :Simone St.James");
		System.out.println("Published Year: 2022");
		System.out.println("The Price of the Book is:="+Price);
	}
	
	public void TheSunDownMotel() {
		Price=700;
		System.out.println("Author        :Simone St. James");
		System.out.println("Published Year: 2020");
		System.out.println("The Price of the Book is:="+Price);
	}
	
	
	
}
public class BookProject {
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		book b1=new book();
		System.out.println(" Welcome to Books store");
		System.out.println("Select the Genre");
		System.out.println("1.Love Story");
		System.out.println("2.Fantacy");
		System.out.println("3.Horror");
		System.out.println("4.Science Fiction");
		System.out.println("5.Mystery");

		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:{
			System.out.println("\nSelect the Book");
			System.out.println("1.Pride and Prejudice");
			System.out.println("2.Everyone Has a Story");
			int num=sc.nextInt();
			if(num==1) {
				b1.PrideandPrejudice();
				sc.nextLine();
				b1.payment();
			
			}else if(num==2){
				b1.EveryoneHasaStory();
			
			}else 
				System.out.println("invalid book");		
		}
		case 2:{
			System.out.println("\nSelect the Book");
			System.out.println("1.A Discovery of Witches");
			System.out.println("2.Witchmark");
			int num=sc.nextInt();
			if(num==1) {
				b1.Witches();
				sc.nextLine();
				b1.payment();
			
			}else if(num==2){
				b1.Witchmark();
				b1.payment();
			}else 
				System.out.println("invalid book");		
		}
		
		case 3:{
			System.out.println("\nSelect the Book");
			System.out.println("1.The Other Side");
			System.out.println("2.The Devourers");
			int num=sc.nextInt();
			if(num==1) {
				b1.TheDevourers();
				sc.nextLine();
				b1.payment();
			
			}else if(num==2){
				b1.TheOtherSide();
				b1.payment();
			}else 
				System.out.println("invalid book");			
		}
		
		case 4:{
			System.out.println("\nSelect the Book");
			System.out.println("1.The Calcutta Chromosome");
			System.out.println("2.Project Hail Mary");
			int num=sc.nextInt();
			if(num==1) {
				b1.TheCalcuttaChromosome();
				sc.nextLine();
				b1.payment();
			
			}else if(num==2){
				b1.ProjectHailMary();
				b1.payment();
			}else 
				System.out.println("invalid book");		
		}
		
		case 5:{
			System.out.println("\nSelect the Book");
			System.out.println("1.The Book of Cold Cases");
			System.out.println("2.The Sun Down Motel");
			int num=sc.nextInt();
			if(num==1) {
				b1.TheCalcuttaChromosome();
				sc.nextLine();
				b1.payment();
			
			}else if(num==2){
				b1.ProjectHailMary();
				b1.payment();
			}else 
				System.out.println("invalid book");		
		}
			
	}
						
	}
}
		
		
	

