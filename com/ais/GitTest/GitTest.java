package com.ais.GitTest;


public class GitTest {

  // constants
  public static final int DFLT_ITERATIONS = 10;
  public static final int DFLT_DELAY = 2000;

  // constructor
  public GitTest() throws Exception {

  }

  
  // main
  public static void main( String[] args ) {

    // initialize with defaults
    int iterations = DFLT_ITERATIONS;
    int delay = DFLT_DELAY;

    // check if we've got the proper args
    if(args.length < 2) {
      System.out.println("Usage: com.ais.dds.TestDDS.TestPublisher iterations ms_delay");
      System.out.println("Using " + DFLT_ITERATIONS + " " + DFLT_DELAY);
    }
    else {
      iterations = Integer.parseInt(args[0]);
      delay = Integer.parseInt(args[1]);
    }

    try {
      System.out.println("Kicking off GitTest to run " + iterations + " iterations with a delay of " + delay + " ms");

      // write out the configured number of messages
      for(int cnt = 0; cnt<iterations;cnt++) {
        // wait for defined number of milliseconds between writes
        Thread.sleep(delay);

        // write out the message
        int iter = cnt+1;
        System.out.println("Iteration #" + iter);
      }

    }
    catch(Exception ex) {
      System.out.println("Caught unhandled exception: " + ex);
    }
  }
}
