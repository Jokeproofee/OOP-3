package animals;

import java.util.Objects;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Класс: " + getClass() +
                " / Название животного: " + getName() +
                " / Возраст животного: " + getAge() +
                " / Среда обитания: " + livingEnvironment;
    }

    @Override
    public void eat() {
        System.out.println("Есть");
    }

    @Override
    public void go() {
        System.out.println("Плыть");
    }

    @Override
    public void sleep() {
        System.out.println("Спать");
    }

    public void hunt () {
        System.out.println("Ловить добычу");
    }
}
