public class Forward extends PlayerSuperClass{
    private double dribbling;
    public Forward(String name, int shirt, int kickPower, double dribbling) {
        super(name, shirt, kickPower);
        this.dribbling = dribbling;
    }
    public double forwardsPrize(int kickPower, double dribbling){
        double forwardsPrize = (10 * kickPower) + (2 * dribbling);
        return forwardsPrize;
    }
    public double forwardsSigningPrize(double forwardsPrize){
        double forwardsSigningPrize = 4 * forwardsPrize;
        return forwardsSigningPrize;
    }

    public double getDribbling() {
        return dribbling;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Forward player").append("\n");
        sb.append("Name: ").append(getName()).append(", Dribbling skills:").append(getDribbling()).append("\n");
        sb.append("Shirt number: ").append(getShirt());
        return sb.toString();
    }
}