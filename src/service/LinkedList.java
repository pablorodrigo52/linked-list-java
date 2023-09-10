package service;

import domain.Node;

import javax.management.AttributeNotFoundException;

public class LinkedList implements InsertList, DeleteList, UpdateList {
    private Node linkedList;
    private int size = 0;
    
    @Override
    public void add(String value) { // O(1)
        this.linkedList = new Node(value, linkedList);
        size++;
    }
    
    @Override
    public void append(String value) { // O(n)
        Node currentNode = linkedList;
        while(currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(new Node(value));
        size++;
    }
    
    @Override
    public void addAtIndex(String value, int index) {

        if (index == 0) {
            add(value);
            return;
        }

        Node currentNode = linkedList;
        while(currentNode.getNext() != null && index > 1) {
            currentNode = currentNode.getNext();
            index--;
        }

        Node tempNode = currentNode.getNext();
        currentNode.setNext(new Node(value, tempNode));
        size++;
    }

    @Override
    public void delete() {
        Node currentNode = linkedList;
        linkedList = currentNode.getNext();
        size--;
        // free(currentNode); // need to free the memory for currentNode?
    }
    
    @Override
    public void deleteByValue(String value) throws AttributeNotFoundException {
        Node currentNode = linkedList;
        Node lastNode = currentNode;

        while(currentNode != null) {

            if (currentNode.getValue().equalsIgnoreCase(value)) {
                lastNode.setNext(currentNode.getNext());
                break;
            }

            lastNode = currentNode;
            currentNode = currentNode.getNext();
        }

        if (currentNode == null) {
            throw new AttributeNotFoundException(String.format("%s not found on linked list.", value));
        }
        size--;
    }

    @Override
    public void updateByIndex(int index, String value) {
        Node currentNode = linkedList;
        while(currentNode.getNext() != null && index > 1) {
            currentNode = currentNode.getNext();
        }
        currentNode.setValue(value);
    }

    public void print() {
        System.out.println();
        Node node = linkedList;
        while(node != null) {
            System.out.print(node);
            node = node.getNext();
        }
        System.out.println("NULL");
    }

    public int size() {
        return size;
    }
}