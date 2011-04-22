/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sun.weld.tests.BasicQualifierTests;

import javax.inject.Inject;

import org.jboss.arquillian.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.ByteArrayAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
/**
 *
 * @author sreekanth
 */
@RunWith(Arquillian.class)

public class QualifierTest {

   @Deployment
   public static Archive<?> deploy()
   {
      return ShrinkWrap.create(JavaArchive.class)
         .addPackage(QualifierTest.class.getPackage()).addAsManifestResource(
                 new ByteArrayAsset("<beans/>".getBytes()), 
                 ArchivePaths.create("beans.xml"));
   }

   
    @Inject @School Boy scholBoy;
    @Inject @College Boy collegeBoy;
   
    @Test
    public void testSchoolQualifier()
    {
       Assert.assertArrayEquals("SCHOOL".toCharArray(),scholBoy.gotoSchool().toCharArray()) ;      
    } 

    @Test
    public void testCollegeQualifier()
    {
       Assert.assertArrayEquals("COLLEGE".toCharArray(),collegeBoy.gotoSchool().toCharArray()) ;      
    }
}
