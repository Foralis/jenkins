package org.example.tmp.colletction;

import java.util.*;

public class QueueAndDeque {


    public static void main(String[] args) {
        System.out.println("Deque<Integer> deque = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));");
        Deque<Integer> deque = new LinkedList<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        int i = 0;
        while (deque.size() > 0){
            System.out.print(deque.remove() + " ");
        }
        System.out.println();

        System.out.println("Queue<Integer> queue = new PriorityQueue<>(Arrays.asList(1,2,3,4,5,6,7,8,9));");
        //Queue<Integer> queue = new PriorityQueue<>(Arrays.asList(0, 1,2,3,4,5,6,7,8,9));
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while (queue.size()>0){
            System.out.print(queue.remove() + " ");
        }
    }



}
