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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null)
        return ans;
        Deque<TreeNode>q=new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer>l=new ArrayList<>();
            int Size=q.size();
            for(int i=0;i<Size;i++)
            {
                TreeNode Temp=q.poll();
                l.add(Temp.val);
                if(Temp.left!=null)
                q.offer(Temp.left);
                if(Temp.right!=null)
                q.offer(Temp.right);
            }
            ans.add(l);
        }
        return ans;
    }
}
