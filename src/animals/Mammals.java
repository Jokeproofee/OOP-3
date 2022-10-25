package animals;

import java.util.Objects;

public abstract class Mammals extends Animals {
    private String livingEnvironment;
    private int movementSpeed;

    public Mammals(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
        setMovementSpeed(movementSpeed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        if (movementSpeed < 0) {
            this.movementSpeed = 0;
        } else {
            this.movementSpeed = movementSpeed;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return movementSpeed == mammals.movementSpeed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, movementSpeed);
    }

    @Override
    public void eat() {
        System.out.println("Есть");
    }

    @Override
    public void go() {
        System.out.println("Идти");
    }

    @Override
    public void sleep() {
        System.out.println("Спать");
    }

    public abstract void walk ();
}
