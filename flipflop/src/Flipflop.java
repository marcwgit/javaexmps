// Flipflop.java

import ch.aplu.util.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.net.URL;

public class Flipflop
{
  // -------------- Inner class MyMouseAdapter -----------------
  class MyMouseAdapter extends MouseAdapter
  {
    public void mousePressed(MouseEvent evt)
    {
      double x = p.toWindowX(evt.getX());
      double y = p.toWindowY(evt.getY());
      SwitchEvent event = getSwitchEvent(x, y);
      if (event == SwitchEvent.NONE)
        return;
      State nextState = nextState(state, event);
      if (nextState != state)
      {
        state = nextState;
        showImage();
      }
    }
  }

  // -------------- Enumeration types --------------------------
  enum State {S0, S1, S2, S3, S4};
  /* S0: f00
   * S1: f01
   * S2: f10
   * S3: f11_off
   * S4: f11_on
   */
  enum SwitchEvent {E0, E1, E2, E3, NONE}
  /* E0: top on
   * E1: top off
   * E2: botton on
   * E3: botton off
   */

  // -------------- Instance variables -------------------------
  private GPanel p = new GPanel("RS Flip-Flop (www.aplu.ch) - Power on is random - Click on switch pins", 0, 100, 0, 100);
  private State state;

  private URL f00;
  private URL f01;
  private URL f10;
  private URL f11_off;
  private URL f11_on;

  // -------------- Ctor ---------------------------------------
  public Flipflop()
  {
    ClassLoader loader = getClass().getClassLoader();
    f00 = loader.getResource("f00.gif");
    f01 = loader.getResource("f01.gif");
    f10 = loader.getResource("f10.gif");
    f11_off = loader.getResource("f11_off.gif");
    f11_on = loader.getResource("f11_on.gif");
    if (Math.random() < 0.5)
      state = State.S3;
    else
      state = State.S4;
    showImage();
    p.enableRepaint(false);
    p.addMouseListener(new MyMouseAdapter());
  }

  private void showImage()
  {
    double x = 25;
    double y = 25;
    p.clear();
    switch (state)
    {
      case S0:
        p.image(f00, x, y);
        break;

      case S1:
        p.image(f01, x, y);
        break;

      case S2:
        p.image(f10, x, y);
        break;

      case S3:
        p.image(f11_off, x, y);
        break;

      case S4:
        p.image(f11_on, x, y);
        break;
    }
    p.repaint();
  }

  private State nextState(State s, SwitchEvent e)
  {
    switch (s)
    {
      case S0:
        if (e == SwitchEvent.E0)
          return State.S2;
        if (e == SwitchEvent.E2)
          return State.S1;
        break;

      case S1:
        if (e == SwitchEvent.E0)
          return State.S4;
        if (e == SwitchEvent.E3)
          return State.S0;
        break;

      case S2:
        if (e == SwitchEvent.E1)
          return State.S0;
        if (e == SwitchEvent.E2)
          return State.S3;
        break;

      case S3:
      case S4:
        if (e == SwitchEvent.E1)
          return State.S1;
        if (e == SwitchEvent.E3)
          return State.S2;
        break;
     }
     return s; // Unchanged
  }

  private SwitchEvent getSwitchEvent(double x, double y)
  {
    double range = 10; // Square of distance
    SwitchEvent[] events = {SwitchEvent.E0, SwitchEvent.E1,
                            SwitchEvent.E2, SwitchEvent.E3, SwitchEvent.NONE};
    Point2D.Double[] p = {new Point2D.Double(29, 79),
                          new Point2D.Double(29, 68),
                          new Point2D.Double(29, 40),
                          new Point2D.Double(29, 29)};

    for (int i = 0; i < 4; i++)
    {
      double d = (p[i].x - x) * (p[i].x - x) + (p[i].y - y) * (p[i].y - y);
      if (d < range)
        return events[i];
    }
    return events[4];  // NONE
  }

  public static void main(String[] args)
  {
    new Flipflop();
  }
}
