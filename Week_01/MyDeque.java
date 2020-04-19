public class MyDeque<E> implements Deque<E> {

    private Object[] elements;

    //基本数据类型的初始值为0
    private int head;

    private int tail;
    
    private <T> T[] copyElements(T[] a) {
        if (head < tail) {
            System.arraycopy(elements, head, a, 0, size());
        } else if (head > tail) {
            int headPortionLen = elements.length - head;
            System.arraycopy(elements, head, a, 0, headPortionLen);
            System.arraycopy(elements, 0, a, headPortionLen, tail);
        }
        return a;
    }

    private void doubleCapacity() {
        assert head == tail;
        int p = head;
        int n = elements.length;
        int r = n - p;
        int newCapacity = n << 1;
        if (newCapacity < 0) {
            throw new IllegalStateException("Sorry, deque too big");
        }
        Object[] a = new Object[newCapacity];
        System.arraycopy(elements, p, a, 0, r);
        System.arraycopy(elements, 0, a, r, p);
        elements = a;
        head = 0;
        tail = n;
    }

    public MyDeque() {
        elements = new Object[16];
    }

    public void addFirst(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        elements[head = (head - 1) & (elements.length - 1)] = e;
        if (head == tail) {
            doubleCapacity();
        }
    }


    public void addLast(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        elements[tail] = e;
        if ((tail = (tail + 1) & (elements.length - 1)) == head) {
            doubleCapacity();
        }
    }
}