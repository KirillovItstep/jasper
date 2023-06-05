package org.itstep.order_details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderDetailsController {
    @Autowired
    OrderDetailsService orderDetailsService;

    @GetMapping(value="/order_details", produces="application/json")
    public List<OrderDetails> getProducts(){
        return orderDetailsService.findAll();
    }

    @GetMapping(value="/order_details/sort", produces="application/json")
    public List<OrderDetails> getProductsSort(@RequestParam(name="property") String property){
        return orderDetailsService.orderBy(property);
    }
}
