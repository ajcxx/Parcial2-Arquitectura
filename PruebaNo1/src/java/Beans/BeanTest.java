/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Carlos
 */
@Named(value = "beanTest")
@Dependent
public class BeanTest {

    /**
     * Creates a new instance of BeanTest
     */
    public BeanTest() {
    }
    
}
