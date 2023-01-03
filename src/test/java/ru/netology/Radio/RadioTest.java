package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void ChooseIncreaseStationNumberLargeMax() {
        Radio cond = new Radio();

        cond.setStationNumber(10);

        int expected = 0;
        int actual = cond.SoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChooseIncreaseSoundVolumeLargeMax() {
        Radio cond = new Radio();

        cond.setSoundVolume(10);

        int expected = 10;
        int actual = cond.SoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChooseIncreaseSoundVolumeLargeMini() {
        Radio cond = new Radio();

        cond.setSoundVolume(-5);

        int expected = 0;
        int actual = cond.SoundVolume;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void ChooseStation() {
        Radio cond = new Radio();

        cond.setStationNumber(6);

        int expected = 6;
        int actual = cond.StationNumber;

        Assertions.assertEquals(expected, actual);
}
@Test
    public void ChangeVolume() {
        Radio cond = new Radio();

        cond.setSoundVolume(7);

        int expected = 7;
        int actual = cond.SoundVolume;

        Assertions.assertEquals(expected, actual);
    }

}
