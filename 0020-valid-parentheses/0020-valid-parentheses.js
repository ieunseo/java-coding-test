/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    const stack = [];
    const map = {
        ')': '(',
        ']': '[',
        '}': '{'
    };

    for (let char of s) {
        // 닫는 괄호일 때
        if (char in map) {
            const top = stack.length > 0 ? stack.pop() : '#';
            if (top !== map[char]) {
                return false;
            }
        } 
        // 여는 괄호일 때
        else {
            stack.push(char);
        }
    }

    // 스택이 비어있어야 유효
    return stack.length === 0;
};
