/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_aaryaman_chaudhry;

/**
 *
 * @author Aaryaman
 */
public interface Food {
    public abstract double getSubTotal();
    @Override
    public abstract String toString();
    
    public abstract int getCalories();
}
