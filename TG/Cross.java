
 class Cross extends TurtleGraphicsWindow
  {
      public void myTurtleCmds( )
      {
          forward( 100 );
          back( 200 );
          forward( 100 );
          right( 90 );
          forward( 100 );
          back( 200 );
      }

      // program starts here
      public static void main ( String[ ] args )  
      {
          Cross obj = new Cross( );
          obj.myTurtleCmds( );
      }
  } // end class Cross
