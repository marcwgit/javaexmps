
// TuApplet1.java

import javax.swing.*;
import ch.aplu.turtle.*;

public class TuApplet1 extends JApplet implements Runnable
{
  private Turtle t;

  public void init()
  {
    TurtleArea ta = new TurtleArea(this);
    t = new Turtle(ta);
  }

  public void start()
  {
    new Thread(this).start();
  }

  public void run()
  {
    t.showTurtle();
    for (int j = 0; j < 10; j++)
    {
      for (int i = 0; i < 4; i++)
      {
        t.forward(100);
        t.right(90);
      }
      t.left(36); 
    }   
  }
}
