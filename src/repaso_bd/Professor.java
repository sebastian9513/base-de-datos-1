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
public class Professor extends Employee{
    protected String school;
    protected String department;

    public Professor(String id, String name) {
        super(id, name);
    }

    @Override
    public float paySalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
