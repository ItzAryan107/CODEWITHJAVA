package LeetCode;

public class AddTwoNumbers {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            next = null;
        }
    }
    ListNode resultHead;

    public void add(int val){
        if(resultHead == null){
            resultHead = new ListNode(val);
            return;
        }

        ListNode currentNode = resultHead;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = new ListNode(val);
    }

    int carry = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum;
        if(l1 == null && l2 == null){
            if(carry > 0){
                add(carry);
            }
            return resultHead;
        }
        if(l1 == null){
            sum = l2.val + carry;
            if(sum >= 10){
                carry = 1;
                sum = sum - 10;
            }else if((sum - 10) <= -1){
                carry = 0;
            }
            add(sum);
            return addTwoNumbers(null,l2.next);
        }
        if(l2 == null){
            sum = l1.val + carry;
            if(sum >= 10){
                carry = 1;
                sum = sum - 10;
            }else if((sum - 10) <= -1){
                carry = 0;
            }
            add(sum);
            return addTwoNumbers(l1.next,null);
        }
        sum = l1.val + l2.val + carry;
        if((sum-10)>=0){
            carry = 1;
            sum = sum - 10;
        }else if((sum-10) <= -1){
            carry = 0;
        }
        add(sum);
        return addTwoNumbers(l1.next,l2.next);
    }
}
