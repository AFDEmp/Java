public class TwoDArray {

	public static void main(String[] args) {


		/* Array trucks represent the different truck categories described by
		 * the number of available trucks and its' capacity
		 * e.g First truckCategory has two available trucks carrying up to 5 tones
		 */
		
		int trucks[][] = {{2,5}, {3,4}, {1,20}, {2,10}};

		int countTrucks = 0;
		for(int i=0; i<trucks.length; i++){
			countTrucks = countTrucks + trucks[i][0];
		}
		System.out.println("Count available trucks :" + countTrucks);

		int countTrucksOver6T = 0;

		for(int j=0; j<trucks.length; j++){
			if ((trucks[j][1])>6)
				countTrucksOver6T++;
		}		
		System.out.println("Count available trucks categories that can carry over 6 tonnes: " + countTrucksOver6T);

	}

}