/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sun.weld.tests.BasicQualifierTests;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author sreekanth
 */
@School
public class SchoolBoy implements Boy {

    @Override
    public String gotoSchool() {
        System.out.println("SCHOOL");
        return "SCHOOL";

    }
}
