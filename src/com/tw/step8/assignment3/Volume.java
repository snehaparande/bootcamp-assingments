package com.tw.step8.assignment3;

public class Volume {

    private final double value;
    private final Unit unit;

    public Volume(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Integer compare(Volume otherVolume) {
        if (this.unit == otherVolume.unit) {
            return resultantDelta(this.value, otherVolume.value);
        }

        Double stdOtherVolume = this.convert(otherVolume.unit, otherVolume.value);
        Double stdVolume = this.convert(this.unit, this.value);

        return resultantDelta(stdVolume, stdOtherVolume);
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
            case GALLON: return covertGallonToLiters(value);
            default: return value;
        }
    }

    private Double covertGallonToLiters(Double value) {
        return value * 3.785;
    }

    public Volume add(Volume otherVolume) {
        Double stdOtherVolume = this.convert(otherVolume.unit, otherVolume.value);
        Double stdVolume = this.convert(this.unit, this.value);
        Double result = stdVolume + stdOtherVolume;

        return new Volume(result, Unit.LITERS);
    }
}
