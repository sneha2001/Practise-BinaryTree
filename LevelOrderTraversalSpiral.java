import java.util.Stack;


public class LevelOrderTraversalSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree = new Node(1);
		tree.left = new Node(2);
		tree.right = new Node(3);
		tree.left.left = new Node(4);
		tree.left.right = new Node(5);
		tree.right.left = new Node(6);
		System.out.print("level Order Without Recursion: ");
		LevelOrderTraversalSpiral preorder = new LevelOrderTraversalSpiral();
		preorder.levelOrderTraversalSpiral(tree);
	}
	
	private void levelOrderTraversalSpiral(Node root) {
		
		Boolean flag = false;
		int h = getHeight(root);
		for(int i =h;i>= 1;i--) {
			System.out.println();
			getLevelOrder(root,i);
		}
		
	}
	
	private void getLevelOrder(Node root,int level) {
		
		if(root== null)
			return ;
		
		if(level==1) {
			System.out.print(root.data+" ");
			return;
		}
		
		getLevelOrder(root.left, level-1);
		getLevelOrder(root.right, level-1);
		
		
		
		
	}
private int getHeight(Node root) {
		
		if(root == null) {
			return 0;
		}
		int lh = getHeight(root.left);
		int rh= getHeight(root.right);
		
		
		if(lh>rh)
			return lh+1;
		else
			return rh+1;
		
	}
}
