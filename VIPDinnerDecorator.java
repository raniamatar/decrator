/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decrator;

/**
 *
 * @author ahmad
 */
public class VIPDinnerDecorator extends HotelRoomDecorator{
    private int cost;
    
    public VIPDinnerDecorator(Room room,int cost) {
        super(room);
        this.cost=cost;
    }
    
    public int reserve(){
         return room.reserve()+cost;
        
    }
    
    
}
