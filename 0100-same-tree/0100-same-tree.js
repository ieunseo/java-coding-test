var isSameTree = function(p, q) {
    // If both nodes are null, they are the same (both empty trees)
    if (!p && !q) {
        return true;
    }
    
    // If one of the nodes is null and the other is not, they are different
    if (!p || !q) {
        return false;
    }
    
    // If the values are different, the trees are not the same
    if (p.val !== q.val) {
        return false;
    }
    
    // Recursively check the left and right subtrees
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
};
