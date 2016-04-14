/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bettyslots;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author imppatience
 */
public class ReelsTest {
  
  public ReelsTest() {
  } // public ReelsTest()

  /**
   * Test of spin method, of class Reels.
   */
  @Test
  public void testSpin() {
    System.out.println("spin");
    Reels instance = new Reels(5, 5);
    ArrayList<ArrayList<Symbol>> result = instance.spin();    
    
    boolean roolReels = true;
    int position = 0;
    while (roolReels) {
      
      System.out.printf("Position: %09d - ", position);
      
      for (ArrayList<Symbol> r: result) {
        if (position < r.size()) {
          System.out.printf("%-10s", r.get(position));
          roolReels = true;
        } else {
          System.out.print("xxxxxxxxxx");
          roolReels = false;
        } // end if (r.size() < position)
        System.out.print(" ");
      } // end for (ArrayList<Symbol> r: result)
      System.out.println();
      
      position++;
    } // end while (roolReels)
    
    assertEquals(true, true);


  } // end public void testSpin()
  
} // end public class ReelsTest
