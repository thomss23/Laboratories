package com.company;

import java.util.Objects;

public class Node<K,V> {

    K key;
    V value;
    Node<K,V> next;

    public Node(K key, V value){
        this.key = key;
        this.value = value;
        next = null;
    }

    public K getKey() {
        return key;
    }

    public void setValue(V value){
        this.value = value;
    }

    public V getValue(){
        return value;
    }

    public Node<K,V> getNext(){
        return next;
    }

    public void setNext(Node<K,V> next) {
        this.next = next;
    }

    private void add(Node<K,V> node){
        Node<K,V> start = this;
        while(true){
            if(start.equals(node)){
                start.setValue(node.getValue());
                break;
            } else if(start.getNext()==null){
                start.setNext(node);
                break;
            }
            else {
                start = start.getNext();
            }
        }
    }

    public V get(K key){
        Node<K,V> start = this;
        while(true){
            if(start.getKey().equals(key)){
                return start.value;
            } else if(start.getNext()==null){
                return null;
            }
            else {
                start = start.getNext();
            }
        }
    }

    public void put(K key, V value){
        Node node = new Node(key,value);
        add(node);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()){
           return false;
        }

        Node node = (Node) obj;
        return key.equals(node.getKey());
    }

}
