/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05.collections;

/**
 *
 * @author Rob
 */
interface CollectionInterface<T>{
  boolean add(T element);
  // Attempts to add element to this collection.
  // Returns true if successful, false otherwise.

  T get(T target);
  // Returns an element e from this collection such that e.equals(target).
  // If no such e exists, returns null.

  boolean contains(T target);
  // Returns true if this collection contains an element e such that
  // e.equals(target); otherwise returns false.

  boolean remove (T target);
  // Removes an element e from this collection such that e.equals(target)
  // and returns true. If no such e exists, returns false.

  boolean isFull();
  // Returns true if this collection is full; otherwise, returns false.

  boolean isEmpty();
  // Returns true if this collection is empty; otherwise, returns false.
  
  int size();
  // Returns the number of elements in this collection.  
}
