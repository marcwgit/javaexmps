public class PSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testNumber;
		PerfectSquare mySquare = new PerfectSquare();
		testNumber = mySquare.getInputInt("Enter integer");
		
		if (false==mySquare.squareCheck(testNumber)){
			System.out.println("not square");}
			else
			{
			System.out.println("is square");
		}
				
	
	}

}
