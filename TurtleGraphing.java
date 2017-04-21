//Naveen Rajshekhar
//2/11/11
//turtle graphing driver
import TerminalIO.KeyboardReader;
import java.lang.Math;
import java.awt.Color;
import TurtleGraphics.*;
public class TurtleGraphing{
  public static void main(String[]args){
    KeyboardReader reader = new KeyboardReader();
    StandardPen pen = new StandardPen();
	 Color white = new Color(250,250,250);
	 double scale =1.0;
	 double scaleNum = 1;
	 double scaleMarker = 0;
	 double xScale = 0;
	 double yScale = 0;
    double x=0;
	 double xMax = 400;
	 double yMax = 400;
	 double xMin = -400;
	 double yMin = -400;
	 double y=0;
	 char rerun = 'y';
	 while(rerun == 'y'){
	 scale = reader.readDouble("Enter the scale: ");
	 scaleNum = 800/scale;
	 //clear screen
	 pen.up();
	 pen.move(-700,-700);
	 pen.setColor(white);
	 pen.setWidth(2000);
	 pen.down();
	 pen.move(700,700);
	 //x and y axis
	 pen.setWidth(2);
	 pen.setColor(Color.blue);
	 pen.up();
	 pen.move(0,-400);
	 pen.down();
	 pen.move(0,400);
	 pen.up();
	 pen.move(-400,0);
	 pen.down();
	 pen.move(400,0);
	 pen.up();
	 pen.move(-350,-10);
	 //pen.drawString("-"+ scaleMarker);
	 //draw x axis tick marks
	 for(double i = xMin; i <= xMax; i+=50){
	   if(i!=0){
	     pen.up();
		  pen.move(i);	
		  pen.move(i,3);
		  pen.down();
		  pen.drawString((i/50)*(scale/8) +" ");
	   }
    }
	 pen.up();
	 char choice = reader.readChar("Press \n(a) for function y = x \n(b) for function y = x^2 \n(c) for function y = mx + b \n(d) for y = x ^n \n(e) for function y = 1.5^x \n(f) for function y = x^3 \nYour choice: ");
	 
	 //graph function y = x
	 pen.setWidth(1);
	 if(choice == 'a'){
	   //draw y axis tick marks
		pen.home();
	   for(double j = xMin; j <= xMax; j += 50){
	     pen.up();
		  pen.move(j);
		  pen.move(3,j);
		  pen.down();
		  pen.drawString((j/50)*(scale/8) +" ");
	   }

	 	pen.setColor(Color.red);            
	   pen.up();
		pen.move(-400.0,-400.0);
	   for (x = -1*scale; x <= scale; x++){
		  //xScale = x*scaleNum;
		  //yScale = y*scaleNum;
	     pen.up();
		  //pen.move(xMin,yMin);
	     y = x;
		  pen.down();
		  pen.move((400.0*x)/scale,(400.0*y)/scale);
	   }
	 }
	 //graph for function y = x^2
	 else if(choice == 'b'){
	   //draw y axis tick marks
		pen.home();
	   for(double j = xMin; j <= xMax; j += 50){
	     pen.up();
		  pen.move(j);
		  pen.move(3,j);
		  pen.down();
		  pen.drawString((j/50)*(scale*scale/8) +" ");
	   }

	   pen.setColor(Color.green);
	   pen.up();
		pen.move(-400.0,400.0);
	   for(x = -1*scale; x <= scale; x++){
		  //xScale = scaleNum*x;
		  //yScale = scaleNum*y;
	     pen.up();
		  y = (x*x);
		  pen.down();
		  pen.move(400.0*x/scale,(400.0*y)/(scale*scale));
	   }
	 }
	 //graph for y = x^3
	 else if(choice == 'f'){
	   //draw y axis tick marks
		pen.home();
	   for(double j = xMin; j <= xMax; j += 50){
	     pen.up();
		  pen.move(j);
		  pen.move(3,j);
		  pen.down();
		  pen.drawString((j/50)*(scale*scale*scale/8) +" ");
	   }
		
      pen.setColor(Color.black);
	   pen.up();
		pen.move(-400.0,-400.0);
	   for(x = -1*scale; x <= scale; x++){
		  //xScale = scaleNum*x;
		  //yScale = scaleNum*y;
	     pen.up();
		  y = (x*x*x);
		  pen.down();
		  pen.move(400.0*x/scale,(400.0*y)/(scale*scale*scale));
	   }


	  	 }
	 //graph for y = mx + b
	 else if(choice == 'c'){
	   pen.home();
	   double m = reader.readDouble("Enter the value for m: ");
		double b = reader.readDouble("Enter the value for b: ");
		//pen.move(0,b);
		//draw y axis tick marks
		pen.home();
	   for(double j = xMin; j <= xMax; j += 50){
	     pen.up();
		  pen.move(j);
		  pen.move(3,j);
		  pen.down();
		  pen.drawString((j/50)*((m*scale+b)/8) +" ");
	   }
		
      pen.setColor(Color.black);
	   pen.up();
		pen.move(-400.0,(400.0*((-m*scale)+b))/(m*scale+b));
	   for(x = -1*scale; x <= scale; x++){
		  //xScale = scaleNum*x;
		  //yScale = scaleNum*y;
	     pen.up();
		  y = (m*x+b);
		  pen.down();
		  pen.move(400.0*x/scale,(400.0*y)/(m*scale+b));
	   }

	 }
	 //graph for y = x^n
	 else if(choice == 'd'){
	 	double n = 0;
	   n = reader.readDouble("enter the value of n: ");
	   //draw y axis tick marks
		pen.home();
	   for(double j = xMin; j <= xMax; j += 50){
	     pen.up();
		  pen.move(j);
		  pen.move(3,j);
		  pen.down();
		  pen.drawString((j/50)*(Math.pow(scale,n)/8) +" ");
	   }
	
      pen.setColor(Color.cyan);
	   pen.up();
		if(n % 2 == 0)
		  pen.move(-400.0,400.0);
		else
		  pen.move(-400.0,-400.0);
	   for(x = -1*scale; x <= scale; x++){
		  //xScale = scaleNum*x;
		  //yScale = scaleNum*y;
	     pen.up();
		  y = Math.pow(x,n);
		  pen.down();
		  pen.move(400.0*x/scale,(400.0*y)/(Math.pow(scale,n)));
	   }


	 }
	 //graph for y = 1.5^x
	 else{
	   //draw y axis tick marks
		pen.home();
	   for(double j = xMin; j <= xMax; j += 50){
	     pen.up();
		  pen.move(j);
		  pen.move(3,j);
		  pen.down();
		  pen.drawString((j/50)*(Math.pow(1.5,scale)/8) +" ");
	   }
		
      pen.setColor(Color.orange);
	   pen.up();
		pen.move(-400.0,Math.pow(1.5,-400.0));
	   for(x = -1*scale; x <= scale; x++){
		  //xScale = scaleNum*x;
		  //yScale = scaleNum*y;
	     pen.up();
		  y = Math.pow(1.5,x);
		  pen.down();
		  pen.move(400.0*x/scale,(400.0*y)/(Math.pow(1.5,scale)));
	   }


	 }
	 rerun = reader.readChar("Would you like to see another graph? (y/n) ");
	 }
  }
}
