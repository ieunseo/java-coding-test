public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            // n & (n - 1) 은 n 의 최하위 1비트를 끈 값
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
