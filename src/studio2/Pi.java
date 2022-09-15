package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double areaBoard = 1;
		double string = 1;
		int yes=0;
		double pi;
		for(int i=0; i<500;i++) {
			double verticalDis = Math.random();
			double horizontalDis = Math.random();
			double totDis = Math.sqrt((verticalDis*verticalDis)+(horizontalDis*horizontalDis));
			if(totDis<=1) {
				yes ++;
		
			}

		}
	double areaCircle = ((double) yes)/500;
	pi = (1.0/areaCircle)/4.0;

		
   	

		
	System.out.print("pi= " + pi);
	}
}