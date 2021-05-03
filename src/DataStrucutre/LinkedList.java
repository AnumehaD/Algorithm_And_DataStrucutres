package DataStrucutre;

public class LinkedList {
    Node head;

    static class Node {
        int value;
        Node next;
        Node(int i) {
            value = i;
        }
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        insertion(list, 2);
        insertion(list, 3);
        deletion(list, 4);
        deleteHead(list);
        deleteAtPosition(list,2);
        addAtHead(list,5);
        printList(list);

    }

    public static LinkedList insertion(LinkedList list, int value) {
        Node new_node = new Node(value);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null)
                last = last.next;
            last.next = new_node;
        }
        return list;
    }

    public static void printList(LinkedList linkedList) {
        Node currentNode = linkedList.head;
        System.out.println("LinkedList:");
        while (currentNode != null) {
            System.out.println(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }

    public static LinkedList deletion(LinkedList linkedList, int key) {
        Node currentNode = linkedList.head;
        Node prev = null;
        if (currentNode != null && currentNode.value == key) {
            System.out.println(key + " Key found and deleted");
            linkedList.head = currentNode.next;
            return linkedList;
        }
        while (currentNode != null && currentNode.value != key) {
            prev = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode != null) {
            prev.next = currentNode.next;
            System.out.println(key + " key Found and deleted");
        }
        if (currentNode == null) {
            System.out.println(key + " Key is not present in the list.");
        }
        return linkedList;
    }

    public static LinkedList deleteHead(LinkedList linkedList) {

        Node headNode = linkedList.head;
        if(headNode!= null){
            linkedList.head = headNode.next;
        }
        return linkedList;
    }

    public static LinkedList addAtHead(LinkedList linkedList, int value){
        Node currentNode = new Node(value);
        currentNode.next = linkedList.head;
        linkedList.head = currentNode;
        return linkedList;
    }

    public static LinkedList deleteAtPosition(LinkedList linkedList, int index){
        Node currentNode = linkedList.head;
        Node prev = null;
        if(currentNode != null && index == 0){
            linkedList.head = linkedList.head.next;
            return linkedList;
        }
        int counter = 0;
        while(currentNode != null){
            if(counter == index){
                prev.next = currentNode.next;
                System.out.println("Value from "+index+" is removed");
                break;
            }else{
                counter++;
                prev =currentNode;
                currentNode = currentNode.next;
            }
        }
        if(currentNode == null){
            System.out.println("Element at "+index+" not found");
        }
        return linkedList;
    }
}
