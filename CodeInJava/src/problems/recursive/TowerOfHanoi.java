/**
 * 
 */
package problems.recursive;

/**
 * @author braj.kishore
 *
 */
public class TowerOfHanoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		towerOfHanoi(3,'A','C','B');//Move disks from 'A' to 'C' and use B as auxiliary tower
	}
	
	
	
	public static void towerOfHanoi(int discNum, char fromTower, char toTower,
			char auxTower) {

		/*
		 * Below are recursive steps till there are disc on tower
		 */

		if (discNum > 0) {
			// Move n-1 disks from fromTower to auxTower first using toTower as
			// auxiliary tower
			towerOfHanoi(discNum - 1, fromTower, auxTower, toTower);
			// Move n-th disk to target tower i.e fromTower to toTower
			System.out.println("Moving " + discNum + " :from: " + fromTower
					+ " :to: " + toTower);

			// Move n-1 disks from auxTower to toTower first using fromTower as
			// auxiliary tower
			towerOfHanoi(discNum - 1, auxTower, toTower, fromTower);
		}

	}

}
