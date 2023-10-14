package domashki.OOP.DZ1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * класс автомата горячих напитков
 */
public class VendingHot implements Vending {
    List<HotDrinks> hotDrinksList = new ArrayList<>();
    List<HotDrinks> resultFind = new ArrayList<>();


    @Override

    public void initAll(List<HotDrinks> list) {
        this.hotDrinksList = list;
    }


    @Override
    public String getAll() {
        return null;
    }


    public String getAll(String name) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getName().equals(name)) resultFind.add(el);
        }
        return resultFind.toString();
    }


    public String getAll(BigDecimal price) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getPrice().compareTo(price) <= 0) resultFind.add(el);
        }
        return resultFind.toString();
    }


}