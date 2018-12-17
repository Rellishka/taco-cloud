package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.model.Order;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByZip(String zip);

}
