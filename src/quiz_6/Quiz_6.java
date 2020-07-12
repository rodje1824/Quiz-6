/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_6;

/**
 *
 * @author DOTR
 */
public class Quiz_6 {
    
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedPositionlist<String> list = new LinkedPositionlist<>();
        Position p1 = list.addFirst("Position1");
        Position p2 = list.addAfter(p1, "After position 1");
        Position p3 = list.addBefore(p2, "Before p2");
        Position p4 = list.addLast("Last Position");
        
        System.out.println("Original Positional list:");
        list.showPositionList();
        System.out.println("");
       
        
        System.out.println("");
        System.out.println("Removed: After Position 1");
        list.remove(p2);
        list.showPositionList();
        System.out.println("");
       
         System.out.println("");
         System.out.println("Move to Front:");
        list.moveToFront(p4, "Last position");
        list.showPositionList();
        
     
        
       
    }  
}

