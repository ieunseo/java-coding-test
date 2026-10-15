/**
문자열 배열 words와 정수 k가 주어질 때, 가장 자주 등장하는 문자열 k개를 반환하세요.

결과는 빈도수가 높은 순서대로 정렬해서 반환해야 합니다. 빈도수가 같은 단어들은 사전순으로 정렬합니다.
 */
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // 1. 단어별 개수 세기
        HashMap<String, Integer> boxMap = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
            if (boxMap.containsKey(words[i])) {
                Integer boxCount = boxMap.get(words[i]);
                boxCount++;
                boxMap.put(words[i], boxCount);
            } else {
                boxMap.put(words[i], 1);
            }
        }

        // 2. 단어만 리스트로 꺼내서 정렬
        List<String> list = new ArrayList<>(boxMap.keySet());
        list.sort((a, b) -> {
            int countA = boxMap.get(a);
            int countB = boxMap.get(b);
            if (countA != countB) {
                return countB - countA; // 개수 내림차순
            }
            return a.compareTo(b); // 같으면 사전순
        });

        // 3. 앞에서부터 k개만 반환
        return list.subList(0, k);
    }
}