/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso_bd;

import java.util.Date;

/**
 *
 * @author Labing
 */
public abstract class Employee extends Person{
        protected Date hiringDate;

        public Employee(String id, String name) {
            super(id, name);
            this.hiringDate = hiringDate;
            
        }

    public Date getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }
        
    public abstract float paySalary();
            
        }
