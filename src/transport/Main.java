package transport;

import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {

    public static void printCar(Car car){
        System.out.println(car.getBrand() + " " +
                car.getModel() + ", " +
                car.getProductionYear() + " год выпуска, страна сборки " +
                car.getProductionCountry() + "," +
                car.getColor() + " цвет, объем двигателя - " +
                car.getEngineVolume() + " литра. Коробка передач " +
                car.getTransmission() + ", тип кузова " +
                car.getBodyType() +  ". Регистрационный номер " +
                car.getRegNumber() + " , мест " +
                car.getNumberOfSeats() + " , тип резины " +
                car.getRubberType() + " , тип запуска " +
                car.getKey().getRemoteEngineStart() + " , бесключевой доступ " +
                car.getKey().getKeylessAccess() + " , Срок действия страховки " +
                car.getInsurance().getInsuranceValidityPeriod() + " , Стоимость страховки " +
                car.getInsurance().getTheCostOfInsurance() + " , Номер страховки " +
                car.getInsurance().getInsuranceNumber() + " , Максимальная скорость: " +
                car.getMaxSpeed() + "км/ч");
    }
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        Car lada = new Car("Lada","Grande",1.7,"жёлтый",2015,"Россия","механическая","седан","р156ор078",5,"летняя",new Car.Key(false,false),new Car.Insurance(null,12_000,"123456789"),180,"Дизель");
        Car audi = new Car("Audi","A8 50 L TDI quattro",3.0,"черный",2020,"Германия","механическая","седан","р150ор078",4,"зимняя",new Car.Key(false,false),new Car.Insurance(null,12_000,null),"Бензин");
        Car bmw = new Car("BMW","Z8",3.0,"черный",2021,"Германия","механическая","седан","р656ор078",5,"летняя",new Car.Key(false,false),new Car.Insurance(null,12_000,null),220,"Дизель");
        Car kia = new Car("Kia","Sportage 4",2.4,"красный",2018,"Южная Корея","автомат","седан","р186ор078",4,"зимняя",new Car.Key(false,false),new Car.Insurance(null,12_000,null),200,"Бензин");
        Car hyundai = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея","механическая","седан","р276ор078",5,"летняя",new Car.Key(false,false),new Car.Insurance(null,12_000,null),"Дизель");

        printCar(lada);
        lada.refill();
        printCar(audi);
        audi.refill();
        printCar(bmw);
        bmw.refill();
        printCar(kia);
        kia.refill();
        printCar(hyundai);
        hyundai.refill();


        //Задание 2
        System.out.println("Задание 2");
        Train lastochka = new Train("Ласточка","В-901",2011,"Россия",null,301,3500,null,"Белорусский вокзал","Минск",11,"Дизель");
        Train leningrad = new Train("Ленинград","D-125",2019,"Россия",null,270,1700,null,"Ленинградский вокзал","Ленинград",8,"Дизель");

        System.out.println(lastochka);
        lastochka.refill();
        System.out.println(leningrad);
        leningrad.refill();

        //Задание 3
        System.out.println("Задание 3");
        Bus liaz = new Bus("Икарус","350",1978,"Венгрия",null,150,"Бензин");
        Bus iveco = new Bus("Iveco","320",1985,"Италия",null,160,"Дизель");
        Bus fiat = new Bus("Fiat","399",1990,"Италия",null,180,"Бензин");

        System.out.println(liaz);
        liaz.refill();
        System.out.println(iveco);
        iveco.refill();
        System.out.println(fiat);
        fiat.refill();
    }
}