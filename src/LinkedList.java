public class LinkedList<T> { // Класс, формирующий список элементов
    LinkedListNode<T> head;

    public void add(T value) { // Метод, добавляющий элементы в спискок.
        LinkedListNode<T> newNode = new LinkedListNode<>(value);
        if (head == null) { // Если список пуст, добавляется первый элемент.
            head = newNode;
        } else {    //  Иначе
            LinkedListNode<T> current = head;
            while (current.next != null) {  //  Пока есть элементы.
                current = current.next; //  Они добавляюся в список.
            }
            current.next = newNode;
        }
    }

    public void reverse() { // Метод, "переворачивающий" элементы списка.
        LinkedListNode<T> prev = null;
        LinkedListNode<T> current = head;
        while (current != null) {
            LinkedListNode<T> next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void print() { // Метод, печатающий список.
        LinkedListNode<T> current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}