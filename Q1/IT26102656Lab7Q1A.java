import java.util.Scanner;

public class IT26102656Lab7Q1A{
	public static void main (String[]args){
		
		int num = 1;
		double average, sum = 0, mark;
		String grade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter marks for four subjects : ");
		
		while (num <= 4){
			System.out.print("Enter Subject mark 0"+num+": ");
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
		
		System.out.println();
		System.out.println("Average is : "+average);
		System.out.println("Overall grade is : "+grade);
	}
}