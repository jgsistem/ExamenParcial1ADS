package partial_exam;
//Gustavo Osorio
//UNMSM -  ADS

public class Combinations {

	public static void main(String[] args) {
		Combinations combinations = new Combinations();
		int n = 23;
		System.out.println("# Ladder's steps: " + n);
		System.out.println("# Step combinations: " + combinations.countCombinations(n, 12));
	}

	public long countCombinations(int n, int level) {
		int result = 0;	
		if ((n < 0) || (n == 0 && level == 0)) {
			result = 0;
		}			
		if (n == 0 && level > 0) {
			result = 1;
		}		
		
		System.out.println("# result " + result);
		
		long respt1 = countCombinationsN2(n - 1,level + 1);
		long respt2= countCombinationsN3(n - 2,level + 1);
		long respt3= countCombinationsN4(n - 3,level + 1);
		
		return  respt1 + respt2 + respt3;
	}
	
	public long countCombinationsN2(int n, int level) {					
		int result = 0;		
		if ((n < 0) || (n == 0 && level == 0)) {
			result = 0;
		}			
		if (n == 0 && level > 0) {
			result = 1;
		}
		return result;
	}	
	
	public long countCombinationsN3(int n, int level) {					
		int result = 0;	
		if ((n < 0) || (n == 0 && level == 0)) {
			result = 0;
		}			
		if (n == 0 && level > 0) {
			result = 1;
		}
		return result;
	}	
	
	public int countCombinationsN4(int n, int level) {					
		int result = 0;		
		if ((n < 0) || (n == 0 && level == 0)) {
			return 1;
		}			
		if (n == 0 && level > 0) {
			return 1;
		}
		return result;
	}	
}