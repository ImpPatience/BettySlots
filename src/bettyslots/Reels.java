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
  private int    reelSize;

  public Reels (int numOfReels, int heightOfReels) {
    this.numOfReels   = numOfReels;
    this.heightOfReel = heightOfReels;
    reelSize          = heightOfReels * Symbol.values().length;
    rand              = new Random(System.nanoTime());    
  } // end public Reels
  
  public ArrayList<ArrayList<Symbol>> spin () {

    // the output
    ArrayList<ArrayList<Symbol>> output = new ArrayList<>();

    output = spinFiller(output);
    
    return output;
  } // end public ArrayList<ArrayList<Symbol>> spin
  
  private ArrayList<ArrayList<Symbol>> spinFiller (ArrayList<ArrayList<Symbol>> output) {
    // how many turns each reel will turn
    int turns  = rand.nextInt(heightOfReel*heightOfReel) * reelSize;

    // add the new arrays
    for (int reelIndx = 0; reelIndx < numOfReels; reelIndx++) {
      // create the first reel
      ArrayList<Symbol> curReel = new ArrayList<>();
      // update the turns so progressively more
      if (reelIndx > 0) {
        turns += reelSize * rand.nextInt(heightOfReel);
        turns += (int) (reelSize * rand.nextDouble());
      } // end if (reelIndx > 0)
            
      // add a bunch of symbols to the reel
      for (int x = 0; x < turns; x++) {
        curReel.add(Symbol.values()[rand.nextInt(Symbol.values().length)]);        
      } // end for (int x = 0; x < turns; x++)
      
      // add to the output
      output.add(curReel);
    } // end for (int reelIndx = 0; reelIndx < numOfReels; reelIndx++)
    
    return output;    
  } // end private ArrayList<ArrayList<Symbol>> spinFiller ...
  
} // end public class Reels
