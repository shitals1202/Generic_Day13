package Day13;

public class Generic<T extends Comparable<T>> {
	T x, y, z;

	public Generic(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T maximum() {
		return testMaximum(x, y, z);
	}

	// Generic method of Type Integer,Float,String for finding maximum of 3
	private static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
		T max;
		if (x.compareTo(y) == 1 && x.compareTo(z) == 1) {
			max = x;
		} else if (y.compareTo(x) == 1 && y.compareTo(z) == 1) {
			max = y;
		} else {
			max = z;
		}
		printMax(x, y, z, max);

		return max;
	}
    //print method 
	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("max of %s,%s and %s is :- %s\n", x, y, z, max);
	}

	public static void main(String[] args) {
		Integer xInt = 5, yInt = 3, zInt = 2;
		Float xFlt = 3.4f, yFlt = 2.5f, zFlt = 8.3f;
		String xSt = "Apple", ySt = "Banana", zSt = "Peach";
        
		//creating the objects of generic
		Generic<Integer> integer = new Generic<>(xInt, yInt, zInt);
		Generic<Float> flt = new Generic<>(xFlt, yFlt, zFlt);
		Generic<String> string = new Generic<>(xSt, ySt, zSt);

		// calling methods for finding Maximum
		integer.maximum();
		flt.maximum();
		string.maximum();

	}

}

  