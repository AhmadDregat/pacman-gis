package Algorithm;

import java.util.Comparator;

	public class dist_Comperator implements Comparator<Double> {

		/**
		 * comparator who knows how to compare two distance
		 */
		public int compare(Double d1, Double d2)   {
			// TODO Auto-generated method stub
			if (d1 < d2) {
				return -1;
			}
			if(d1 > d2) {
				return 1;
			}
			return 0;
		}
	}
