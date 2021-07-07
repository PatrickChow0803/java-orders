package local.patrickchow0803.patrickchow0803.repositories;

import local.patrickchow0803.patrickchow0803.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Long> {
    Order getByOrdnum(long ordnum);
}