package vn.edu.iuh.fit.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.orderservice.entities.Order;
import vn.edu.iuh.fit.orderservice.repositories.OrderRepository;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order product) {
        return orderRepository.save(product);
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order updateOrder(Long id, Order updated) {
        Order order = getOrderById(id);
        order.setNgayDat(updated.getNgayDat());
        order.setThanhTien(updated.getThanhTien());
        order.setMoTa(updated.getMoTa());
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}

