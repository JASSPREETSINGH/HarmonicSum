/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmonicsum;

/**
 *
 * @author Dell
 */
public class HarmonicSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sumL2R=0;
        double sumR2L=0;
        int upperbound=100;
        int lowerbound=1;
        for(int denominator=1;denominator<=upperbound;denominator++)
        {
            sumL2R=sumL2R+((double)1/denominator);//type cast int to double because int/int is equal to int 
            
         
        }
        System.out.println("sum from left to right "+sumL2R);//less precise
        
        for(int denominator=100;denominator>=lowerbound;denominator--)//for sum right to left
        {
            sumR2L=sumR2L+((double)1/denominator);//type cast int to double because int/int is equal to int 
            
         
        }
        System.out.println("sum from right to left "+sumR2L);//more precise
        // TODO code application logic here
    }
    
}
