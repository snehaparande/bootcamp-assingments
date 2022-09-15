package com.tw.step8.assingment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void compareEqualVolumes() {
        Volume volume1 = new Volume(1.0, Unit.LITERS);
        Volume volume2 = new Volume(1.0, Unit.LITERS);

        assertEquals(0 ,volume1.compare(volume2));
    }

    @Test
    void compareUnEqualVolumes() {
        Volume volume1 = new Volume(1.0, Unit.LITERS);
        Volume volume2 = new Volume(2.0, Unit.LITERS);

        assertEquals(-1 ,volume1.compare(volume2));
    }

    @Test
    void compareEqualVolumesOfDifferentUnits() {
        Volume volume1 = new Volume(3.78, Unit.LITERS);
        Volume volume2 = new Volume(1.0, Unit.GALLON);

        assertEquals(0 ,volume1.compare(volume2));
    }
}