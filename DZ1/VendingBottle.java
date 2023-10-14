package domashki.OOP.DZ1;

import java.util.ArrayList;
import java.util.List;

/**
 * класс автомата воды
 */
public class VendingBottle implements Vending {
    List<BottleDrinks> bottleDrinksList = new ArrayList<>();


    @Override
    public void initAll() {
    }



    public void initAll(List<BottleDrinks> bottle) {
        this.bottleDrinksList = bottle;
    }


    @Override
    public String getAll() {
        return null;
    }


    public String getAll(String name) {
        for (BottleDrinks el : bottleDrinksList) {
            if (el.getName().equals(name)) return el.toString();
        }
        return "Не найдено";
    }
}