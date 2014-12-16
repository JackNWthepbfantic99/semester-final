import org.asl.karelx.Wanderer;
import org.asl.karelx.Uberbot;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import java.util.Scanner;


/**
 * Represents a horse wandering around aimlessly in a pasture
 *
 */
public class Horse extends Wanderer {

	//  TODO Add one or more constructors, as needed
	   public Horse(int i, int j){
         super(i, j);
      }

	/**
	 * Wander around in random directions until a specified number of steps have been taken.
	 * At regular intervals specified by timer, drop a beeper.
	 * 
	 * @param count		the total number of steps to take
	 * @param timer		the interval at which to drop a beeper
	 * 
	 * Ex. horse.wander(13, 4) should drop a beeper every four steps until thirteen steps are taken
	 */
    Scanner scnr = new Scanner(System.in);
	public void wander(int count, int timer) {
		// TODO You implement this
      
      for(int count  
      
      System.out.println("Enter how many steps the Horse should take before it relieves itself: ");
      timer = scnr.nextInteger();
      
      
	}
}
