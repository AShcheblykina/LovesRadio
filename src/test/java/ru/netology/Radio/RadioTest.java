package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void realStation() {
        Radio radio = new Radio();

        radio.setStationNumber(6);

        int expected = 6;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void changeStations() {
        Radio radio = new Radio();
        radio.setStationNumber(8);

        radio.NextStation();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void firstStations() {
        Radio radio = new Radio();
        radio.setStationNumber(1);

        radio.PrevStation();

        int expected = 2;
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
        Radio radio = new Radio(9);
        radio.setStationNumber(9);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void chooseMinSoundVolume() {
        Radio radio = new Radio(0);
        radio.setSoundVolume(0);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void chooseMaxSoundVolume() {
        Radio radio = new Radio(100);
        radio.setSoundVolume(100);

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void realSoundVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(56);

        int expected = 56;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chooseSizeToNumberStation() {
        Radio radio = new Radio(9);

        radio.setStationNumber(7);

        int expected = 7;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void choosePrevNumberStation() {
        Radio radio = new Radio(9);

        radio.setStationNumber(0);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }
}


