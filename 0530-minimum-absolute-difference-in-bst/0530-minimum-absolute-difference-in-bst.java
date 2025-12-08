/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private Integer prev = null;   // 직전에 방문한 노드 값
    private int minDiff = Integer.MAX_VALUE; // 최소 차이

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        // 1. 왼쪽 서브트리
        inorder(node.left);

        // 2. 현재 노드 처리
        if (prev != null) {
            int diff = node.val - prev;
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        prev = node.val;

        // 3. 오른쪽 서브트리
        inorder(node.right);
    }
}