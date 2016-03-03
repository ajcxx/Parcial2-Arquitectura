/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author Armando
 */
 
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class PizzeriaForm {
     
    private String option;
     
    public String getOption() {
        return option;
    }
 
    public void setOption(String option) {
        this.option = option;
    }
}