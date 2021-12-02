package test;


public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
    }
}

class Test{
    public static void main(String[] args) {
        ListNode nodeFirst = new ListNode(0);   //创建首节点
        ListNode nextNode;                          //下一个节点
        nextNode = nodeFirst;                       //next指向First

        for(int i = 1;i < 10;i++){
            ListNode node = new ListNode(i);        //创建下标为i的节点
            nextNode.next = node;                   //让指向首节点的nextNode指向新节点(对接新节点)
            nextNode = nextNode.next;               //让nextNode不辱使命，继续指向当前(新)节点的下一个节点
        }

        nextNode = nodeFirst;                       //节点全部连接完毕，初始化，让nextNode继续指向首节点
    }

    static void print(ListNode listNode){
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        System.out.println();
    }
    public void addTwoNumbers(ListNode l1, ListNode l2) {
        Integer s = Integer.parseInt(String.valueOf(l1.val+ l2.val).substring(-1));

    }

}















