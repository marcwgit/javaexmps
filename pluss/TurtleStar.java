
import ch.aplu.turtle.*;

class TurtleStar
{
  public static void main(String[] args)
  {
    Turtle t = new Turtle();
    for (int n = 1; n < 50; n++)
    {
      t.forward(100);
      t.left(110);
    }
  }
}
