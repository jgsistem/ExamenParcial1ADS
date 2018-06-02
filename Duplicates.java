package partial_exam;
//Gustavo Osorio
//UNMSM -  ADS

public class Duplicates {
	public static void main(String[] args) {
		Duplicates duplicates = new Duplicates();
		int[] numbers = {45, 45, 38 };
		ResultDto resultDto = duplicates.duplicateValues(numbers);
		System.out.println("N: " + numbers.length);		
		System.out.println("Has duplicate values: " + resultDto.hasDuplicates());
		System.out.println("Steps: " + resultDto.getSteps());
	}

	public ResultDto duplicateValues(int[] numbers) {
		ResultDto resultDto = new ResultDto();
		long steps = 0;					
		for (int i = 0; i < numbers.length; i++) {			
				steps++;
				int j = 0;
				if ( i != j && numbers[i] == numbers[j]) {
					resultDto.setHasDuplicates(true);
					resultDto.setSteps(steps);
					return resultDto;
				}
				j++;			
		}
		resultDto.setHasDuplicates(false);
		resultDto.setSteps(steps);
		return resultDto;
	}
	
	public class ResultDto {
		private boolean hasDuplicates;
		private long steps;
		
		public boolean hasDuplicates() {
			return hasDuplicates;
		}
		
		public void setHasDuplicates(boolean hasDuplicates) {
			this.hasDuplicates = hasDuplicates;
		}
		
		public long getSteps() {
			return steps;
		}
		
		public void setSteps(long steps) {
			this.steps = steps;
		}
	}
}
