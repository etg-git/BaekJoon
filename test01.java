package BaekJoon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;


//    private Node header;
//    private Node tail;
//    private int size=0;
//
//    private class Node{
//        private Object data;
//        private Node next;
//        Node(Object data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//    public void add(Object data) {
//        Node newNode = new Node(data);
//        newNode.next = header;
//        header = newNode;
//        size++;
//        if (header.next == null) {
//            tail = header;
//        }
//    }
//    public String toString() {
//        if(header == null) {
//            return "[]";
//        }
//        Node temp = header;
//        String str = "[";
//        while(temp.next !=  null) {
//            str += temp.data + ", ";
//            temp = temp.next;
//        }
//        str += temp.data;
//        return str + "]";
//    }
import java.util.LinkedList;
public class test01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        for(int i =1; i<6; i++) {
            list.add("L" + i);
        }
        System.out.println(list);

        LinkedList<String> list1 = new LinkedList<String>();
        while (list.isEmpty() != true) {
            list1.add(list.pop());
            if(list.isEmpty() != true) {
                list1.add(list.removeLast());
            }
        }
        System.out.println(list1);
    }
}


