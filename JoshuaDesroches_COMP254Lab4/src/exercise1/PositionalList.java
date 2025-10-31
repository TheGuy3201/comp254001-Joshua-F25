/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package exercise1;

import java.util.Iterator;

/**
 * A simplified PositionalList interface with only the methods needed for
 * the lab exercises and the provided driver.
 */
public interface PositionalList<E> extends Iterable<E> {

  /** Returns the number of elements in the list. */
  int size();

  /** Tests whether the list is empty. */
  boolean isEmpty();

  /** Returns the index of the element stored at position p, or -1 if not found. */
  int indexOf(Position<E> p);

  /** Returns the first Position in the list (or null, if empty). */
  Position<E> first();

  /** Returns the Position immediately after Position p (or null, if p is last). */
  Position<E> after(Position<E> p) throws IllegalArgumentException;

  /** Inserts an element at the front of the list and returns its Position. */
  Position<E> addFirst(E e);

  /** Inserts an element at the back of the list and returns its Position. */
  Position<E> addLast(E e);

  /** Returns an iterator of the elements stored in the list. */
  Iterator<E> iterator();

}
