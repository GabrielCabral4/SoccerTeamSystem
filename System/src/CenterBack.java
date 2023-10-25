public class CenterBack extends PlayerSuperClass{
    private double tackling;
    public CenterBack(String name, int shirt, int kickPower, double tackling){
        super(name, shirt, kickPower);
        this.tackling = tackling;
    }
    public double centerBacksPrize(int kickPower, double tackling){
        double centerBacksPrize = kickPower + (2.5 * tackling);
        return centerBacksPrize;
    }
    public double centerBacksSigningPrize(double centerBacksPrize){
        double centerBacksSigningPrize = 0.5 * centerBacksPrize;
        return centerBacksSigningPrize;
    }

    public double getTackling() {
        return tackling;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CenterBack player").append("\n");
        sb.append("Name: ").append(getName()).append(", tackling skills:").append(tackling).append("\n");
        sb.append("Shirt number: ").append(getShirt());
        return sb.toString();
    }
}
