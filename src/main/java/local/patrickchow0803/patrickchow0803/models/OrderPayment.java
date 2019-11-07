package local.patrickchow0803.patrickchow0803.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orderspayments")
@IdClass(value = OrderPayment.class)
public class OrderPayment implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "ordnum")
    private Order order;

    @Id
    @ManyToOne
    @JoinColumn(name = "paymentid")
    private Payment payment;

    public OrderPayment() { }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}