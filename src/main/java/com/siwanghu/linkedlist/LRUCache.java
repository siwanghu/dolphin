package com.siwanghu.linkedlist;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
    private class CacheNode{
        public int key;
        public int value;

        public CacheNode(int key,int value){
            this.key=key;
            this.value=value;
        }

        @Override
        public String toString() {
            return "{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    private int capacity;
    private LinkedList<CacheNode> list;
    private HashMap<Integer,CacheNode> map;

    public LRUCache(){
        this.capacity=5;
        list=new LinkedList<CacheNode>();
        map=new HashMap<Integer, CacheNode>();
    }

    public int get(int key){
        if(!map.containsKey(key))
            return -1;
        CacheNode node=map.get(key);
        list.remove(node);
        list.addFirst(node);
        return node.value;
    }

    public void set(int key,int value){
        if(map.containsKey(key)){
            CacheNode node=map.get(key);
            list.remove(node);
            node.value=value;
            list.addFirst(node);
            return;
        }else if(this.list.size()==5){
            CacheNode deleteNode=list.getLast();
            map.remove(deleteNode.key);
            list.remove(deleteNode);
            CacheNode node=new CacheNode(key, value);
            map.put(key,node);
            list.addFirst(node);
            return;
        }else{
            CacheNode node=new CacheNode(key, value);
            map.put(key,node);
            list.addFirst(node);
            return;
        }
    }

    @Override
    public String toString(){
        return "list="+list.toString()+"  map="+map.toString();
    }
}