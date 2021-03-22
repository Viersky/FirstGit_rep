public enum ParamValues {

    CAR_MILLAGE(minValue: 0, maxValue: 20000),

    FUEL_USAGE(minValue: 0, maxValue: 14),

    TREAD_THICKNESS(minValue: 2, maxValue:null);

private Integer minValue;
private Integer maxValue;

ParamValues(Integer minValue, Integer maxValue) {
    this.minValue = minValue;
    this.maxValue = maxValue;
}

public Integer getMinValue(){
    return minValue;
}
public Integer gatMaxValue(){
    return maxValue;
}

}
