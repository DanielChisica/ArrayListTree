/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

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
     * Test of isRoot method, of class ArrayListTree.
     */
    @Test
    public void testIsRoot() {
        System.out.println("isRoot");
        Object p = 4;
        ArrayListTree instance = new ArrayListTree();
        instance.addRoot(p);
        boolean expResult = true;
        boolean result = instance.isRoot(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of root method, of class ArrayListTree.
     */
    @Test
    public void testRoot() {
        System.out.println("root");
        ArrayListTree instance = new ArrayListTree();
        Object expResult =4;
        instance.addRoot(4);
        Object result = instance.root();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of size method, of class ArrayListTree.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayListTree instance = new ArrayListTree();
        instance.addRoot(6);
        instance.addRightChild(2, 6);
        int expResult = 2;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of parent method, of class ArrayListTree.
     */
    @Test
    public void testParent() {
        System.out.println("parent");
        ArrayListTree instance = new ArrayListTree();
        instance.addRoot(6);
        instance.addRightChild(2, 6);
        
        Object expResult = 6;
        Object result = instance.parent(2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of children method, of class ArrayListTree.
     */
    @Test
    public void testChildren() {
        System.out.println("children");
        ArrayListTree instance = new ArrayListTree();
        ArrayListTree instance2= new ArrayListTree();
        instance.addRoot(6);
        instance.addRightChild(2, 6);
        instance2.addRoot(6);
        instance2.addRightChild(2, 6);
        
        Iterable expResult = instance2.children(6);
        Iterable result = instance.children(6);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of numChildren method, of class ArrayListTree.
     */
    @Test
    public void testNumChildren() {
        System.out.println("numChildren");
        ArrayListTree instance = new ArrayListTree();
        instance.addRoot(6);
        instance.addRightChild(2, 6);
        instance.addLeftChild(3, 6);
        int expResult = 2;
        int result = instance.numChildren(6);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addLeftChild method, of class ArrayListTree.
     */
    @Test
    public void testAddLeftChild() {
        System.out.println("addLeftChild");
        ArrayListTree instance = new ArrayListTree();
        instance.addRoot(6);
        instance.addLeftChild(30, 6);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addRightChild method, of class ArrayListTree.
     */
    @Test
    public void testAddRightChild() {
        System.out.println("addRightChild");
        ArrayListTree instance = new ArrayListTree();
        instance.addRoot(6);
        instance.addRightChild(99, 6);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addRoot method, of class ArrayListTree.
     */
    @Test
    public void testAddRoot() {
        System.out.println("addRoot");
        ArrayListTree instance = new ArrayListTree();   
        instance.addRoot(2);
    }

    /**
     * Test of increaseSize method, of class ArrayListTree.
     */
    @Test
    public void testIncreaseSize() {
        System.out.println("increaseSize");
        int addSize = 10;
        ArrayListTree instance = new ArrayListTree();
        instance.increaseSize(addSize);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
