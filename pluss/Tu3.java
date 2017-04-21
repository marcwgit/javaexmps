// Tu3.java
import ch.aplu.turtle.*;

class Tu3
{
  Turtle joe = new Turtle();

  Tu3()
  {
    for (int i = 0; i < 4; i++)
    {
      joe.forward(100);
      joe.right(90);
    }
  }

  public static void main(String[] args)
  {
    new Tu3();
  }
}
