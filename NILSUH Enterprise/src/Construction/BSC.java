package Construction;
/**
 * 
 * @author orley
 *
 */

public class BSC {
	
	//to determine the materials required for beams, columns and slabs
	
	public static String estBSC(Double s, float l, float w, float h) {
		
		Double vol = l * w * h * 1.5;
		Double cement, sand, gravel;
		
		if(s == 4000){
			Double vol_1 = (vol / 4);
			cement = vol_1 / 1.23;
			sand = vol_1 / 1;
			gravel = vol_1 * 2;
		}
		else if(s == 3000){
			cement = (vol / 5.5) * 1.23;
			sand = (vol / 5.5) * 1.5;
			gravel = (vol / 5.5)
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
