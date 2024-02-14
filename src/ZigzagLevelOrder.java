import data.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelOrder {

    public static void main(String[] args) {
//        System.out.println(zigzagLevelOrder(null));

//        System.out.println(zigzagLevelOrder(new TreeNode(1)));

        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        root.left = left;
        TreeNode right = new TreeNode(20);
        root.right = right;
        TreeNode left1 = new TreeNode(15);
        right.left = left1;
        TreeNode right1 = new TreeNode(7);
        right.right = right1;
//        System.out.println(zigzagLevelOrder(root));

        root = new TreeNode(1);
        left = new TreeNode(2);
        root.left = left;
        right = new TreeNode(3);
        root.right = right;
        left1 = new TreeNode(4);
        left.left = left1;
        right1 = new TreeNode(5);
        right.right = right1;
        System.out.println(zigzagLevelOrder(root));
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        List<Integer> temp = new ArrayList<>();
        Queue<TreeNode> newQueue = new ArrayDeque<>();
        boolean isLeft = true;
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            temp.add(current.val);
            if (isLeft) {
                if (current.right != null) newQueue.add(current.right);
                if (current.left != null) newQueue.add(current.left);
            } else {
                if (current.left != null) newQueue.add(current.left);
                if (current.right != null) newQueue.add(current.right);
            }
            if (queue.isEmpty()) {
                queue = newQueue;
                newQueue = new ArrayDeque<>();
                isLeft = !isLeft;
                result.add(temp);
                temp = new ArrayList<>();
            }
        }
        return result;
    }
}
