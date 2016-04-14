/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bettyslots;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Michael Woodward
 */
public class Reels {
  
  // private variables
  private Random rand;
  private int    numOfReels;
  private int    heightOfReel;

  public Reels (int numOfReels, int heightOfReels) {
    this.numOfReels   = numOfReels;
    this.heightOfReel = heightOfReels;
    rand              = new Random(System.nanoTime());
  } // end public Reels
  
  public ArrayList[] spin () {
    return null;
  } // end public ArrayList[] spin
  
} // end public class Reels
