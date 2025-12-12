class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // 뒤에서부터 공백 제거
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // 마지막 단어 길이 계산
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
