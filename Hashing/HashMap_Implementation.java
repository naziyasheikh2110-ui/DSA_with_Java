package Hashing;

import java.util.*;

public class HashMap_Implementation {
    static class HashMap<K, V> { //K and V are datatypes - can be int string arr anything
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node>[] buckets; //this means ll is the type of array

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>(); //on each index empty LL is initialized
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            //nodes -> add in new bucket
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); //bucket index
            int di = searchInLL(key, bi);//data index

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            //rehashing
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key); //bucket index
            int di = searchInLL(key, bi);//data index

            return di != -1;
        }

        public V remove(K key) {
            int bi = hashFunction(key); //bucket index
            int di = searchInLL(key, bi);//data index

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;

            } else {
                return null;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key); //bucket index
            int di = searchInLL(key, bi);//data index

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() { //stores keys in a AL
           ArrayList<K> keys = new ArrayList<>();

           for(int i =0; i<buckets.length; i++){
               LinkedList<Node> ll = buckets[i];

               for(Node node : ll){
                   keys.add(node.key);
               }
           }
           return keys;
        }
        public boolean isEmpty(){
            return n == 0;
        }
    }

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 100);
        hm.put("China", 50);
        hm.put("us", 450);
        hm.put("pak", 580);
        hm.put("nepal", 5000);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key);
        }

        System.out.println(hm.get("india"));
        System.out.println(hm.remove("nepal"));

    }
}
