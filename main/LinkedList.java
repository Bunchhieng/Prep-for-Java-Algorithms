package main;

import java.util.*;

public class LinkedList {
    class Link {
        public int data1;
        public double data2;
        public Link nextLink;

        // Link constructor
        public Link(int d1, double d2) {
            data1 = d1;
            data2 = d2;
        }

        public void printLink() {
            System.out.println("{" + data1 + ", " + data2 + "} ");
        }
    }

    class LinkList {
        private Link first;

        // LinkList constructor
        public LinkList() {
            first = null;
        }

        // Returns true if list is empty
        public boolean isEmpty() {
            return first == null;
        }

        // Deletes the link at the first of the list
        public Link delete() {
            Link temp = first;
            first = first.nextLink;
            return temp;
        }

        // Inserts a new Link at the first of the list
        public void insert(int d1, double d2) {
            Link link = new Link(d1, d2);
            link.nextLink = null;
            first = link;
        }

        public void printList() {
            Link currentLink = first;
            System.out.print("List:");
            while (currentLink != null) {
                currentLink.printLink();
                currentLink = currentLink.nextLink;
            }
            System.out.println("");
        }
    }

    class LinkListTest {
        public void main(String[] args) {
            LinkList list = new LinkList();

            list.insert(1, 1.01);
            list.insert(2, 2.02);
            list.printList();

            while (!list.isEmpty()) {
                Link deleteLink = list.delete();
                System.out.print("deleted: ");
                deleteLink.printLink();
            }
            list.printList();
        }
    }
}
