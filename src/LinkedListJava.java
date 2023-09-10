import service.LinkedList;

import javax.management.AttributeNotFoundException;

public class LinkedListJava {

    public static void main(String [] args) {
        final LinkedList linkedList = new LinkedList();

        System.out.print("initial list: ");
        linkedList.add("Pablo");
        linkedList.add("Liliane");
        linkedList.add("IntelliJ");
        linkedList.add("IDEA");
        linkedList.print();
        System.out.print("append 'lastElement' on list: ");
        linkedList.append("lastElement");
        linkedList.print();
        System.out.print("adding 'vsCode' at index 2: ");
        linkedList.addAtIndex("vsCode", 2);
        linkedList.print();


        System.out.print("deleting first element: ");
        linkedList.delete();
        linkedList.print();
        try {
            System.out.println("deleting 'lastElement' from list by value and try to deleting 'aaa' from list by value");
            linkedList.deleteByValue("lastelement");
            linkedList.deleteByValue("aaaa");
        } catch (AttributeNotFoundException e) {
            System.out.print(e.getMessage());
        }
        linkedList.print();


        System.out.print("updating 'Pablo' to 'Pablo linked list impl'");
        linkedList.updateByIndex(3, "Pablo linked list impl");
        linkedList.print();
    }
}