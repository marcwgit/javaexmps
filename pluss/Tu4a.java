// Tu4a.java, Swiss flag
import ch.aplu.turtle.*;
import java.awt.Color;

class Tu4a
{
  Turtle joe = new Turtle();

  Tu4a()
  {
    joe.setPos(-50, 50);
    joe.setColor(Color.red);
    joe.setPenColor(Color.red); 
    for (int k = 0; k < 4; k++)
    {
      for (int i = 0; i < 3; i++)
      {
        joe.forward(100);
        joe.right(90);
      }
      joe.left(180);
    }
    joe.setFillColor(Color.red);
    joe.fill(-60, 60);
    joe.hideTurtle();
  }

  public static void main(String[] args)
  {
    new Tu4a();
  }
}

