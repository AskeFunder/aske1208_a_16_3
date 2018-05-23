package SorteOpgaver.ch16.aske1208_a_16_3;

import SorteOpgaver.ch16.LinkedIntList;
import SorteOpgaver.ch16.ListNode;

public class three
{
    public boolean isSorted(LinkedIntList linkedIntList)
    {
        ListNode current = linkedIntList.getFront();
        int size = linkedIntList.size();

        for (int i = 0; i < size; i++)
        {
            if (i == size - 1)
            {
                return true;
            }else if (current.data > current.next.data)
            {
                return false;
            }else{
                current = current.next;
            }

        }
        return true;
    }
}
