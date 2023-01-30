import java.util.Stack;

public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode n15 = new TreeNode(15, null, null);
        TreeNode n7 = new TreeNode(7, null, null);
        TreeNode n20 = new TreeNode(20, n15, n7);
        TreeNode n9 = new TreeNode(9, null, null);
        TreeNode n3 = new TreeNode(3, n9, n20);
        System.out.println(maxDepth(n3));
    }

    public static int maxDepth(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<>();
        int maxSize = 0;
        int currentSize = root != null ? 1 : 0;
        TreeNode currentNode = root;
        while (currentNode != null) {
            if (currentNode.left != null) {
                nodes.add(currentNode);
                currentSize++;
                if (maxSize < currentSize) {
                    maxSize = currentSize;
                }
                currentNode = currentNode.left;
            } else if (currentNode.right != null) {
                nodes.add(currentNode);
                currentSize++;
                if (maxSize < currentSize) {
                    maxSize = currentSize;
                }
                currentNode = currentNode.right;
            } else {
                if (currentNode == root && nodes.isEmpty()) {
                    break;
                }
                currentNode = nodes.pop();
                if (currentNode.left != null) {
                    currentNode.left = null;
                } else {
                    currentNode.right = null;
                }
                currentSize--;
            }
        }
        return Math.max(maxSize, currentSize);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
