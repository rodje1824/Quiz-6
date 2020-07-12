/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_6;

/**
 *
 * @author DOTR
 * @param <E>
 */
public interface Position<E> {
    public E getElement() throws IllegalStateException;
}
