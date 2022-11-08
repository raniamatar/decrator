/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decrator;

/**
 *
 * @author ahmad
 */
public class Decrator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleRoom r =new SingleRoom(100);
        System.out.println("cost of reserving room:" +r.reserve());
        VIPDinnerDecorator v = new VIPDinnerDecorator(r,80);
        System.out.println("cost of reserving room:" +v.reserve());

    }
    
}
