package telran.util;

public class RecoursionMethods {
    public static void f(int a) {
        if (a>3) {
            f(a-1);
        }
    }

    public static int factorial(int n) {
		if ( n <  0){
			n = -n;
        }
        return n == 0 ? 1 : n * factorial( n - 1 );
	}

    public static int pow(int base, int degree) {
        if (degree < 0) {
            throw new IllegalArgumentException();
        }
        return degree == 0 ? 1 : multiply(base, pow(base, degree - 1));
    }

    private static int multiply(int base, int indicator) {
        return (indicator == 0) ? 0 : (indicator < 0 ? -multiply(base, -indicator) : base + multiply(base, indicator - 1));
    }  

    public static int sum(int [] array) {
		return sum(array, array.length-1);
	}
    
	private static int sum(int[] array, int index) {
		return index < 0 ? 0 : array[index] + sum(array, index - 1);
	}

    public static int square(int x) {
		if (x<0) {
            x = -x;    
        }
		return x == 1 ? 1 : square( x - 1 ) + x + x - 1;
	}

    public static boolean isSubstring( String str, String substr) {
		return substr.length() > str.length() ? false:compareStart(str, substr) || isSubstring(str.substring(1), substr);
	}
    
    private static boolean compareStart(String str, String substr) {
		return substr.length() == 0 ? true : str.charAt(0) == substr.charAt(0) && compareStart(str.substring(1), substr.substring(1)); 
	}




}
