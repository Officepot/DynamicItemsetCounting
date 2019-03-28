/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicItemsetCounting;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author shree
 */
public class DynamicItemsetCounting {
    
    // should be a Trie. or HashTrie
   
    // number of unique items like A, B, C, D, E, 
    private int num_of_items; 
    
    //begining of the latice structure. 
    private Node root; 
    
    // how many transactions that we have to loop through.
    private int M; 
    
    // min support.
    private double min_sup; 
    
    // List of all the frequent itemsets in the database. 
    private Set<String> large = new HashSet<String>(); 
    
    // list will have itemsets that are solid cricle --> infrequent small 
    private LinkedList <String> SC = new LinkedList<>(); 
    // list will have itemsets that are solid box --> frequent large 
    private LinkedList <String> SB = new LinkedList<>(); 
    // list will have itemsets that are solid cricle --> possible infrequent small 
    private LinkedList <String> DC = new LinkedList<>(); 
    // list will have itemsets that are solid cricle --> possible frequent large 
    private LinkedList <String> DB = new LinkedList<>(); 
    
    /**
     * 
     * @param M
     * @param min_sup 
     */
    public DynamicItemsetCounting(int M, double min_sup) {
        this.M = M;
        this.min_sup = min_sup;
        root = new Node("Solid box", large); 
    }
    
    /**
     * getMinSupCount
     * @param avg_size is average transaction size 
     * @return the min support count 
     */
    public int getMinSupCount(int avg_size){
        return (int) Math.ceil(min_sup * avg_size); 
    }
    
    
    
}

