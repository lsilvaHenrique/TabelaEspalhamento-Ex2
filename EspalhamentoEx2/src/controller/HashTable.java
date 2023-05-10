package controller;

import java.util.LinkedList;

public class HashTable {
	    private LinkedList<Morador>[] table;
	    private int size;
	    
	    public HashTable(int size) {
	        this.size = size;
	        table = new LinkedList[size];
	        for (int i = 0; i < size; i++) {
	            table[i] = new LinkedList<Morador>();
	        }
	    }
	    
	    private int hash(int key) {
	        return key % size;
	    }
	    
	    public void add(Morador morador) {
	        int index = hash(morador.getNumAp());
	        table[index].add(morador);
	    }
	    
	    public Morador get(int numAp) {
	        int index = hash(numAp);
	        for (Morador morador : table[index]) {
	            if (morador.getNumAp() == numAp) {
	                return morador;
	            }
	        }
	        return null;
	    }
	    
	    public void remove(int numAp) {
	        int index = hash(numAp);
	        table[index].removeIf(m -> m.getNumAp() == numAp);
	    }
	    
	    public LinkedList<Morador> listByFloor(int floor) {
	        LinkedList<Morador> result = new LinkedList<Morador>();
	        for (int i = 0; i < size; i++) {
	            for (Morador morador : table[i]) {
	                if (morador.getNumAp() / 100 == floor) {
	                    result.add(morador);
	                }
	            }
	        }
	        return result;
	    }
	}
