/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author William
 */
public interface Animal
{
    public String getSpecies ();
    public Integer getAge ();
    public Double getHeight ();
    public Double getWeight ();
    
    public void setSpecies (String value);
    public void setAge (Integer value);
    public void setHeight (Double value);
    public void setWeight (Double value);
}