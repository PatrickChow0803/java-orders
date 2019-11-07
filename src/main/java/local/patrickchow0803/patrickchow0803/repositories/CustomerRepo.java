package local.patrickchow0803.patrickchow0803.repositories;


import local.patrickchow0803.patrickchow0803.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
    ArrayList<Customer> findByCustnameContainingIgnoringCase(String likename);

    ArrayList<Customer> getAllBy();

    Customer getByCustcode(long custcode);
}