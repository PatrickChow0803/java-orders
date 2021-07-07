package local.patrickchow0803.patrickchow0803.repositories;

import local.patrickchow0803.patrickchow0803.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<Payment, Long> {
}