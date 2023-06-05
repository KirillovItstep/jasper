package org.itstep.order_details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailsService {
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    public List<OrderDetails> findAll(){
        return orderDetailsRepository.findAll();
    }

    public List<OrderDetails> orderBy(String property){
        return orderDetailsRepository.findAll(Sort.by(Sort.Direction.ASC, property));
    }
}
