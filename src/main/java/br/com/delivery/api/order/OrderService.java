package br.com.delivery.api.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Transactional(readOnly = true)
    public List<Order> findAll() {
        return orderRepository.findOrdersWithProducts();
    }
}
