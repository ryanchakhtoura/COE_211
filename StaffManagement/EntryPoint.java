import java.util.*;
import java.lang.Math;
public class EntryPoint {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in); 

	int i = 0;
	int rand = (int)(Math.random() * 10);
		while (i<rand){
	System.out.print("Please input the employee's first name: ");  
		String FirstName= sc.next();  


	System.out.print("Please input the employee's last name: ");  
		String LastName= sc.next();

	System.out.print("Please input the employee's age: ");  
		int Age= sc.nextInt();

	System.out.print("Please input the employee's Monthly Salary: ");  
		double MonthlySalary= sc.nextDouble();
	System.out.println("Employee information:" + FirstName + " " + LastName + ", " + Age + ", " + MonthlySalary);
        	i++;
		int Executions = rand-i;
        System.out.println("You have " + Executions + " insertions left");
                
		}
	}
}