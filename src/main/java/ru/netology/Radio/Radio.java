package ru.netology.Radio;

public class Radio {
    private int sizeNumberStation;
    private int stationNumber;
    private int soundVolume;

    public Radio() {
        sizeNumberStation = 9;
    }

    public Radio(int stationsCount) {
        sizeNumberStation = stationsCount - 1;

    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber < 0) {
            return;
        }
        if (stationNumber > sizeNumberStation) {
            return;
        }
        this.stationNumber = stationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 100) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void inCreaseVolume() {
        if (soundVolume < 100) {
            this.soundVolume = soundVolume + 1;
        }
    }

    public void nextStation() {
        if (stationNumber != sizeNumberStation) {
            stationNumber++;
        } else {
            this.stationNumber = 0;
        }
    }

    public void prevStation() {
        if (stationNumber != 0) {
            stationNumber++;
        } else {
            this.stationNumber = sizeNumberStation;
        }
    }
}

