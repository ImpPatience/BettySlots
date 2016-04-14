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
  
  public ArrayList<ArrayList> spin () {
    ArrayList<ArrayList> output = new ArrayList<>();
    
    // add the new arrays
    for (int reelIndx = 0; reelIndx < numOfReels; reelIndx++) {
      // create the first reel
      ArrayList<Symbol> curReel = new ArrayList<>();
      
      // add a bunch of turns
      
      
      // add to the output
      output.add(curReel);
    } // end for (int reelIndx = 0; reelIndx < numOfReels; reelIndx++)
    
    return output;
  } // end public ArrayList<ArrayList> spin
  
} // end public class Reels
