package Secao_17.model.entities;

import Secao_17.model.enums.Color;

public abstract class AbstractSHape implements Shape{
    private Color color;

    public AbstractSHape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
