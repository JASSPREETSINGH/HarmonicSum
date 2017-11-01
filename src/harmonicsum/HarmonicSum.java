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
        double sum=1;
        int upperbound=100;
        for(int denominator=1;denominator<upperbound;denominator++)
        {
            sum=sum+((double)1/denominator);//type cast int to double because int/int is equal to int 
            
         
        }
        System.out.println("sum is "+sum);
        // TODO code application logic here
    }
    
}
