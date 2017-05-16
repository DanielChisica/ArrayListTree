/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * An ArrayList Binary Tree
 *
 * @author Daniel Jiménez Chísica
 * @since 11 May 2017
 */
public class ArrayListTree<T> {

    public ArrayList<T> Tree = new ArrayList<>();
    public int size;
    public T first;

    /**
     * Initializes an ArrayList Binary Tree
     */
    public ArrayListTree() {
        size = 0;
        first=null;
        Tree.add(first);
    }

    /**
     * Wonders if a position is a root
     *
     * @param p The input position
     * @return True is or false isn't
     */
    public boolean isRoot(T p) {
        return Tree.indexOf(p) == 0;
    }

    /**
     * Obtains the root of the Tree
     *
     * @return The root
     */
    public T root() {
        return Tree.get(0);
    }

    /**
     * Obtains the size of the Tree
     *
     * @return The size
     */
    public int size() {
        return size;
    }

    /**
     * Obtains the parent of a specific position
     *
     * @param p The position
     * @return Its parent
     * @throws IllegalArgumentException If the parent is null
     */
    public T parent(T p) throws IllegalArgumentException {
        T parent = null;
        if (isRoot(p)) {
            throw new IllegalArgumentException("The position is a root");
        }

        if (Tree.indexOf(p) % 2 == 0) {
            parent = Tree.get((Tree.indexOf(p) - 2) / 2);
        } else {
            parent = Tree.get((Tree.indexOf(p) - 1) / 2);
        }
        return parent;
    }

    /**
     * Obtains the children of a position in an ArrayList
     *
     * @param p The position
     * @return Its children
     * @throws IllegalArgumentException Hasn't children
     */
    public Iterable children(T p) throws IllegalArgumentException {
        ArrayList<T> children = new ArrayList<>();

        if (Tree.get((Tree.indexOf(p) * 2) + 1) != null) {
            children.add(Tree.get((Tree.indexOf(p) * 2) + 1));
        }

        if (Tree.get((Tree.indexOf(p) * 2) + 2) != null) {
            children.add(Tree.get((Tree.indexOf(p) * 2) + 2));
        }

        if (Tree.get((Tree.indexOf(p) * 2) + 1) == null && Tree.get((Tree.indexOf(p) * 2) + 2) == null) {
            throw new IllegalArgumentException("The position hasn't children");
        }

        return children;
    }

    /**
     * Returns the number of the children in a position
     *
     * @param p The position
     * @return The number of its children
     */
    public int numChildren(T p) {
        int counter = 0;
        if (Tree.get((Tree.indexOf(p) * 2) + 1) != null) {
            counter++;
        }

        if (Tree.get((Tree.indexOf(p) * 2) + 2) != null) {
            counter++;
        }

        return counter;
    }

    /**
     * Assigns the left child of an element
     *
     * @param element The element to be the left child
     * @param p The chosen element
     * @throws IllegalArgumentException The position has already a left element
     */
    public void addLeftChild(T element, T p) throws IllegalArgumentException {
        int index = (Tree.indexOf(p) * 2) + 1;

        if (Tree.get(index) != null) {
            throw new IllegalArgumentException("The position has already a left child");
        } else {
            Tree.set(index, element);
            size++;
        }
    }

    /**
     * Assigns the right child of an element
     *
     * @param element The element to be the left child
     * @param p The chosen element
     * @throws IllegalArgumentException The position has already a right child
     */
    public void addRightChild(T element, T p) throws IllegalArgumentException {
        int index = (Tree.indexOf(p) * 2) + 2;

        if (Tree.get(index) != null) {
            throw new IllegalArgumentException("The position has already a Right Child");
        } else {
            Tree.set(index, element);
            size++;
        }
    }

    /**
     * Assigns the root
     *
     * @param element The root
     */
    public void addRoot(T element) {
        if (first!=null) {
            throw new IllegalArgumentException("A root already exists");
        } else {
        Tree.set(0, element);
        Tree.add(1, null);
        Tree.add(2, null);
        size=1;
        }
    }

    /**
     * Increase the size of the ArrayList Binary Tree
     *
     * @param addSize The added spaces
     */
    public void increaseSize(int addSize) {
        for (int i = size; i < size + addSize; i++) {
            Tree.add(i, null);
        }

        size = size + addSize;
    }

}
