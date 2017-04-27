/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

import java.util.List;

/**
 *
 * @author Daniel Jiménez Chísica
 */
public class ArrayListTree<T> {
    
    public List<T> Tree;
    
    public boolean isRoot(T element){
        if(Tree.get(0)==element){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isRightChildren(T element)
    
    
}
