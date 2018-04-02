/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicStore;

import java.util.Scanner;
import java.text.DecimalFormat;



/**
 *
 * @author lfv5020
 */
public class MusicStore {

    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        Inventory in1 = new Inventory();
        CD c1 = new CD();
        Vinyl v1 = new Vinyl();  
        v1.vPrice = 20;    
       
        float fTotal = 0;

            System.out.print("What are you buying? (CD or Vinyl): ");
            in1.platform = sc.nextLine();
            
                switch (in1.platform) {
                    case "cd":
                    case "CD":
                        {
                            System.out.print("Artist Name: ");
                            in1.artistName = sc.nextLine();
                            System.out.print("Album Name: ");
                            in1.albumName = sc.nextLine();
                            System.out.print("Quality?: ");                // New/Used Condition with interface code
                            in1.quality = sc.nextLine();                                                     
                            
                            if(in1.quality.equals("Used") || in1.quality.equals("used"))
                                {
                                        System.out.print("Original Case?: ");  
                                        c1.ogCase = sc.nextLine();
                                        
                                switch (c1.ogCase) {
                                    case "yes":
                                    case "Yes":
                                        fTotal = in1.getPrice();                                
                                        break;
                                    case "no":
                                    case "No":
                                        fTotal = in1.getPrice() - 1;
                                        break;
                                    default:
                                        System.out.print("Please enter a valid answer.");
                                        break;
                                                    }
                                }
                            
                            System.out.print("Type? (Standard, Special Edition, EP): ");
                            c1.type = sc.nextLine();
                            
                            switch (c1.type) {
                                case "standard":
                                case "Standard":
                                    fTotal = (in1.getPrice() * 1.06f);                                  // total should be 15 
                                    break;
                                case "special edition":
                                case "Special Edition":
                                    fTotal = ((in1.getPrice() + 10) * 1.06f);                        // total should be 15 + 10 + tax
                                    break;
                                case "EP":
                                case "ep":
                                    fTotal = ((in1.getPrice() - 3) * 1.06f);                         //total should be 15 - 3 + tax
                                    break;
                                default:
                                    System.out.print("Please enter a valid option (Standard, Special edition, or LP: ");
                                    break;
                                           }       
 
                                    System.out.println("Pruchased: " + in1.getPlatform());  
                                    System.out.println("Artist Name: " + in1.getArtistName());
                                    System.out.println("Album Name: " + in1.getalbumName());
                                    System.out.println("New or Used?: " + in1.getQuality());
                                    
                                    if(in1.quality.equals("Used") || in1.quality.equals("used"))
                                    {
                                        System.out.print("Original Case?: " + c1.getogCase());  
                                        System.out.print("\n");
                                        if(c1.ogCase.equals("yes") || c1.ogCase.equals("Yes"))
                                        {
                                            fTotal = in1.getPrice();
                                            fTotal = (fTotal + 1) * 1.06f;
                                        }
                                        else
                                        {
                                            fTotal = fTotal + 0;
                                        }
                                    }
                                    
                                    System.out.println("Type: " + c1.getType());
                                    System.out.println("Price: $" +  df2.format(fTotal));
                                    break;
                        }    //CD case end
                        
                //vinyl option
                    case "vinyl":
                    case "Vinyl": 
                    {
                            System.out.print("Artist Name: ");
                            in1.artistName = sc.nextLine();
                            System.out.print("Album Name: ");
                            in1.albumName = sc.nextLine();
                            System.out.print("Quality?: ");
                            in1.quality = sc.nextLine();
                            System.out.print("Vintage?: ");
                            v1.vintage = sc.nextLine();                          
                                                                                      
                                System.out.print ("Size? (33, 45, 78): ");                       // Vinyle size choices         FIGURE OUT WHY VINYL PRICE DOESN'T COME OVER (Use v1.vPrice to substitute)
                                v1.size = sc.nextInt();
                                
                                    switch (v1.size) {
                                        case 33:
                                            fTotal = (v1.vPrice * 1.06f);                //price (20 + tax)
                                            break;
                                        case 45:
                                            fTotal = ((v1.vPrice + 5) * 1.06f);            //price (20 + 5 + tax)
                                            break;
                                        case 78:
                                            fTotal = ((v1.vPrice + 10) * 1.06f);           //price(20 + 10 + tax)
                                            break;
                                        default:
                                            System.out.println("Please enter a valid option (33, 45, 78)");                                            
                                            break;
                                                     }                              //size switch
                                                                                                                                      
                                    System.out.println("Pruchased: " + in1.getPlatform());  
                                    System.out.println("Artist Name: " + in1.getArtistName());
                                    System.out.println("Album Name: " + in1.getalbumName());
                                    System.out.println("New or Used?: " + in1.getQuality());
                                    System.out.println("Vintage?: " + v1.getVintage());
                                    System.out.println("Size?: " + v1.getSize());
                                    System.out.println("Price: $" + df2.format(fTotal));
                                    break;
                    }  //vinyl case end                    
                    
                    default:
                        System.out.println("Please enter valid option (CD or Vinyl)");
                        break;

                    }   //Platform switch end  
                

  
        
        
        
    


}
    
}
