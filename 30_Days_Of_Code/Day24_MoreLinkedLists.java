// https://www.hackerrank.com/challenges/30-linked-list-deletion
    public static Node removeDuplicates(Node head) {
      //Write your code here
        
        if(head == null){
       
            return head;
        }else{
            Node focusNode = head;
            while(focusNode.next!=null){
                if(focusNode.data != focusNode.next.data){
                    focusNode = focusNode.next;
                }
                else if(focusNode.data == focusNode.next.data){
                    focusNode.next = focusNode.next.next;
                }
            }
            return head;
        }
    }
