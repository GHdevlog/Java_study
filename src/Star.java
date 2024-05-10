
public class Star {

	public static void main(String[] args) {
		printStar(5);
		printStar(10);
	}

	public static void printStar(int n) {
		int lineCount = 2*n+1;
		for(int i=0;i<lineCount;i++) {
			
			int spaceCount = Math.abs(n-i);
			System.out.printf("i=%2d spaceCount=%2d ",i,spaceCount);
			
			for (int j=0;j<lineCount;j++) {
				if (spaceCount<=j && j<=2*n-spaceCount) {
					System.out.printf("*");
				}else {
					System.out.printf("-");					
				}
			}	
			System.out.println("");
		
		}
	}
}
