package local.patrickchow0803.patrickchow0803.repositories;

import local.patrickchow0803.patrickchow0803.models.OrderPayment;
import org.springframework.data.repository.CrudRepository;

public interface OrderPaymentRepo extends CrudRepository<OrderPayment, Long> {
}