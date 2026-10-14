/*정수 배열 arr가 주어집니다. 배열의 정수들을 2진수로 나타냈을 때 1의 개수를 기준으로 오름차순 정렬하세요. 만약 1의 개수가 같은 정수가 두 개 이상이면, 그 정수들은 숫자 크기 기준으로 오름차순 정렬하세요.

정렬한 배열을 반환하세요.

예를 들어 3은 2진수로 11이라 1이 2개, 4는 100이라 1이 1개예요. 그래서 4가 3보다 앞에 와요. */

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] boxedArr = new Integer[arr.length];

        for(int i=0;i<arr.length;i++){
            boxedArr[i] = arr[i];
        }

        Arrays.sort(boxedArr,(a,b)->{
            int countA = CountBits(a);
            int countB = CountBits(b);

            if(countA != countB){
                return countA - countB;
            }
            return a-b;
        });

        for(int i=0; i<arr.length; i++){
            arr[i] = boxedArr[i];
        }
        return arr;
    }

    public int CountBits(int n){
        int count = 0;
        while(n>0){
            if(n%2 == 1){
                count++;
            }
            n = n/2;
        }
        return count;
    }
}