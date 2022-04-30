package lianbiao;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
    public void add(int newval){
        ListNode newNode = new ListNode(newval);
        if (this.next==null){
            this.next=newNode;
        }else {
            this.next.add(newval);
        }
    }
    public void print(){
        System.out.print(this.val);
        if (this.next!=null){
            System.out.print("->");
            this.next.print();
        }
    }
}
