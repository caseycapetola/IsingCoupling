
public class IsingCoupling {
	private static final int GRID_SIZE = 50;
	private static final double BETA = 0.5;
    private static final int POS = 1;
    private static final int NEG = -1;

 	
	public static void main(String[] args) {
		// Initialize grids to all positive/negative
		IsingGrid posGrid = new IsingGrid(POS, GRID_SIZE, BETA);
		IsingGrid negGrid = new IsingGrid(NEG, GRID_SIZE, BETA);
		
		System.out.println("START OF LOOP:");
		System.out.println("STEPS: " + posGrid.isCoupled(negGrid));
	}
	
	

}
