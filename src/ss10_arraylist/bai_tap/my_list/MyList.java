package ss10_arraylist.bai_tap.my_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index,E element){
        if(index>= elements.length){
            throw  new IndexOutOfBoundsException("index: " + index);
        }else if (elements.length==size){
            this.ensureCapacity(5);
        }

        if (elements[index]==null){
            elements[index]= element;
            size++;
        }else {
            for (int i = size+1; i >= index; i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }

    }

    public E remove(int index){
        if(index<0 || index> elements.length){
            throw new IndexOutOfBoundsException("Error index: " + index);
        }else {
            E element = (E) elements[index];
            for (int i = index ; i <size - 1 ; i++) {
                elements[i] = elements[i+1];
            }
            elements[size-1]=null;
            size--;
            return element;
        }

    }

    public int size() {
        return this.size;
    }

        public MyList<E> clone(){
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements,this.size);
        v.size = this.size;
        return v;

    }

    public boolean contains(E o){
        return this.indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                if (elements[i].equals(o)) {
                    return i;
                }
            }
        }
        return index;
    }

    public boolean add(E e){
        if(elements.length == size){
            ensureCapacity(5);
        }
        elements[size] = e;
        size++;
        return true;
    }


    public void ensureCapacity(int minCapacity){
        if(minCapacity<=0){
            throw new IndexOutOfBoundsException("minCapacity: " + minCapacity);
        }else {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements,newSize);
        }
    }

    public E get(int i){
        return (E) elements[i];
    }

    public void clear(){
        size =0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }


}
