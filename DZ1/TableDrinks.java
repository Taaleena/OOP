package domashki.OOP.DZ1;

import java.math.BigDecimal;

/**
 * класс напитков
 */
public class TableDrinks extends All {
    private Double volume;


    public TableDrinks(String name, BigDecimal price, Double volume) {
        super(name, price);
        this.volume = volume;
    }


    public Double getVolume() {
        return volume;
    }


    @Override
    public String toString() {
        return super.toString() + "объем = " + volume + " ";
    }


    public void setVolume(Double volume) {
        if (volume > 0) this.volume = volume;
        else System.out.println("Объем напитка должен быть больше нуля!");
    }
}