package uniqueSum;

public class Main {
	
	public static void main(String[] args) {
	
		int value1=7;
		int value2=2;
		int value3=7;
		
		System.out.println("The sum of all unique values you've enetered is " + sumOfValues(value1, value2, value3));
		
	}
	
	public static int sumOfValues(int value1, int value2, int value3) {
		
		int sumOfAll = 0;
		
		if(value1 == value2 || value1 == value3) {
			value1 = 0;
		} else if(value2 == value3) {
			value2 = 0;
		}
		sumOfAll = value1 + value2 + value3;
		return sumOfAll;
		
		/*Set<Integer> a = new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {value1, value2, value3))*/
	}

}
