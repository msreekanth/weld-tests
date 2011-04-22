/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sun.weld.tests.BasicQualifierTests;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

/**
 *
 * @author sreekanth
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD , ElementType.FIELD,ElementType.PARAMETER})
public @interface College {

}
