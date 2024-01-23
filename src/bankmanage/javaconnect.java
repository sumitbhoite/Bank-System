/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanage;
import java.lang.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Acer
 */
public class javaconnect {
    public static void main(String args[]){
    loading lod=new loading();
    lod.setVisible(true);
    lod.progressbar.setMinimum(0);
    try{
    for(int i=0;i<=100;i++){
        Thread.sleep(50);
        lod.progressbar.setValue(i);
        int n=lod.progressbar.getValue();
        if(n==100){
            
           mylogin ml=new mylogin();
            ml.setVisible(true);
            lod.dispose();
        }
    }
    
}catch(Exception e){
    e.printStackTrace();
    
}
}   
    
}
