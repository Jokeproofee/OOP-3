package animals;

import java.util.Objects;

public class Flightless extends Birds {
    private String typeOfMovement;

    public Flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        if (typeOfMovement != null && !typeOfMovement.isEmpty() && !typeOfMovement.isBlank()) {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    @Override
    public String toString() {
        return "Класс: " + getClass() +
                " / Название животного: " + getName() +
                " / Возраст животного: " + getAge() +
                " / Среда обитания: " + getLivingEnvironment() +
                " / Тип передвижения: " + typeOfMovement;
    }

    @Override
    public void hunt() {
        System.out.println("Охотиться");
    }

    public void walk () {
        System.out.println("Гулять");
    }
}
