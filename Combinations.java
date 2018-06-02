package partial_exam;
//Gustavo Osorio
//UNMSM -  ADS

public class Combinations {

	public static void main(String[] args) {
		Combinations combinations = new Combinations();
		int n = 10;
		System.out.println("# Ladder's steps: " + n);
		System.out.println("# Step combinations: " + combinations.countCombinations(n, -8));
	}

	public long countCombinations(int n, int level) {					
		if ((n < 0) || (n == 0 && level == 0)) {
			return 0;
		}			
		if (n == 0 && level > 0) {
			return 1;
		}
		return countCombinations(n - 1, level + 1) + countCombinations(n - 2, level + 1)
				+ countCombinations(n - 3, level + 1);
	}
}