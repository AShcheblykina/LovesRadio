package ru.netology.Radio;
public class Radio {
    int StationNumber;
    int SoundVolume;

    public int getStationNumber() {
        return StationNumber;
    }

    public void setStationNumber(int StationNumber) {
        if (StationNumber < 0) {
            return;
        }
        if (StationNumber > 9) {
            return;
        }
        this.StationNumber = StationNumber;
    }

    public int getSoundVolume() {
        return SoundVolume;
    }
    public void setSoundVolume(int SoundVolume) {
        if (SoundVolume < 0) {
            return;
        }
        if (SoundVolume > 10) {
            return;
        }
        this.SoundVolume = SoundVolume;
    }
}

