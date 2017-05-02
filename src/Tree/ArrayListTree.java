/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Jiménez Chísica
 */
public class ArrayListTree<T> {
    
    public static void main(String[] args) {
        ArrayListTree tester=new ArrayListTree();
        int obj=4;
        tester.addLeftChild(obj, 4);
        System.out.println("hola");
    }
    
    
    
    
    public ArrayList<T> getTree() {
        return Tree;
    }

    public void setTree(ArrayList<T> Tree) {
        this.Tree = Tree;
    }
    
    private ArrayList<T> Tree=new ArrayList<>(10000);
    
    
    public boolean isRoot(T element){
       return element==Tree.get(0);
    }
    
    public void ensureMaxCapacity(ArrayList list, int cap){
        if(list.size()<cap){
            list.ensureCapacity(cap);
        }
    }
    
     public void addLeftChild(T element, int position){
        int positionLeftChild=(position*2)+1;
        ArrayList<T> ActualTree=new ArrayList<>();
        ActualTree=getTree();
        ActualTree.set(positionLeftChild, element);
        setTree(ActualTree);
    }
    
    public void addRightChild(T element, int position){
        int positionRightChild=(position*2)+2;
        ArrayList<T> ActualTree=new ArrayList<>();
        ActualTree=getTree();
        ActualTree.set(positionRightChild, element);
        setTree(ActualTree);
    }
    
    public boolean isLeftChildren(T element){
        int nextIndex=getTree().indexOf(element)+1;
        return (getTree().indexOf(element))==(getTree().indexOf(getTree().get(nextIndex)))-1;
    }
    
    public boolean isRightChildren(T element){
        int previousIndex=getTree().indexOf(element)-1;
        return (getTree().indexOf(element))==(getTree().indexOf(getTree().get(previousIndex)))+1;
    }
    
    public T getParent(T element){
        ArrayList<T> ActualTree=getTree();
        return isLeftChildren(element)? 
                ActualTree.get(((ActualTree.indexOf(element))-1)/2): 
                ActualTree.get(((ActualTree.indexOf(element))-2)/2);
    }
    
    public T getSibling(T element){
        return isLeftChildren(element)?
                getTree().get((getTree().indexOf(element))+1):
                getTree().get((getTree().indexOf(element))-1);
    }
    
    public ArrayList<T> getChildren(T element){
        int positionLeftChild=((getTree().indexOf(element))*2)+1;
        int positionRightChild=((getTree().indexOf(element))*2)+2;
        ArrayList<T> children=new ArrayList<>();
        children.add(getTree().get(positionLeftChild));
        children.add(getTree().get(positionLeftChild));
        return children;
    }
    
}
