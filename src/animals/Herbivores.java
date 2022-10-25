package animals;

import java.util.Objects;

public class Herbivores extends Mammals {
    private String typeOfFood;

    public Herbivores(String name, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Класс: " + getClass() +
                " / Название животного: " + getName() +
                " / Возраст животного: " + getAge() +
                " / Среда обитания: " + getLivingEnvironment() +
                " / Скорость передвижения: " + getMovementSpeed() +
                " / Тип еды: " + typeOfFood;
    }

    @Override
    public void walk() {
        System.out.println("Гулять");
    }

    public void graze () {
        System.out.println("Пастись");
    }
}
