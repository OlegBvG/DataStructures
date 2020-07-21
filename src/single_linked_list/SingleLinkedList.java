package single_linked_list;

public class SingleLinkedList
{
    private ListItem top;

    public void push(ListItem item)
    {
        if(top != null) {
            item.setNext(top);
        }
        top = item;
    }

    public ListItem pop()
    {
        ListItem item = top;
        if(top != null)
        {
            top = top.getNext();
            item.setNext(null);
        }
        return item;
    }

    public void removeTop()
    {
        if(top != null) {
            top = top.getNext();
        }
    }

    public void removeLast()
    {
        ListItem item = top;
        ListItem itemLast = top;
        if(item != null)
        {
            do {
                itemLast = item;
                item = item.getNext();
//                System.out.println(item.getData());
            } while (item.getNext() != null);
            itemLast.setNext(null);

//      item.setNext(null);
        }
    }
}