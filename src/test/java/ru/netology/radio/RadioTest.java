package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testSetQuantityOfRadioStations() {
        Radio radio = new Radio(15);

        Assertions.assertEquals(15, radio.getQuantityOfRadioStations());
        Assertions.assertEquals(14, radio.getMaxRadioStation());
    }

    @Test
    public void shouldTurnOnNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.nextRadioStation();

        Assertions.assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldTurnOnNextRadioStationIfQuantitySet() {
        Radio radio = new Radio(15);

        radio.setCurrentRadioStation(10);
        radio.nextRadioStation();

        Assertions.assertEquals(11, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldTurnOnNextRadioStationMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldTurnOnNextRadioStationMinIfQuantitySet() {
        Radio radio = new Radio(15);

        radio.setCurrentRadioStation(14);
        radio.nextRadioStation();

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldTurnOnPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.prevRadioStation();

        Assertions.assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldTurnOnPrevRadioStationIfQuantitySet() {
        Radio radio = new Radio(15);

        radio.setCurrentRadioStation(13);
        radio.prevRadioStation();

        Assertions.assertEquals(12, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldTurnOnPrevRadioStationMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldTurnOnPrevRadioStationMaxIfQuantitySet() {
        Radio radio = new Radio(15);

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        Assertions.assertEquals(14, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(16);

        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetRadioStationAboveMaxIfQuantitySet() {
        Radio radio = new Radio(15);

        radio.setCurrentRadioStation(16);

        Assertions.assertEquals(14, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(98);
        radio.increaseVolume();

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.decreaseVolume();

        Assertions.assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}











