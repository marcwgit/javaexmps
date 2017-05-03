import java.util.Scanner;
import java.io.InputStreamReader;
import java.lang.*;

class Sec5Ex3 {

	public static void main(String args[])	
	{
		Integer lines = new Integer(4); 
		IsoTriangle(lines);
		
		
	}
	
	static void IsoTriangle (Integer level){
		Integer bottomWidth = (level*2)-1;
		System.out.println(level);
		for (int i=0; i < level; i++){
		
			Spaces(level-1);
			DrawBar((level*2)+1);	
			
			
			bottomWidth -=2;
			

		}
		
		
	}
	
	static void DrawBar(Integer max){
		
		System.out.println(max);
		for (int i=0;i < max; i++){
		System.out.print("*");
		}
		
		System.out.println("");
	}
	
	static void Spaces(Integer max){
		
		System.out.println(max);
		for (int i=0;i < max; i++){
			System.out.print(" ");
			}
			
			System.out.println("");
	}
	
}
	
	
