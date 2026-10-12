class Solution {
    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];  // 결과를 담을 배열
        int result = 0;                        // 지금까지의 합

        for (int i = 0; i < nums.length; i++) {  // <= 를 < 로
            result += nums[i];
            answer[i] = result;                  // 이번 단계 합을 기록
        }
        return answer;
    }
}