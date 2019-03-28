/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicItemsetCounting;

import java.util.Set;

/**
 *
 * @author shree
 */
public class Node {
    
    private String state; 
    private Set<String> itemset; 
    private int count = 0; 
    private Node [] children; 
    

    public Node(String state, Set<String> itemset) {
        this.state = state;
        this.itemset = itemset;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Set<String> getItemset() {
        return itemset;
    }

    public void setItemset(Set<String> itemset) {
        this.itemset = itemset;
    }

    public int getCount() {
        return count;
    }

    public void increaseCount() {
        this.count++;
    }

    public Node[] getChildren() {
        return children;
    }

    public void setChildren(Node[] children) {
        this.children = children;
    }
    
    @Override
    public String toString() {
        return "Node{" + "state=" + state + ", itemset=" + itemset + '}';
    }
    
    
    
}
