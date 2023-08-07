//package trynew;
//
//// Interfejs reprezentujący serwis informacyjny
//interface InformationService {
//    void inform(User user);
//}
//
//// Interfejs reprezentujący serwis obsługujący zamówienia produktów
//interface ProductService {
//    boolean order(User user, Product product);
//}
//
//// Interfejs reprezentujący repozytorium zamówień produktów
//interface ProductOrderRepository {
//    void createOrder(User user, Product product);
//}
//
//// Klasa reprezentująca użytkownika
//class User {
//    private String username;
//
//    public User(String username) {
//        this.username = username;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//}
//
//// Klasa reprezentująca produkt
//class Product {
//    private String name;
//
//    public Product(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//// Implementacja serwisu informacyjnego
//class EmailInformationService implements InformationService {
//    @Override
//    public void inform(User user) {
//        System.out.println("Informing user " + user.getUsername() + " via email.");
//    }
//}
//
//// Implementacja serwisu obsługującego zamówienia produktów
//class ProductOrderService implements ProductService {
//    private InformationService informationService;
//    private ProductOrderRepository productOrderRepository;
//
//    public ProductOrderService(InformationService informationService, ProductOrderRepository productOrderRepository) {
//        this.informationService = informationService;
//        this.productOrderRepository = productOrderRepository;
//    }
//
//    @Override
//    public boolean order(User user, Product product) {
//        // Symulacja procesu zamówienia
//        boolean isOrdered = /* Logika zamówienia produktu */;
//
//        if (isOrdered) {
//            informationService.inform(user);
//            productOrderRepository.createOrder(user, product);
//        }
//
//        return isOrdered;
//    }
//}
//
//// Implementacja repozytorium zamówień produktów
//class InMemoryProductOrderRepository implements ProductOrderRepository {
//    @Override
//    public void createOrder(User user, Product product) {
//        System.out.println("Creating order for user " + user.getUsername() + " - Product: " + product.getName());
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        InformationService informationService = new EmailInformationService();
//        ProductOrderRepository productOrderRepository = new InMemoryProductOrderRepository();
//        ProductService productOrderService = new ProductOrderService(informationService, productOrderRepository);
//
//        User user = new User("john_doe");
//        Product product = new Product("Game123");
//
//        boolean isOrdered = productOrderService.order(user, product);
//
//        if (isOrdered) {
//            System.out.println("Order successful!");
//        } else {
//            System.out.println("Order failed.");
//        }
//    }
//}
