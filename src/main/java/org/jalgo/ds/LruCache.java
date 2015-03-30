package org.jalgo.ds;

import java.util.HashMap;

public class LruCache {
    HashMap<Integer, DoubleLinkedListNode> map = new HashMap<Integer, DoubleLinkedListNode>();
    DoubleLinkedListNode leaseRecentlyUsed;
    DoubleLinkedListNode mostRecentlyUsed;
    int maxSize;
    int currentSize;

    public LruCache(int size) {
        this.maxSize = size;
    }

    public Object get(int key) {
        if (map.containsKey(key)) {
            DoubleLinkedListNode node = map.get(key);
            removeNode(node);
            setHead(node);
            return node.value;
        } else {
            return null;
        }
    }

    public void set(int key, Object value) {
        if (map.containsKey(key)) {
            DoubleLinkedListNode node = map.get(key);
            node.value = value;
            removeNode(node);
            setHead(node);
        } else {
            DoubleLinkedListNode node = new DoubleLinkedListNode(key, value);
            if (currentSize < maxSize) {
                setHead(node);
                map.put(key, node);
                currentSize++;
            } else {
                map.remove(leaseRecentlyUsed.key);
                leaseRecentlyUsed = leaseRecentlyUsed.prev;
                setHead(node);
                map.put(key, node);
            }
        }
    }

    public void removeNode(DoubleLinkedListNode node) {
        DoubleLinkedListNode curr = node;
        DoubleLinkedListNode prev = node.prev;
        DoubleLinkedListNode next = node.next;

        if (prev != null) {
            prev.next = next;
        } else {
            mostRecentlyUsed = next;
        }

        if (next != null) {
            next.prev = prev;
        } else {
            leaseRecentlyUsed = prev;
        }
    }

    public void setHead(DoubleLinkedListNode node) {

        node.prev = null;
        node.next = mostRecentlyUsed;

        if (mostRecentlyUsed != null) {
            mostRecentlyUsed.prev = node;
        }
        mostRecentlyUsed = node;
        if (leaseRecentlyUsed == null)
            leaseRecentlyUsed = node;
    }

    class DoubleLinkedListNode {
        int key;
        Object value;
        DoubleLinkedListNode prev;
        DoubleLinkedListNode next;

        public DoubleLinkedListNode(int k, Object v) {
            key = k;
            value = v;
        }
    }

}
