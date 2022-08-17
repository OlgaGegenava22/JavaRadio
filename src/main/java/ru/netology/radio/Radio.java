package ru.netology.radio;

public class Radio {
    private int quantityOfRadioStations = 10;
    private int maxRadioStation = quantityOfRadioStations - 1;
    private int minRadioStation = 0;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio(int quantityOfRadioStations) {
        this.quantityOfRadioStations = quantityOfRadioStations;
        this.maxRadioStation = this.quantityOfRadioStations - 1;
    }

    public Radio() {

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getQuantityOfRadioStations() {
        return quantityOfRadioStations;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            currentRadioStation = 0;
        } else {
            if (newCurrentRadioStation > maxRadioStation) {
                currentRadioStation = maxRadioStation;
            } else {
                currentRadioStation = newCurrentRadioStation;
            }
        }
    }

    public int setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        return newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}