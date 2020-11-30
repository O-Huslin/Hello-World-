package Construction;
/**
 * 
 */

/**
 * @author orley
 *
 */
public class Estimate_Materials{
	
/*	
	//calculates the estimate of materials for the construction of a wall given the length and width 
	public static String estQuan(float l, float h) {

		//to determine the area of the wall
		float area = l*h;
		
		//calculates the number of blocks required for the job
		Double blocks = Math.ceil(area/1.0625);
		System.out.println("Number of blocks: " + blocks + "\n");
		
		//calculates the volume of 1/2 inch steel required for the vertical construction in cubic meter
		Double vert = (((l * 12) / 16) + 1) * (h + 6) * 0.668;
		System.out.println("Volume of vertical (1/2 inch) steel (cubic feet): " + vert + "\n");
		
		//calculates the volume of 3/8 inch steel required for the horizontal construction in cubic meter 
		Double horiz = ((h * 12) / 24) * l * 0.375;
		System.out.println("Volume of horizontal (3/8 inch) steel (cubic feet): " + horiz + "\n");
		
		//calculates the volume of mortar required in cubic feet
		Double mortar = (l * h) * 0.04265;
		System.out.println("Volume of mortar (cubic feet): " + mortar + "\n");
		
		//calculates the number of bags of cement required for the joints
		Double j_cement = Math.ceil((((1.5 * mortar) / 4) / 1.23));
		System.out.println("Number of bags of cement fro joints: " + j_cement + "\n");
		
		//calculates the volume of sand required for the joints 
		Double j_sand = (((1.5 * mortar) / 4) * 3);
		System.out.println("Volume of sand in joint (cubic feet): " + j_sand + "\n");
		
		//calculates the volume of concrete required for the construction  
		Double p_concrete = Math.ceil(((l * h) * 0.23622));
		System.out.println("Volume of concrete required (cubic feet): " + p_concrete + "\n");
		
		//general calculation for the pockets 
		Double p = (1.5 * p_concrete) / 10;
		
		//calculation of the number of bags of cement for the pockets of the blocks
		Double p_cement = Math.ceil(p / 1.23);
		System.out.println("Number of bags of cement for pockets: " + p_cement + "\n");
		
		//calculates the volume of sand required for the block pockets 
		Double p_sand = p * 3;
		System.out.println("Volume of sand in block pockets (cubic feet): " + p_sand + "\n");
		
		//calculates the volume of gravel required for the block pockets 
		Double p_gravel = p * 6;
		System.out.println("Volume of gravel in pockets (cubic feet): " + p_gravel + "\n");
		
		//calculates the total bags of cement required for the construction
		Double t_cement = j_cement + p_cement;
		System.out.println("Total bags of cement: " + t_cement + "\n");
		
		//calculates the total volume of sand required for the construction 
		Double t_sand = j_sand + p_sand;
		System.out.println("Total volume of sand (cubic feet): " + t_sand + "\n");
		
		
		
		return "test";
	}	
	
	*/
	
	
	/**
	 * @param args
	 */
	/*
	public static void main(String[] args) {
		System.out.println(Estimate_Materials.estQuan(45,60));
		
		// TODO Auto-generated method stub

	}
	*/

}
