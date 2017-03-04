// https://www.hackerrank.com/challenges/30-linked-list
    public static  Node insert(Node head,int data) {
        //Complete this method
        if(head == null){
            head = new Node(data);
            return head;
        }
           Node ins = new Node(data);
            Node current = head;
            while(current.next!=null){
               
                current = current.next;
                
            }
             if(current.next==null){
                    current.next = ins;
                }
                
           return head;
        }
     
    
