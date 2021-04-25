
package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RadioServiceTest {
    private RadioService radio;

    @BeforeEach
    public void radioAtributes() {
        this.radio = new RadioService(0,10,0,100);
    }

    @Test
    public  void setCurrentStationValid() {
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void setStationOverMax(){
        radio.setCurrentStation(11);
        assertEquals(10, radio.getMaxStation());
    }

    @Test
    public void setStationUnderMin(){
        radio.setCurrentStation(- 3);
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void setUpCurrentStationValid(){
        radio.setCurrentStation(6);
        radio.setUpCurrentStation();
        assertEquals(7, radio.getCurrentStation());

    }

    @Test
    public  void setUpCurrentStationOver(){
        radio.setCurrentStation(10);
        radio.setUpCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setDownCurrentStationValid(){
        radio.setCurrentStation(8);
        radio.setDownCurrentStation();
        assertEquals(7, radio.getCurrentStation());
    }
    @Test
    public void setDownCurrentStationUnder(){
        radio.setCurrentStation(0);
        radio.setDownCurrentStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void setCurrentVolumeValid(){
        radio.setCurrentVolume(56);
        assertEquals(56, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOverMax(){
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void setCurrentVolumeUnderMin(){
        radio.setCurrentVolume(-12);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void setUpCurrentVolumeValid(){
        radio.setCurrentVolume(55);
        radio.setUpCurrentVolume();
        assertEquals(56, radio.getCurrentVolume());
    }


    @Test
    public void setUpCurrentVolumeOverMax(){
        radio.setCurrentVolume(100);
        radio.setUpCurrentVolume();
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void setDownCurrentVolumeValid(){
        radio.setCurrentVolume(55);
        radio.setDownCurrentVolume();
        assertEquals(54, radio.getCurrentVolume());
    }

    @Test
    public void setDowncurrentVolumeUnderMin(){
        radio.setCurrentVolume(0);
        radio.setDownCurrentVolume();
        assertEquals(0, radio.getMinVolume());
    }

}