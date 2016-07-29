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
public class Grad extends Student{
    private int courses;
    
    public Grad(String id, String name) {
        super(id, name);
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }
    
    @Override
    public float paySalary() {
        if(this.courses==1){
            return 2000000;
        }else if(this.courses==2){
            return 3500000;
            
        }else{
            return 0;
        }
    }
   
}
