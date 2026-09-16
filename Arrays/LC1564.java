package Arrays;

class Solution {
    public int numOfSubarrays(int[] arr) {
        long ans = 0;
        long even = 1;
        long odd = 0;
        
        int sum = 0;
        
        for (int num : arr) {
            sum += num;
            
            if (sum % 2 == 0) {
                ans += odd;
                even++;
            } else {
                ans += even;
                odd++;
            }
        }
        
        return (int)(ans % 1000000007);
    }
}