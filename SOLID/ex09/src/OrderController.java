public class OrderController {
    OrderRepository repo;
    public OrderController(OrderRepository orderRepository) {
        this.repo = orderRepository;
    }

    void create(String id){
        
        repo.save(id);
        System.out.println("Created order: " + id);
    }
}