package pro.sky.inetshop.shop;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Data
@SessionScope
@Component
public class Cart {


private final List<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItems (Integer items){
        this.items.add(items);
    }
    public List<Integer> getItems(){
        return this.items;
    }
}
