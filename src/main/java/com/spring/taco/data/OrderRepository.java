package com.spring.taco.data;

import com.spring.taco.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
