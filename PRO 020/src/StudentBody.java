import java.util.Scanner;
public class StudentBody {
	private static Student [] stud = new Student[3];
	public StudentBody()
{
   Student [] stud = new Student[3];
}
	public void init(){
		String name;
		int ID;
		double GPA;
		Scanner IO = new Scanner(System.in);
		for (int k = 0; k<3; k++){
			
			System.out.println("Student " + k + " Name: ");
			name = IO.next() + IO.next();
			
			System.out.println("Student " + k + " ID: ");
			ID = IO.nextInt();
			
			System.out.println("Student " + k + " GPA: ");
			GPA = IO.nextDouble();
			
			stud[k] = new Student (ID, name, GPA);
		}
		
	}
	public void search(){
	     Scanner IO =  new Scanner(System.in); 
	     System.out.println("Search for ID");
	     int id = IO.nextInt(); int k = 0;
		for(int i = 0; i < 3; i++)
	      {
	         if (stud[i].getID() == id)
	            System.out.println(stud[i]);
	            else k++;
	      }
	      if (k == 3) System.out.println("Not Found in System");
	   }
	public String toString()
	   {
	      return "Array Contents\n|     Student 1      |\n" + "Name: " + stud[0].getName() +
	          "\nID Number: " + stud[0].getID() +
	          "\nGrade Point Average: " + stud[0].getGPA() +
	          "\n|     Student 2      |\n" + "Name: " + stud[1].getName() +
	          "\nID Number: " + stud[1].getID() +
	          "\nGrade Point Average: " + stud[1].getGPA() +
	          "\n|     Student 3      |\n" + "Name: " + stud[2].getName() +
	          "\nID Number: " + stud[2].getID() +
	          "\nGrade Point Average: " + stud[2].getGPA();
	   }
}