package transport;

public class Train extends Transport {

    private double priceOfTheTrip;
    private String travelTime;
    private String departureStation;
    private String finalStop;
    private int numberOfWagons;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, double priceOfTheTrip, String travelTime, String departureStation, String finalStop, int numberOfWagons,String fuel) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed,fuel);
        setPriceOfTheTrip(priceOfTheTrip);
        setTravelTime(travelTime);
        setNumberOfWagons(numberOfWagons);
        if (departureStation == null || departureStation.isBlank()) {
            this.departureStation = "default";
        } else {
            this.departureStation = departureStation;
        }
        if (finalStop == null || finalStop.isBlank()) {
            this.finalStop = "default";
        } else {
            this.finalStop = finalStop;
        }
    }

    public double getPriceOfTheTrip() {
        return priceOfTheTrip;
    }
    public String getTravelTime() {
        return travelTime;
    }
    public String getDepartureStation() {
        return departureStation;
    }
    public String getFinalStop() {
        return finalStop;
    }
    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setPriceOfTheTrip(double priceOfTheTrip) {
        if (priceOfTheTrip <= 0.00D) {
            this.priceOfTheTrip = 100.00D;
        } else {
            this.priceOfTheTrip = priceOfTheTrip;
        }
    }
    public void setTravelTime(String travelTime) {
        if (travelTime == null || travelTime.isBlank()) {
            this.travelTime = "default";
        } else {
            this.travelTime = travelTime;
        }
    }
    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons <= 0) {
            this.numberOfWagons = 1;
        } else {
            this.numberOfWagons = numberOfWagons;
        }
    }

    @Override
    public void refill() {
        if (getFuel().equals("Дизель")) {
            System.out.println("Нужно заправлять дизельным топливом");
        } else {
            System.out.println("Топливо указано некорректно!");
        }
    }

    @Override
    public String toString() {
        return "Поезд: " + getBrand() +
                " / Модель: " + getModel() +
                " / Год выпуска: " + getProductionYear() +
                " / Страна выпуска: " + getProductionCountry() +
                " / Скорость передвижения: " + getMaxSpeed() + " км/ч " +
                " / Цена поездки: " + priceOfTheTrip + " рублей " +
                " / Отходит от: " + departureStation +
                " / Следует до: " + finalStop +
                " / Количество вагонов: " + numberOfWagons;
    }
}
