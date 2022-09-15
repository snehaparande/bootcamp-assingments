package com.tw.step8.assingment3;

public class Length {
    final double value;
    private final Unit unit;

    public Length(Double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Integer compare(Length otherLength) {
        if (this.unit == otherLength.unit) {
            return resultantDelta(this.value, otherLength.value);
        }

        Double convertedOtherLength = this.convert(otherLength.unit, otherLength.value);
        Double convertedLength = this.convert(this.unit, this.value);

        return resultantDelta(convertedLength, convertedOtherLength);
    }

    private Integer resultantDelta(Double value, Double value1) {
        Double delta = getDelta(value, value1);

        if (Math.abs(delta) < 0.01) return 0;
        if (delta > 0) return 1;
        return -1;
    }

    private Double getDelta(Double value, Double value1) {
        return value - value1;
    }

    private Double convert(Unit unit, Double value) {
        switch (unit) {
            case FEET: return convertFeetToInch(value);
            case CM: return convertCmToInch(value);
            case MM: return covertMmToInch(value);
            default: return value;
        }
    }

    private Double covertMmToInch(Double mm) {
        return mm / 25;
    }

    private Double convertCmToInch(Double cm) {
        return cm / 2.54;
    }

    private Double convertFeetToInch(Double feet) {
        return feet * 12;
    }
}
