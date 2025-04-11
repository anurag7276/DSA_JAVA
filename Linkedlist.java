// Here we learn all about linkedlist in Java language basic operations and so on 

class Node{
        int data;
        Node next;

        Node(int data1 , Node next1){
               this.data = data1;
                this.next = next1;
        }
     
        Node(int data1 ){
                this.data = data1;
                this.next = null;
        }
                
};

public class Linkedlist{


        public static Node ConverArr2ll(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1; i<arr.length; i++){
                Node temp = new Node(arr[i]);
                mover.next = temp;
                mover = mover.next;

        }
        return head;

       }

       
        public static int lengthOfLL(Node head){
          int count=0;
         Node temp = head;

          while(temp!=null){
                
                temp= temp.next;
                count++;
        }

          return count;
        }


        public static void main( String[] args){
                int[] arr={12,4,6,7};
                Node head = ConverArr2ll(arr);
                // System.out.print(head.data)

                
           /*  Here Discussed how to travere in linkedlist */ 
           Node temp = head;

           while(temp != null){
                System.out.print(temp.data + " ");
                temp= temp.next;
            }
               
        }
}