package pro.sky.inetshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.inetshop.service.ShopServiceInterface;
import pro.sky.inetshop.shop.Cart;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShopController {
    private final ShopServiceInterface shopServiceInterface;

    public ShopController(ShopServiceInterface shopServiceInterface) {
        this.shopServiceInterface = shopServiceInterface;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam(value = "items") List<Integer> items) {
        shopServiceInterface.addItems(items);
        return "Товар добавлен в корзину" + items;
    }

    @GetMapping(path = "/get")
    public List<Integer> get() {return shopServiceInterface.getItems();

    }
}
