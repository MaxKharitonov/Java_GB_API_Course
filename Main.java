import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Shop {
    private Set<Laptop> laptops = new HashSet<>();
    private Map<Integer, String> filterCriteria = new HashMap<>();

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void setFilterCriteria(Map<Integer, String> filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    public Set<Laptop> filterLaptops() {
        Set<Laptop> result = new HashSet<>();
        for (Laptop laptop : laptops) {
            boolean match = true;
            for (Map.Entry<Integer, String> entry : filterCriteria.entrySet()) {
                switch (entry.getKey()) {
                    case 1:
                        if (!laptop.getBrand().equals(entry.getValue())) {
                            match = false;
                        }
                        break;
                    case 2:
                        if (!laptop.getColor().equals(entry.getValue())) {
                            match = false;
                        }
                        break;
                }
            }
            if (match) {
                result.add(laptop);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();

        // ������� ��������� ���������
        Laptop laptop1 = new Laptop("Apple", "Silver", 2000);
        Laptop laptop2 = new Laptop("Dell", "Black", 1500);
        Laptop laptop3 = new Laptop("HP", "White", 1200);
        Laptop laptop4 = new Laptop("Lenovo", "Black", 1000);

        // ��������� �������� � �������
        shop.addLaptop(laptop1);
        shop.addLaptop(laptop2);
        shop.addLaptop(laptop3);
        shop.addLaptop(laptop4);

        // ������ �������� ����������
        Map<Integer, String> filterCriteria = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����, ��������������� ������������ ��������:\n" +
                "1 - �����\n" +
                "2 - ����");
        int criterion = scanner.nextInt();
        System.out.println("������� ����������� �������� ��� ���������� ��������:");
        String value = scanner.next();
        filterCriteria.put(criterion, value);
        shop.setFilterCriteria(filterCriteria);

        // ��������� �������� � ������� ����������
        Set<Laptop> filteredLaptops = shop.filterLaptops();
        System.out.println("��������� ��������:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println("�����: " + laptop.getBrand() +
                    ", ����: " + laptop.getColor() +
                    ", ����: " + laptop.getPrice());
        }
    }
}