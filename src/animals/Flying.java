package animals;

import java.util.Objects;

public class Flying extends Birds {
    private String typeOfMovement;

    public Flying(String name, int age, String livingEnvironment, String typeOfMovement) {
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
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMovement, flying.typeOfMovement);
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

    public void fly () {
        System.out.println("Летать");
    }
}
