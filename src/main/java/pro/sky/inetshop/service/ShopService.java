package pro.sky.inetshop.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pro.sky.inetshop.shop.Cart;

import java.util.List;

@Service

public class ShopService implements ShopServiceInterface {

    private final Cart cart;

    public ShopService(Cart cart) {
        this.cart = cart;
    }

    public void addItems(List<Integer> items){
         for(Integer item:items){
             cart.addItems(item);
         }

    }
    public List<Integer> getItems(){
return this.cart.getItems();
    }
}
