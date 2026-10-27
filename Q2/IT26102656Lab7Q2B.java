public class IT26102656Lab7Q2B{
	public static void main (String[]args){
		
		for(int rowCount = 1; rowCount <= 5; rowCount++){
			
			System.out.print(rowCount+" - ");
			
			for(int columnCount = 1; columnCount <= rowCount; columnCount++){
		
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}
	}
}