package ru.netology.domain;

public class RadioService {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 10;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setUpCurrentVolume() {
        if ( currentVolume == maxVolume ) {
            return;
        }
        this.currentVolume++;
    }


    public void setDownCurrentVolume() {
        if ( currentVolume == minVolume ) {
            return;
        }
        this.currentVolume--;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void setUpCurrentStation() {
        if ( currentStation == maxStation ) {
            this.currentStation = minStation;
        }
        this.currentStation++;
    }

    public void setDownCurrentStation() {
        if ( currentStation == minStation ) {
            this.currentStation = maxStation;
        }
        this.currentStation--;
    }

}
