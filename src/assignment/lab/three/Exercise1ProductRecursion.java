package assignment.lab.three;

public class Exercise1ProductRecursion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m  = 3;
        int n = 4;
        // Test 1, With M(3) multiplied by N(4) the Product should be 12
        System.out.println("m: " + m + ", n: " + n);
        System.out.println("Test 1, With M(3) multiplied by N(4) the Product should be --> " + product(m, n) + "\n");
        
		m  = 4;
        n = 5;
        // Test 2, With M(4) multiplied by N(5) the Product should be 20
        System.out.println("m: " + m + ", n: " + n);
        System.out.println("Test 2, With M(4) multiplied by N(5) the Product should be --> " + product(m, n) + "\n");
  	
		m  = 5;
        n = 6;
        // Test 2, With M(5) multiplied by N(6) the Product should be 30
        System.out.println("m: " + m + ", n: " + n);
        System.out.println("Test 3, With M(5) multiplied by N(6) the Product should be --> " + product(m, n) + "\n");
  	    
	}
	
	public static int product(int m, int n) {
		
        if (m < 0 || n <0) {	
            return 0;  
        }
        
        if (m == 0 || n==0) {
            return 0;
        }
        
        System.out.println("m: " + m + ", n: " + n);
        return m + product(m, n-1);
    }

}
