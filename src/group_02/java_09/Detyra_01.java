package group_02.java_09;

/*
Krijoni një program në Java që simulon një telekomandë universale duke përdorur konceptin
e polimorfizmit. Telekomanda duhet të kontrollojë pajisje të ndryshme si: TV, DVD Player,
dhe Sistem Muzikor. Për secilën pajisje, veprimet play(), pause(), dhe stop() duhet të
kenë sjellje specifike.
 */
public class Detyra_01 {
    public static void main(String[] args){
        SmartTV tv = new SmartTV();
        tv.switchSource("DVD");
        tv.play();
        tv.pause();
        tv.stop();
        tv.switchSource("TV");
        tv.stop();
        tv.pause();
        tv.pause();
        tv.switchSource("SS");
        tv.play();
        tv.pause();
        tv.stop();
        tv.switchSource("Netflix");
        tv.play();
        tv.pause();
        tv.stop();
    }
}

class SmartTV{
    CommandControl commandControl;

    public void switchSource(String source){
        if(source.equals("TV")){
            this.commandControl = new TVCommandControl();
        }else if(source.equals("DVD")){
            this.commandControl = new DVDCommandControl();
        }else if(source.equals("SS")){
            this.commandControl = new SSCommandControl();
        }else{
            this.commandControl = new CommandControl();
        }
        System.out.println("[Source] " + source);
    }
    public void play(){
        this.commandControl.play();
    }
    public void pause(){
        this.commandControl.pause();
    }
    public void stop(){
        this.commandControl.stop();
    }
}

class CommandControl{
    public void play(){
        System.out.println("Nothing to play!");
    }
    public void pause(){
        System.out.println("Nothing to pause!");
    }
    public void stop(){
        System.out.println("Nothing to stop!");
    }
}
class TVCommandControl extends CommandControl{
    public void play(){
        System.out.println("[TV] - playing ...");
    }
    public void pause(){
        System.out.println("[TV] - Nothing to pause!");
    }
    public void stop(){
        System.out.println("[TV] - Nothing to stop!");
    }
}
class DVDCommandControl extends CommandControl{
    public void play(){
        System.out.println("[DVD] - playing ...");
    }
    public void pause(){
        System.out.println("[DVD] - paused!");
    }
    public void stop(){
        System.out.println("[DVD] - stopped!");
    }
}
class SSCommandControl extends CommandControl{
    public void play(){
        System.out.println("[Sound System] - playing ...");
    }
    public void pause(){
        System.out.println("[Sound System] - paused!");
    }
    public void stop(){
        System.out.println("[Sound System] - stopped!");
    }
}