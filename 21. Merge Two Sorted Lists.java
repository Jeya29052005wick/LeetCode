class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = list1;
        ListNode temp1 = list2;
        List<Integer> l1 = new ArrayList<>();
        while(temp != null)
        {
            l1.add(temp.val);
            temp = temp.next;
        }
        while(temp1 != null)
        {
            l1.add(temp1.val);
            temp1 = temp1.next;
        }
        if(l1.size() == 0)
        {
            return list1;
        }
        Collections.sort(l1);
        ListNode head = new ListNode(l1.get(0));
        ListNode temp2 = head;
        for(int i =1;i<l1.size();i++)
        {
            temp2.next =  new ListNode(l1.get(i));
            temp2 = temp2.next;
        }
        return head;
    }
}