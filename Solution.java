class Solution {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while(n!=0){
            int lastdigit=n%10;
            product=product*lastdigit;
            sum=sum+lastdigit;
            n=n/10;
        }
        return(product-sum);
    }
public static void main(String[] args) {
        Solution obj = new Solution();
        int num = 234;
        
        System.out.println("Original: " + num);
        System.out.println("Result: " + obj.subtractProductAndSum(num)); 
    }
}