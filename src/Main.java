
public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1, "Phone", 80000, "Mobile");
        Product product2 = new Product(1, "Phone", 80000, "Mobile");
        Product product3 = new Product(1, "EliteBook", 80000, "Laptop");
        System.out.println(product1.equals(product2));

        Order order1 = new Order("Иван", new Product[]{product1, product3});
        Order order2 = new Order("Гриша", new Product[]{product2, product3});
        Order order3 = new Order("Гриша", new Product[]{product1, product1});

        System.out.println(order1.equals(order3));
        System.out.println(order2.equals(order3));
    }

}
