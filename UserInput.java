import java.util.Scanner;
class UserInput{
public static void main(String args[]){

	String sub1,sub2,sub3;
	int mark1,mark2,mark3,total=0;
       

	Scanner input = new Scanner(System.in);

	System.out.print("\n");	
	System.out.println("----Subject total calculator----\n");

	System.out.print("Enter your first Subject name: ");
	sub1 = input.nextLine();

	System.out.print("\n");	
	System.out.print(sub1+" marks: ");
	mark1 = input.nextInt();

	System.out.print("\n");	
	System.out.print("Enter your second Subject name: ");
	sub2 = input.next();

	System.out.print("\n");	
	System.out.print(sub2+" marks: ");
	mark2 = input.nextInt();

	System.out.print("\n");	
	System.out.print("Enter your third Subject name: ");
	sub3 = input.next();

	System.out.print("\n");	
	System.out.print(sub3+" marks: ");
	mark3 = input.nextInt();

	total= mark1+mark2+mark3;
	System.out.print("\n");	
	System.out.println(sub1+"   "+mark1);
	System.out.println(sub2+"   "+mark2);
	System.out.println(sub3+"   "+mark3);
 	System.out.println("\n");
	System.out.println("Total    "+total);

	}
}