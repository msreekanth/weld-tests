package com.sun.glassfish.weld.injection.tests;

import javax.ejb.EJB;

import junit.framework.Assert;

import org.jboss.arquillian.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.ByteArrayAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sun.glassfish.weld.injections.Calculator;


@RunWith(Arquillian.class)
public class CalculatorEJBTest {

	@Deployment
	public static Archive<?> deploy() {
		return ShrinkWrap
				.create(WebArchive.class)
				.addPackage(Calculator.class.getPackage())
				.addPackage(CalculatorEJBTest.class.getPackage())
				.addAsManifestResource(
						new ByteArrayAsset("<beans/>".getBytes()),
						ArchivePaths.create("beans.xml"));
	}

	@EJB
	Calculator calculatorRef;

	@Test
	public void testCalcService() {
		if (calculatorRef == null) {
			Assert.fail("EJB reference for LocalEJB couldnt be found");
		} else {
			Assert.assertTrue("Success", (calculatorRef.sum(2, 2) == 4));
		}
	}
}
