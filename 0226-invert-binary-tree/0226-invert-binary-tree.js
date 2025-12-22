
function TreeNode(val, left = null, right = null) {
    this.val = val;
    this.left = left;
    this.right = right;
}

var invertTree = function(root) {
    if (root === null) {
        return null;  
    }

    // 왼쪽과 오른쪽 자식 교환
    let temp = root.left;
    root.left = root.right;
    root.right = temp;

    // 왼쪽과 오른쪽 자식에 대해 재귀적으로 호출
    invertTree(root.left);
    invertTree(root.right);

    return root;
};
