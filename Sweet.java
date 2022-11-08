/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decrator;

/**
 *
 * @author ahmad
 */
public class Sweet implements Room{
    private int cost; 

    
    public Sweet(int cost){
        this.cost=cost;
        
    }

    @Override
    public int reserve() {
        return this.cost;
    }
    
    
}
