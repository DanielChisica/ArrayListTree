/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie_000
 */
public class ArrayListTreeTest {
    
    public ArrayListTreeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTree method, of class ArrayListTree.
     */
    @Test
    public void testGetTree() {
        System.out.println("getTree");
        ArrayListTree instance = new ArrayListTree();
        ArrayList expResult = null;
        ArrayList result = instance.getTree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTree method, of class ArrayListTree.
     */
    @Test
    public void testSetTree() {
        System.out.println("setTree");
        ArrayListTree instance = new ArrayListTree();
        instance.setTree(null);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isRoot method, of class ArrayListTree.
     */
    @Test
    public void testIsRoot() {
        System.out.println("isRoot");
        int element = 4;
        ArrayListTree instance = new ArrayListTree();
        instance.addRightChild(element, 0);
        boolean expResult = true;
        boolean result = instance.isRoot(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addLeftChild method, of class ArrayListTree.
     */
    @Test
    public void testAddLeftChild() {
        System.out.println("addLeftChild");
        Object element = null;
        int position = 0;
        ArrayListTree instance = new ArrayListTree();
        instance.addLeftChild(element, position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRightChild method, of class ArrayListTree.
     */
    @Test
    public void testAddRightChild() {
        System.out.println("addRightChild");
        Object element = null;
        int position = 0;
        ArrayListTree instance = new ArrayListTree();
        instance.addRightChild(element, position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLeftChildren method, of class ArrayListTree.
     */
    @Test
    public void testIsLeftChildren() {
        System.out.println("isLeftChildren");
        Object element = null;
        ArrayListTree instance = new ArrayListTree();
        boolean expResult = false;
        boolean result = instance.isLeftChildren(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRightChildren method, of class ArrayListTree.
     */
    @Test
    public void testIsRightChildren() {
        System.out.println("isRightChildren");
        Object element = null;
        ArrayListTree instance = new ArrayListTree();
        boolean expResult = false;
        boolean result = instance.isRightChildren(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParent method, of class ArrayListTree.
     */
    @Test
    public void testGetParent() {
        System.out.println("getParent");
        Object element = null;
        ArrayListTree instance = new ArrayListTree();
        Object expResult = null;
        Object result = instance.getParent(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSibling method, of class ArrayListTree.
     */
    @Test
    public void testGetSibling() {
        System.out.println("getSibling");
        Object element = null;
        ArrayListTree instance = new ArrayListTree();
        Object expResult = null;
        Object result = instance.getSibling(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChildren method, of class ArrayListTree.
     */
    @Test
    public void testGetChildren() {
        System.out.println("getChildren");
        Object element = null;
        ArrayListTree instance = new ArrayListTree();
        ArrayList expResult = null;
        ArrayList result = instance.getChildren(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
