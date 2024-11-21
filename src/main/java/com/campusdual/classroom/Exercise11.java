package com.campusdual.classroom;

import java.util.Set;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        redRemote.turnOn();
        redRemote.channelUp();
        redRemote.channelDown();
        redRemote.channel = 0;
        redRemote.channelDown();
        blackRemote.volumeUp();
        blackRemote.volumeDown();
        blackRemote.volume = 0;
        blackRemote.volumeDown();
        System.out.println(redRemote.getColor());
        blackRemote.turnOff();


    }

}