
public class reverse {
    // Function to reverse digits of a number
    public int reverseNumber(int n) {
        int revNum = 0;

        // Loop until all digits are processed
        while (n > 0) {
            // Get the last digit
            int lastDigit = n % 10;

            // Append it to the reversed number
            revNum = revNum * 10 + lastDigit;

            // Remove the last digit from n
            n = n / 10;
        }

        return revNum;
    }

    // Driver code
    public static void main(String[] args) {
        reverse obj = new reverse();
        int num = 12345;
        
        System.out.println("Original: " + num);
        System.out.println("Reversed: " + obj.reverseNumber(num)); 
    }
}