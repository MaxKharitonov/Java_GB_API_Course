public class Queue<T> { // Класс, оперирующий элементами списка.
    LinkedList<T> list = new LinkedList<>();

    public void enqueue(T value) {
        list.add(value);
    }   // Добавление, элемента в конец списка.

    public T dequeue() {    //  Метод, возвращающий первый элемента из списка и удаляющий его.
        if (list.head == null) {
            return null;
        } else {
            T value = list.head.value;
            list.head = list.head.next;
            return value;
        }
    }

    public T first() { // Метод, возвращающий первый элемент списка.
        if (list.head == null) {
            return null;
        } else {
            return list.head.value;
        }
    }
}