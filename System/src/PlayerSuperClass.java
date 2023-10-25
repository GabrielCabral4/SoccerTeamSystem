import java.util.Objects;

public class PlayerSuperClass {
    private String name;
    private int shirt;
    private int kickPower;
    public PlayerSuperClass(String name, int shirt, int kickPower){
        this.name = name;
        this.shirt = shirt;
        this.kickPower = kickPower;
    }

    public String getName() {
        return name;
    }

    public int getShirt() {
        return shirt;
    }

    public int getKickPower() {
        return kickPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerSuperClass that = (PlayerSuperClass) o;
        return shirt == that.shirt && kickPower == that.kickPower && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shirt, kickPower);
    }
}
