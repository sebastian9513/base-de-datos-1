/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso_bd;

/**
 *
 * @author Labing
 */
public class FullTime extends Professor{
    private float salary;
    
    public FullTime(String id, String name) {
        super(id, name);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    @Override
    public float paySalary() {
        return this.salary;
    }
   
}
