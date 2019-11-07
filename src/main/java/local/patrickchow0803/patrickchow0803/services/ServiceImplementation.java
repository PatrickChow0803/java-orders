package local.patrickchow0803.patrickchow0803.services;


import local.patrickchow0803.patrickchow0803.models.Agent;
import local.patrickchow0803.patrickchow0803.models.Customer;
import local.patrickchow0803.patrickchow0803.models.Order;
import local.patrickchow0803.patrickchow0803.repositories.AgentRepo;
import local.patrickchow0803.patrickchow0803.repositories.CustomerRepo;
import local.patrickchow0803.patrickchow0803.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "service")
public class ServiceImplementation implements local.patrickchow0803.patrickchow0803.services.Service {
    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private AgentRepo agentRepo;

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public List<Customer> getCustomersWithOrders() {
        return customerRepo.getAllBy();
    }

    @Override
    public Customer getCustomerById(long id) {
        return customerRepo.getByCustcode(id);
    }

    @Override
    public List<Customer> getCustomersLikeName(String likename) {
        return customerRepo.findByCustnameContainingIgnoringCase(likename);
    }

    @Override
    public Agent getAgentById(long id) {
        return agentRepo.getByAgentcode(id);
    }

    @Override
    public Order getOrderById(long id) {
        return orderRepo.getByOrdnum(id);
    }
}