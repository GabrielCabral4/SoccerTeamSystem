public class Midfield extends PlayerSuperClass{
    private String typeMidfielder;
    public Midfield(String name, int shirt, int kickPower, String typeMidfielder) {
        super(name, shirt, kickPower);
        this.typeMidfielder = typeMidfielder;
    }
    public double midfieldsPrize(int kickPower){
        double midfieldsPrize = 5 * kickPower;
        return midfieldsPrize;
    }
    public double midfieldsSigningPrize(double midfieldsPrize){
        double midfieldsSigningPrize = 2 * midfieldsPrize;
        return midfieldsSigningPrize;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Midfield player").append("\n");
        sb.append("Name: ").append(getName()).append(", type of midfielder:").append(this.typeMidfielder).append("\n");
        sb.append("Shirt  sumber: ").append(getShirt());
        return sb.toString();
    }
}
