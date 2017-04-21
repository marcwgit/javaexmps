
//DRAW CARDS
package TurtleGraphics;

import java.awt.Color;
import java.util.Random;

public class drawcards 
{
	public int Drawcard (StandardPen pen)
	{
		pen.down();
		Random generator=new Random();
		String cardValue="";
		int number, suit = 0;

		number=generator.nextInt(13)+1;
		if(number==1)
		{
			cardValue="A";
			number=11;
		}
		else if(number==11)
		{
			cardValue="J";
			number=10;
		}
		else if(number==11)
		{
			cardValue="Q";
			number=10;
		}
		else if(number==13)
		{
			cardValue="K";
			number=10;
		}
		else
		{
			cardValue=cardValue+number;
		}
		pen.setDirection(0);
		pen.move(150);
		pen.setDirection(90);
		pen.move(250);
		pen.setDirection(180);
		pen.move(150);
		pen.setDirection(270);
		pen.move(250);
		pen.up();
		pen.setDirection(0);
		pen.move(10);
		pen.setDirection(90);
		pen.move(10);



		
		pen.drawString(cardValue);

		//move to where other 10 is drawn
		pen.up();
		pen.setDirection(0);
		pen.move(120);
		pen.setDirection(90);
		pen.move(220);



		pen.drawString(cardValue);


		//move to where each suit will be drawn
		pen.up();
		pen.setDirection(180);
		pen.move(68);
		pen.setDirection(270);
		pen.move(110);
		//pen.setDirection





	
		if(suit==1)
			DrawDiamond(pen);
		if(suit==2)
			DrawHeart(pen);
		if(suit==3)
			DrawClubs(pen);
		if(suit==4)
			DrawSpades(pen);


		return(number);


	}
	public void DrawSpades(StandardPen pen)
	{
		//CLUBS
		pen.setWidth(20);
		pen.down();
		pen.setDirection(270);
		pen.move(40);
		pen.up();
		pen.setDirection(180);
		pen.move(50);
		pen.down();
		pen.setDirection(0);
		for(int count=1; count<=360; count++){
			pen.move(45);
			pen.turn(180);
			pen.move(45);
			pen.turn(1);}
		pen.down();



	}
	public void DrawDiamond(StandardPen pen)
	{
		//DIAMOND

		pen.down();
		pen.setWidth(60);
		pen.setDirection(45);
		pen.move(3);
		pen.up();
		pen.setWidth(2);
		pen.setDirection(0);
		pen.move(50);
		pen.setDirection(270);
		pen.move(120);
		pen.setDirection(0);
		pen.move(70);
		pen.down();
		//move to where next card is drawn


	}

	public void DrawHeart(StandardPen pen)
	{
		//HEARTS
		pen.up();
		pen.setDirection(90);
		pen.move(30);
		pen.setDirection(0);
		pen.move(35);
		pen.down();
		pen.setColor(Color.red);
		pen.setWidth(2);
		pen.setDirection(0);
		for(int count=1; count<=360; count++){
			pen.move(45);
			pen.turn(180);
			pen.move(45);
			pen.turn(1);}
		pen.up();
		pen.setDirection(180);
		pen.move(7);
		pen.down();

		pen.setColor(Color.red);
		pen.setWidth(2);
		pen.setDirection(180);
		pen.move(40);
		pen.down();

		pen.setColor(Color.red);
		pen.setWidth(2);
		for(int count=1; count<=360; count++){
			pen.move(45);
			pen.turn(180);
			pen.move(45);
			pen.turn(1);}

		pen.setColor(Color.red);
		pen.setWidth(53);
		pen.setDirection(180);
		pen.move(15); //
		pen.setDirection(310);
		pen.move(55);
		pen.setDirection(40);
		pen.move(47);	}
 //        pen.down();
	
	public void DrawClubs(StandardPen pen)
	{
		pen.up();
		pen.setDirection(270);
		pen.move(30);
		pen.down();
		pen.setWidth(10);
		pen.setDirection(0);
		pen.move(12);
		pen.setDirection(135);
		pen.move(10);
		pen.setDirection(225);
		pen.move(9);
		pen.up();
		pen.setDirection(90);
		pen.move(13);
		pen.setDirection(0);
		pen.move(8);
		pen.down();
		pen.setWidth(7);
		pen.setDirection(180);
		pen.move(10);
		pen.setDirection(0);
		for(int count=1; count<=360; count++){
			pen.move(15);
			pen.turn(180);
			pen.turn(1);}
		pen.setDirection(180);
		pen.move(10);
		pen.setDirection(90);
		for(int count=1; count<=360; count++){
			pen.move(15);
			pen.turn(180);
			pen.turn(1);}
		pen.setDirection(90);
		pen.move(10);
		pen.setDirection(180);
		for(int count=1; count<=360; count++){
			pen.move(15);
			pen.turn(180);
			pen.turn(1);}
		pen.down();


	}
}
