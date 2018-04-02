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
public class CD extends Inventory {
    
    protected String type;        // Standard, Special Edition, or LP 
    protected String ogCase;    // Does it have original case?
    
    
    
    public void setType(String t){
    type = t;
    }
    public void setogCase(String c){
    ogCase = c;
    }

    public String getType(){
    return type;
    }
    public String getogCase(){
    return ogCase;
    }
    
    
    
    
}
