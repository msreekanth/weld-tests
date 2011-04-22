/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sun.weld.tests.BasicQualifierTests;


/**
 *
 * @author sreekanth
 */
@College
public class CollegeBoy implements Boy{

    @Override
    public String gotoSchool() {
        System.out.println("COLLEGE");
        return "COLLEGE";
    }


}
