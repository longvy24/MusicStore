/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicStore;
import java.util.Scanner;

/**
 *
 * @author lfv5020
 */
public class Inventory implements Price {
    
    protected String platform;  //CDs or Vinyls
    protected String artistName;
    protected String albumName;
    protected String quality; //Couldn't think of anything better to describe New or Used
    protected float price;   //Total price plus tax and other additionals.
    private float cdPrice;  // CD price
    protected float vPrice;  //Vinyl Price
    
    
    public Inventory(){
    artistName = "";
    albumName = "";
    quality = "";
    platform ="";
    }
    
    public void setPlatform(String p){
    platform = p;
    }
    public void setArtistName (String arn){
    artistName = arn;  
    } 
    public void setAlbumName (String aln){
    albumName = aln;
    }
    public void setQuality(String q){
    quality = q;
    }
    
    
    public String getPlatform(){
    return platform;
    }
    public String getArtistName(){
    return artistName;
    }   
    public String getalbumName(){
    return albumName;
    }
    public String getQuality(){
    return quality;
    }
    
    public float getPrice(){     

        if (platform.equals("CD") || platform.equals("cd"))
        {
            cdPrice = 15;
               
                switch (quality) {
                    case "new":
                    case "New":
                        price = (float) (cdPrice);                             //Price of a new CD 
                        break;
                    case "used":
                    case "Used":
                        price = (float) (cdPrice - 5);                      //Price of a used CD discounted 5 dollars plus tax
                        break;
                    default:
                        System.out.println("Please enter valid option (New or Used)");
                        break;
                }
            
        }
        else if (platform.equals("Vinyl") || quality.equals("vinyl"))
        {
            vPrice = 20;
 
                switch (quality) {
                    case "new":
                    case "New":
                        price = (float) (vPrice);                                //Price of a new vinyl 20
                        break;
                    case "used":
                    case "Used":
                        price = (float) (vPrice - 5);                       //Price of a used vinyl plus tax (20 - 5 + tax)  
                        break;
                    default:
                        System.out.println("Please enter valid option (New or Used)");
                        break;
                }          
        
        }
        else
        {
            System.out.println("Please enter valid option (CD or Vinyl)");
        }
                         
                
    return price;     
                            }


    
    
    
    
    
    
    
    
}
