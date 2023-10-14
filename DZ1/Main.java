package domashki.OOP.DZ1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------- поик напитков ---------");
        VendingBottle vmBottle = new VendingBottle();
        List<BottleDrinks> bottleList = new ArrayList<>(Arrays.asList(
                new BottleDrinks(prod.Cola.toString(), new BigDecimal(3), 0.5),
                new BottleDrinks(prod.Sprite.toString(), new BigDecimal(3.5), 0.45),
                new BottleDrinks(prod.Fanta.toString(), new BigDecimal(3), 0.43),
                new BottleDrinks("Aqua Minerale", new BigDecimal(1.5), 0.5)));
        vmBottle.initAll(bottleList);
        System.out.println(vmBottle.getAll("Aqua Minerale"));

        System.out.println("--------- поиск горячих напитков ---------");
        VendingHot vmHotDrinks = new VendingHot();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Coffee", new BigDecimal(3), 0.3),
                new HotDrinks("Tea", new BigDecimal(1), 0.4),
                new HotDrinks("Milk", new BigDecimal(3), 1.0)));
        vmHotDrinks.initAll(hotDrinksList);
        System.out.println("Поиск по названию: " + vmHotDrinks.getAll("Coffee"));
        System.out.println("Поиск по цене <=: " + vmHotDrinks.getAll(new BigDecimal(2.5)));
    }

    enum prod {
        Cola,
        Sprite,
        Fanta,
    }
}