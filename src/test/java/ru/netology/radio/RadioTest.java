package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldTurnOnNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.nextRadioStation();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnNextRadioStation0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
    }

    @Test
    public void shouldTurnOnPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.prevRadioStation();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();
    }

    @Test
    public void shouldTurnOnPrevRadioStation9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();
    }

    @Test
    public void shouldNotDecreaseVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
    }

}
