/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicItemsetCounting;

/**
 *
 * @author shree
 */
public class Database {
    
    //T40I10D100K
    
    private long size; 
    private int avg_size; 
    private int [][] data; 
    private int num_of_items; 
    
    // maximal potentially frequent itemsets 10 

    public Database(long size, int avg_size) {
        this.size = size;
        this.avg_size = avg_size;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getAvg_size() {
        return avg_size;
    }

    public void setAvg_size(int avg_size) {
        this.avg_size = avg_size;
    }

    public int getNum_of_items() {
        return num_of_items;
    }

    public void setNum_of_items(int num_of_items) {
        this.num_of_items = num_of_items;
    }
    
    public int [][] readTransactions(String input_file){
        
        return data; 
    }
    
    //test
    
}
