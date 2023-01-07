package ru.netology.Radio;

public class Radio {
    private int sizeNumberStation;
    private int stationNumber;
    private int SoundVolume;

    public Radio() {
        sizeNumberStation = 9;
    }

    public Radio(int stationsCount) {
        sizeNumberStation = stationsCount -1;

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
        return SoundVolume;
    }

    public void setSoundVolume(int SoundVolume) {
        if (this.SoundVolume < 0) {
            return;
        }
        if (this.SoundVolume > 100) {
            return;
        }
        this.SoundVolume = SoundVolume;
    }

    public void InCreaseVolume() {
        if (SoundVolume < 100) {
            SoundVolume = SoundVolume + 1;
        }
    }

    public void NextStation() {
        if (stationNumber != sizeNumberStation) {
            stationNumber++;
        } else {
            stationNumber = 0;
        }
    }

    public void PrevStation() {
        if (stationNumber != 0) {
            stationNumber++;
        } else {
            stationNumber = sizeNumberStation;
        }
    }
}

