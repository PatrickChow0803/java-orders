package local.patrickchow0803.patrickchow0803.services;

import local.patrickchow0803.patrickchow0803.models.Agent;
import local.patrickchow0803.patrickchow0803.models.Customer;
import local.patrickchow0803.patrickchow0803.models.Order;

import java.util.List;

public interface Service {
    List<Customer> getCustomersWithOrders();

    Customer getCustomerById(long id);

    List<Customer> getCustomersLikeName(String likename);

    Agent getAgentById(long id);

    Order getOrderById(long id);
}