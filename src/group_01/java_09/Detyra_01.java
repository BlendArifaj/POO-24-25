package group_01.java_09;

/*
Krijoni një program në Java që simulon një telekomandë universale duke përdorur konceptin e
polimorfizmit. Telekomanda duhet të kontrollojë pajisje të ndryshme si: TV, DVD Player,
dhe Sistem Muzikor. Për secilën pajisje, veprimet play(), pause(), dhe stop() duhet të
kenë sjellje specifike.
 */
public class Detyra_01 {
    public static void main(String[] args){
        SmartTV tv = new SmartTV();

        tv.switchSource("TV");
        tv.play();
        tv.pause();
        tv.stop();

        tv.switchSource("DVD");
        tv.play();
        tv.pause();
        tv.stop();

        tv.switchSource("SoundSystem");
        tv.play();
        tv.pause();
        tv.stop();
    }
}

class SmartTV{
    Control control;

    public void switchSource(String source){
        if(source.equals("TV")){
            this.control = new TVScreen();
        }else if(source.equals("DVD")){
            this.control = new DVDScreen();
        }else if(source.equals("SoundSystem")){
            this.control = new SoundSystemScreen();
        }else{
            this.control = new Control();
        }
    }
    public void play(){
        this.control.play();
    }
    public void pause(){
        this.control.pause();
    }
    public void stop(){
        this.control.stop();
    }
}

class Control{
    public void play(){
        System.out.println("Cannot play! Please select a source!");
    }
    public void pause(){
        System.out.println("Cannot pause! Please select a source!");
    }
    public void stop(){
        System.out.println("Cannot stop! Please select a source!");
    }
}
class TVScreen extends Control{
    public void play(){
        System.out.println("[TV Screen] Playing ...");
    }
    public void pause(){
        System.out.println("Cannot pause! TV Screen cannot pause!");
    }
    public void stop(){
        System.out.println("Cannot stop! TV Screen cannot stop!");
    }
}
class DVDScreen extends Control{
    public void play(){
        System.out.println("[DVD Screen] Playing ...");
    }
    public void pause(){
        System.out.println("[DVD Screen] Paused!");
    }
    public void stop(){
        System.out.println("[DVD Screen] Stopped!");
    }
}
class SoundSystemScreen extends Control{
    public void play(){
        System.out.println("[Sound System] Playing ...");
    }
    public void pause(){
        System.out.println("[Sound System] Paused!");
    }
    public void stop(){
        System.out.println("[Sound System] Stopped!");
    }
}
