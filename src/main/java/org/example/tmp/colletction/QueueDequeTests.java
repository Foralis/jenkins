package org.example.tmp.colletction;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDequeTests {


    public static void main(String[] args) {
        Queue<Integer> arrayDeque = new ArrayDeque<>(List.of(10,20,1,5,91,0));
        System.out.println("ArrayDequeue");
        for (int i: arrayDeque
             ) {
            System.out.println(i);
        }

        Queue<Integer> priorityQueue = new PriorityQueue<>(List.of(10,20,1,5,91,0));
        System.out.println("PriorityQueue");
        for (int i: priorityQueue
        ) {
            System.out.println(i);
        }

    }
}
