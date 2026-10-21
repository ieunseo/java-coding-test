class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] cnt = new int[k];
        cnt[0]=1;

        int sum=0;
        for(int num:nums){
            sum=((sum+num)%k+k)%k;
            cnt[sum]++;
        }
        int answer = 0;
        for(int r=0; r<k; r++){
            answer += cnt[r]*(cnt[r]-1)/2;
        }

        return answer;
    }
}