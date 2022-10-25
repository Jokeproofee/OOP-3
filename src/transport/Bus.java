package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed,String fuel) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed,fuel);
    }

    @Override
    public void refill() {
        if (getFuel().equals("Дизель")) {
            System.out.println("Нужно заправлять дизельным топливом");
        } else if (getFuel().equals("Бензин")) {
            System.out.println("Нужно заправлять бензином");
        } else {
            System.out.println("Топливо указано некорректно!");
        }
    }

    @Override
    public String toString() {
        return "Автобус: " + getBrand() +
                " / Модель: " + getModel() +
                " / Год выпуска: " + getProductionYear() +
                " / Страна выпуска: " + getProductionCountry() +
                " / Скорость передвижения: " + getMaxSpeed() + " км/ч " +
                " / Цвет: " + getColor();
    }
}
