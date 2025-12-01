import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // 여는 괄호면 스택에 push
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else { // 닫는 괄호일 때
                // 스택이 비었는데 닫는 괄호가 나오면 바로 false
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // 짝이 맞지 않으면 false
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }

        // 모든 문자를 처리한 뒤 스택이 비어있는지확인 후 반환
        return stack.isEmpty();
    }
}
