/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
Реализуйте очередь с помощью LinkedList со следующими методами:
        • enqueue() — помещает элемент в конец очереди,
        • dequeue() — возвращает первый элемент из очереди и удаляет его,
        • first() — возвращает первый элемент из очереди,не удаляя.
*/

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(5);
        list.print(); // 1 2 3 4 5
        list.reverse();
        list.print(); // 5 4 3 2 1

        Queue<String> queue = new Queue<>();
        queue.enqueue("one");
        queue.enqueue("two");
        queue.enqueue("three");
        System.out.println(queue.dequeue()); // one
        System.out.println(queue.first()); // two
        System.out.println(queue.dequeue()); // two
        System.out.println(queue.first()); // three
        System.out.println(queue.dequeue()); // three
        System.out.println(queue.first()); // null
        System.out.println(queue.dequeue()); // null
    }
}