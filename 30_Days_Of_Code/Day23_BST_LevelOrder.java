// https://www.hackerrank.com/challenges/30-binary-trees
	static void levelOrder(Node root){
      //Write your code here
        Queue<Node> myQue = new LinkedList<Node>();
      if(root != null){
       myQue.offer(root);
        while(!myQue.isEmpty()){
            Node node = myQue.poll();
            System.out.print(node.data+" ");
            if(node.left !=null){
                myQue.offer(node.left);
            }
            if(node.right !=null){
                myQue.offer(node.right);
            }
        }
      }
   }

  
