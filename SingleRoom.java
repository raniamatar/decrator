/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decrator;

/**
 *
 * @author ahmad
 */
public class SingleRoom implements Room{
    private int cost;
    
    public SingleRoom(int cost){
        this.cost=cost;    
    }
    
     public int reserve(){
        return this.cost;
    }
    
}
