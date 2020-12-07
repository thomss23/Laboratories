package com.company;


import java.util.Objects;

public class MyHashMap<K,V> {

    int n;
    //buckets to store data
    Node<K,V>[] buckets;

    public MyHashMap(int buckets) {
        this.n = buckets;
        this.buckets = new Node[n];

    }

    public MyHashMap(){
        this(100);
    }

    public void put(K key, V value){
        int idx = Objects.hash(key) & (n-1);
        if(buckets[idx] == null){
            Node node = new Node(key,value);
            buckets[idx] = node;
        }
        else {
            buckets[idx].put(key,value);
        }
    }

    public V get(K key){
        int idx = Objects.hash(key) & (n-1);
        if(buckets[idx] == null){
            return null;
        }
        else {
            return buckets[idx].get(key);
        }
    }


}
