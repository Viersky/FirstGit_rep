public class Cup {
    private String liquidType;
    private double pecentFull;

    public Cup (String liquidType, double percentFull){
        this.liquidType = liquidType;
        this.pecentFull = percentFull;
    }
    public String getLiquidType() {
        return liquidType;
    }

    public void setLiquidType(String liquidType) {
        this.liquidType = liquidType;
    }

    public double getPecentFull() {
        return pecentFull;
    }

    public void setPecentFull(double pecentFull) {
        this.pecentFull = pecentFull;
    }
}
