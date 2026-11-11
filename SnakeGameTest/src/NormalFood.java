/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author layan
 */
import java.awt.*;

public class NormalFood extends Food {

    public NormalFood(Point position) {
        super(position);
    }

    @Override
    public Food.FoodType getType() {
        return Food.FoodType.NORMAL;
    }

    @Override
    public int getPoints() {
        return 1;
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }

    @Override
    public String getEmoji() {
        return "🍎";
    }

    @Override
    public String getDescription() {
        return "Apple - 1 Point";
    }
}
