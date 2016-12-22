package TurtleGraphics;

import java.text.DecimalFormat;

public class p3EX18 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		KeyboardReader reader = new KeyboardReader();
		DecimalFormat df=new DecimalFormat("0.00");
		int numberofgrades, total=0;
		double average;
		System.out.println("How many grades?");
		numberofgrades=reader.readInt();
		int grade, count=1;
		System.out.println("Enter a grade:");
		grade=reader.readInt();
		while(grade!=-1)
		{
			if(grade<0)||(grade>100){
				System.out.println(""+grade+" is not acceptable");
			}
			total=total+grade;
			count++;
			System.out.println("Enter a grade:");
			grade=reader.readInt();
		}
		System.out.println("Total is "+total+"" );
		average=(double)total/numberofgrades;
		System.out.println("The average is "+df.format(average)+"");
	}

}

    Contact GitHub API Training Shop Blog About 


