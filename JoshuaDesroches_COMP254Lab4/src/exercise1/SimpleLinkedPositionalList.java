package exercise1;

/**
 * Minimal doubly-linked positional list implementation for testing.
 * Not feature-complete; sufficient for driver tests of indexOf.
 */
public class SimpleLinkedPositionalList<E> implements PositionalList<E> {

    private static class Node<E> implements Position<E> {
        private E element;
        private Node<E> prev, next;

        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        public E getElement() {
            return element;
        }
    }

    private Node<E> header, trailer;
    private int size = 0;

    public SimpleLinkedPositionalList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.next = trailer;
    }

    // utility
    private Node<E> toNode(Position<E> p) throws IllegalArgumentException {
        if (p == null) return null;
        try {
            return (Node<E>) p;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Invalid position");
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int indexOf(Position<E> p) {
        // traverse from first and compare position references
        int idx = 0;
        Position<E> walk = first();
        while (walk != null) {
            if (walk == p) return idx;
            walk = after(walk);
            idx++;
        }
        return -1;
    }

    @Override
    public Position<E> first() {
        return isEmpty() ? null : header.next;
    }

    @Override
    public Position<E> after(Position<E> p) throws IllegalArgumentException {
        Node<E> node = toNode(p);
        if (node == null) throw new IllegalArgumentException("No such position");
        return node.next == trailer ? null : node.next;
    }

    // add helpers
    private Position<E> addBetween(E e, Node<E> predecessor, Node<E> successor) {
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.next = newest;
        successor.prev = newest;
        size++;
        return newest;
    }

    @Override
    public Position<E> addFirst(E e) {
        return addBetween(e, header, header.next);
    }

    @Override
    public Position<E> addLast(E e) {
        return addBetween(e, trailer.prev, trailer);
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return new java.util.Iterator<>() {
            private Position<E> cursor = first();

            @Override
            public boolean hasNext() {
                return cursor != null;
            }

            @Override
            public E next() {
                if (cursor == null) return null;
                E val = cursor.getElement();
                cursor = after(cursor);
                return val;
            }
        };
    }
}

