public class ArrayECount {
	
	public static int length(Object[] array) {
		int counter = 0;
		int max = 1;
		for (int i = 0; i < max; i++) {
			Object get;
			try {
				max++;
				get = array[i];
			} catch (ArrayIndexOutOfBoundsException aioobe) {
				counter = i;
				max = 0;
				get = null;
			}
		}
		return counter;
	}
	public static void main(String[] args) {
		String[] test = {"hi", "bye", "lol"};
		System.out.println(Integer.toString(length(test)));
	}
}
