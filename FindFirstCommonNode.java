
// class ListNode {
//     int val;
//     ListNode next = null;
//
//     ListNode(int val) {
//         this.val = val;
//     }
// }
 public class FindFirstCommonNode {
        public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
            if(pHead1 == null || pHead2 == null){
                return null;
            }
            // 得到两个链表的长度
            int length1 = GetListLength(pHead1);
            int length2 = GetListLength(pHead2);
            int diff = length1 - length2;

            ListNode headLong = pHead1;
            ListNode headShort = pHead2;
            if (diff < 0)
            {
                headLong = pHead2;
                headShort = pHead1;
                diff = length2 - length1;
            }
            // 先在长链表上走几步
            for (int i = 0; i < diff; i++)
            {
                headLong = headLong.next;
            }
            // 再同时在两个链表上遍历
            while (headLong != null && headShort != null && headLong != headShort)
            {
                headLong = headLong.next;
                headShort = headShort.next;
            }

            ListNode commonNode = headLong;
            return commonNode;
        }

        private static int GetListLength(ListNode head)
        {
            int length = 0;
            ListNode tempNode = head;
            while (tempNode != null)
            {
                tempNode = tempNode.next;
                length++;
            }

            return length;
        }
    }

