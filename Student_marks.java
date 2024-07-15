import java.util.Scanner;
class  Student_marks
{
	 void Student_details(String name,int a, int marks1, int marks2, int marks3, int marks4)
	{
		        System.out.println("Student name= " + name);
				System.out.println("Student Rollno= " + a);
				System.out.println("Physics marks= " + marks1);
				System.out.println("Chemistry marks= " + marks2);
				System.out.println("Maths marks= " + marks3);
				System.out.println("Cs marks= " + marks4);

	}

	void total_marks(int marks1, int marks2, int marks3, int marks4)
	{
		int x= (marks1 +marks2 +marks3 +marks4 );
		System.out.println("Total marks= " + x);
		
	}

	void Percentage(int marks1, int marks2, int marks3, int marks4)
	{
		double x=(marks1 +marks2 +marks3 +marks4 )*(0.25);
		 System.out.println("Percentage= "+ x);
		
	}

	
	void Elegibility(int marks1, int marks2, int marks3, int marks4)
	{
		
		 if(marks1>=35 && marks2>=35 && marks3>=35 && marks4>=35)
			    {
					System.out.println("your are elegible for next Sem");
			    }
				else
					System.out.println("Not elegible for next Sem");

	
	}

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		Student_marks sm= new Student_marks();
		System.out.println("Enter student name: ");
		String a = scan.nextLine();
		System.out.println("Enter roll number: ");
		int b = scan.nextInt();
		System.out.println("Physics score: ");
		int c = scan.nextInt();
		System.out.println("Chemistry score: ");
		int d = scan.nextInt();
		System.out.println("Maths score: ");
		int e = scan.nextInt();
		System.out.println("Cs score: ");
		int f = scan.nextInt();
		do
		{
		System.out.println("******");
		System.out.println("Bhavishya:");
		System.out.println("1. Student details");
		System.out.println("2. Total marks");
		System.out.println("3. Percentage");
		System.out.println("4. Next sem elegibility");
		System.out.println("5. Exit");
		System.out.println();
		System.out.println("Enter your choise of calculation[1-5]");
		int choice=scan.nextInt();
		System.out.println("******");
		
		switch(choice)
		{
			case 1:
				sm.Student_details(a,b,c,d,e,f);
			  
				break;
				
		    case 2:
				sm.total_marks(c,d,e,f);
			    
				break;
				
			case 3:
				sm.Percentage(c,d,e,f);
			   
				break;

			case 4:
				sm.Elegibility(c,d,e,f);
			   
				break;

			case 5:
			
				return;

			default :
				
			    System.out.println("Invalid choice");
				break;
		}
		}while(true);
	}
}
