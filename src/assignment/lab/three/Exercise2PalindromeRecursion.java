package assignment.lab.three;

public class Exercise2PalindromeRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String racecar  = "racecar";
        int racecarLength = racecar.length();
        // Test 1, 'racecar' should be a Palindrome
        System.out.println("startIndex: 0, endIndex: " + (racecarLength - 1));
        System.out.println("Test 1: Is string \"racecar\" a Palindrome --> " + isPalindrome(racecar, 0, racecarLength - 1) + "\n");
        
		String peesweep  = "peesweep"; // Even number of characters, almost palindrome
        int peesweepLength = peesweep.length();
        // Test 2, 'peesweep' should NOT be a Palindrome
        System.out.println("startIndex: 0, endIndex: " + (peesweepLength - 1));
        System.out.println("Test 2: Is string \"peesweep\" a Palindrome --> " + isPalindrome(peesweep, 0, peesweepLength - 1) + "\n");
	
		String gohangasalamiimalasagnahog  = "gohangasalamiimalasagnahog";
        int gohangasalamiimalasagnahogLength = gohangasalamiimalasagnahog.length();
        // Test 3, 'gohangasalamiimalasagnahog' should be a Palindrome
        System.out.println("startIndex: 0, endIndex: " + (peesweepLength - 1));
        System.out.println("Test 2: Is string \"gohangasalamiimalasagnahog\" a Palindrome --> " + isPalindrome(gohangasalamiimalasagnahog, 0, gohangasalamiimalasagnahogLength - 1) + "\n");
	
	}
	
	// A Recursive method to check if String is Palindrome
    public static boolean isPalindrome(String checkString, int startIndex, int endIndex)
    {
        // If startIndex is same as endIndex then there is only one character and it is a Palindrome.
        if (startIndex == endIndex) {
            return true; // It is a Palindrome, return TRUE!
        }
 
        // If first and last characters do not match, then return FALSE, its is not a palindrome!
        if ((checkString.charAt(startIndex)) != (checkString.charAt(endIndex))) {
            return false;
        }
        
        if (startIndex < endIndex + 1) {
        	System.out.println("startIndex: " + (startIndex + 1) + ", endIndex: " + (endIndex - 1));
        	return isPalindrome(checkString, startIndex + 1, endIndex - 1);
        }
 
        return true;
    }

}
