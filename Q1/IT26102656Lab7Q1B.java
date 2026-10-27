import java.util.Scanner;

public class IT26102656Lab7Q1B{
	public static void main (String[]args){
		
		int studntCount = 1,num;
		double average, sum, mark;
		String grade;
		
		Scanner input = new Scanner(System.in);
		
		while (studntCount <= 3){
			System.out.println("Student " + studntCount);
			
			System.out.print("Enter marks : ");
			
			num = 1;
			sum = 0;
			
			while (num <= 4){
				
				mark = input.nextDouble();
				sum += mark;
				num++;
			}
			average = sum / 4;
		
			if(average >= 75){
				grade = "Distinction";
			}else if(average >= 50){
				grade = "Credit";
			}else{
				grade = "Fail";
			}
		
			System.out.println("Average is : "+average);
			System.out.println("Overoall grade is : "+grade);
			System.out.println();
			studntCount++;
		}
	}
}