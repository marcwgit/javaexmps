// Tu4.java
import ch.aplu.turtle.*;

class Tu4
{
  Turtle joe = new Turtle();

  Tu4()
  {
    for (int k = 0; k < 10; k++)
    {
      for (int i = 0; i < 4; i++)
      {
        joe.forward(100);
        joe.right(90);
      }
      joe.left(36);
    }
  }

  public static void main(String[] args)
  {
    new Tu4();
  }
}
