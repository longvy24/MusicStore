/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicStore;

/**
 *
 * @author lfv5020
 */
public class Vinyl extends Inventory {
    protected int size;           //vinyl sizes 33, 45, 78
    protected String vintage;     // Orignal vinyls or Reprints.
    

    public void setSize(int s){
    size = s;
    }
    public void setVintage(String v){
    vintage = v;
    }

    
    public int getSize(){
    return size;
    }
    public String getVintage(){
    return vintage;
    }
 
}
