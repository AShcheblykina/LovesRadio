package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void realStation() {
        Radio cond = new Radio(9);

        Assertions.assertEquals(0, cond.getMinNumberStations());
        Assertions.assertEquals(9, cond.getMaxNumberStation());
        Assertions.assertEquals(0, cond.getStationNumber());

    }
    @Test
    public void lastStations() {
        Radio radio = new Radio(9);
        radio.setStationNumber(9);

        radio.NextStation();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void changeStations() {
        Radio radio = new Radio(8);
        radio.setStationNumber(8);

        radio.NextStation();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void firstStations() {
        Radio radio = new Radio(0);
        radio.setStationNumber(0);

        radio.PrevStation();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void nextStation() {
        Radio radio = new Radio(6);
        radio.setStationNumber(6);

        radio.NextStation();

        int expected = 7;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chooseNextSoundVolume() {
        Radio radio = new Radio(52);
        radio.setSoundVolume(52);

        radio.InCreaseVolume();

        int expected = 53;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void aboveMaxSoundVolume() {
        Radio radio = new Radio(100);
        radio.setSoundVolume(100);

        radio.InCreaseVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void aboveMinSoundVolume() {
        Radio radio = new Radio(-0);
        radio.setSoundVolume(-0);


        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chooseMinNumberStation() {
        Radio radio = new Radio(0,9);
        radio.setStationNumber(0);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void chooseMaxNumberStation() {
        Radio radio = new Radio(0,9);
        radio.setStationNumber(9);

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void chooseMinSoundVolume() {
        Radio radio = new Radio(0,100);
        radio.setSoundVolume(0);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void chooseMaxSoundVolume() {
        Radio radio = new Radio(0,100);
        radio.setSoundVolume(100);

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void realSoundVolume() {
        Radio cond = new Radio(100);

        Assertions.assertEquals(0, cond.getMinSoundVolume());
        Assertions.assertEquals(100, cond.getMaxSoundVolume());
        Assertions.assertEquals(0, cond.getSoundVolume());

    }

}


