package local.patrickchow0803.patrickchow0803.controllers;

import local.patrickchow0803.patrickchow0803.models.Order;
import local.patrickchow0803.patrickchow0803.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private Service service;

    // http://localhost:2019/orders/order/{orderid}
    @GetMapping(value = "/order/{orderid}", produces = {"application/json"})
    ResponseEntity<?> getOrderById(@PathVariable long orderid){
        Order order = service.getOrderById(orderid);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }
}