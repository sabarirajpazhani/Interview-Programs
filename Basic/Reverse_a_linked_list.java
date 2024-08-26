class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        // code here
        Node prev=null;
        Node current=head;
        Node next=null;
        
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        return head;
        
        
    }
}


// Input: Linked list: 1->2->3->4->5->6
// Output: 6->5->4->3->2->1

// Input: Linked list: 2->7->10->9->8 
// Output: 8->9->10->7->2
