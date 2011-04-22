package com.sun.glassfish.weld.injections;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author sreekanth
 */
@Stateless
@LocalBean
public class Calculator {

    public int sum(int num1, int num2) {
        return num1+num2;
    }
    
}

