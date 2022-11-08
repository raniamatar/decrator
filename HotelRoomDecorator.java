/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decrator;

/**
 *
 * @author ahmad
 */
public abstract class HotelRoomDecorator implements Room{
    protected Room room;
    
    public HotelRoomDecorator(Room room){
        this.room=room;
    }

    @Override
    public int reserve() {
        return room.reserve();
    }
    
        
    
}

