package prac8;

// принимает ограниченное кол-во эл-тов

import java.util.Collection;

public class BoundedWaitList <E> extends WaitList <E>{

    private int capacity;

    public BoundedWaitList(int capacity){
        super();
        if(capacity <= 0)
            //Предпринята попытка выполнения операции в то время, когда объект не находится в соответствующем состоянии
            throw new IllegalArgumentException("Максимальный размер должен быть больше 0! Получено значение: " + capacity);
        this.capacity = capacity;
    }

    public BoundedWaitList(Collection<E> col){
        super(col);
        this.capacity = col.size();
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if(components.size() == capacity)
            //Предпринята попытка выполнения операции в то время, когда объект не находится в соответствующем состоянии
            throw new IllegalStateException("Очередь заполнена!");
        components.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList(" + capacity + "): " + components;
    }
}
