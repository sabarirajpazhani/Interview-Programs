class Solution {
    int getMiddle(Node head) {
        
        int len=0;
        Node temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        
        int mid=len/2;
        temp=head;
        int c=0;
        while(c<mid){
            temp=temp.next;
            c++;
        }
        return temp.data;
    }
}
       

// Input: Linked list: 1->2->3->4->5
// Output: 3

// Explanation: The given linked list is 1->2->3->4->5 and its middle is 3.