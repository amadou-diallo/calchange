
package calchangemakeup;

import java.util.Scanner;

/**
 *
 * @author Amadou MakeUp 
 */
public class CalChangeMakeUp {

       //glogal variables here...
    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        //local variables..
        String choice;
        int h,q,d,n,p;
        System.out.println("Welcome to the Change Calculator.");
        
        System.out.println("Do you have change? (Y/N) : ");
       
        choice = sc.nextLine();
        
        //System.out.println("Your input was: " + choice);
        
       
    while(choice.equalsIgnoreCase("Y")) {
        h = getCoin("Half-dollars");  
        q = getCoin("Quarters");
        d = getCoin("Dimes");
        n = getCoin("Nickels");
        p = getCoin("Pennies");
         
        
       getTotal(h,q,d,n,p);
     
        }//end of while
         }//end of main
    public static int getCoin(String Coinname) {
    int ccount;
    
    do {
        try {
         
             System.out.println(" How many " + Coinname + " Do you have.");
              ccount = sc.nextInt();
              if (ccount < 0) {
              System.out.println("Bad integers, please Enter a positive one");
        }
        }catch (Exception e) {
              System.out.println("Illegal Input: input positive values plz.");
              ccount = -1;
              sc.nextLine();
            
        }
    } while(ccount < 0);
      return ccount;  
}

    
    public static void getTotal(int HD, int QR, int DM, int NC, int PN) {
        
        int totcents,dollars,cents;
       
        totcents = (HD *50) + (QR * 25) + (DM * 10) + (NC * 5) + PN;
        dollars = totcents / 100;
        cents = totcents % 100;
        System.out.println("You have " + totcents + " Cent(s). "
                           + "which is " + dollars + " dollars and "
                           + cents + " cents."); 
        
        
    }
       
  };   