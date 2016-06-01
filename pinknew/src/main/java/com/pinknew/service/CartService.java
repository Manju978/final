package com.pinknew.service;

import com.pinknew.model.Cart;

public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
