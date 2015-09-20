package com.jprogrammers.spring;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

/**
 * Created by alireza on 9/20/15.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })*/
public class MovieFinderTest extends TestCase {

    public void testInjectionByConstructor() {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");

        MovieLister movieLister = context.getBean(MovieLister.class);

        assertEquals(1 , movieLister.moviesDirectedBy("Peter Jackson").size());

    }

}
