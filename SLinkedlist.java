class Node {
        int data;
        Node next;

        Node(int data1, Node next1) {
                this.data = data1;
                this.next = next1;
        }

        Node(int data1) {
                this.data = data1;
                this.next = null;
        }
}

public class SLinkedlist {
        private static void print(Node head) {
                while (head != null) {
                        System.out.print(head.data + " ");
                        head = head.next;
                }
                System.err.println();
        }
        private static Node insertAtBeginning(Node head, Node newNode) {
                newNode.next = head;
                return newNode;
        }
        private static Node ConvertArr2SLL(int[] arr) {
                Node head = new Node(arr[0]);
                Node mover = head;

                for (int i = 1; i < arr.length; i++) {
                        Node temp = new Node(arr[i]);
                        mover.next = temp;
                        mover = mover.next;
                }
                return head;

        }


        public static void main(String[] args) {
                int[] arr = {12, 5 ,6,8};
                Node head = ConvertArr2SLL(arr);
                print(head);
                Node newNode = new Node(10);
                head = insertAtBeginning(head, newNode);
                print(head);
        }       
}
