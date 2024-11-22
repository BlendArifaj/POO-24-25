package group_04.java_09;

/*
Krijoni një program në Java që simulon një telekomandë universale duke përdorur konceptin
e polimorfizmit. Telekomanda duhet të kontrollojë pajisje të ndryshme si: TV, DVD Player,
dhe Sistem Muzikor. Për secilën pajisje, veprimet play(), pause(), dhe stop() duhet të
kenë sjellje specifike.
 */
public class Detyra_01 {
    public static void main(String[] args){
        SmartTV smartTv = new SmartTV();
        smartTv.source("TV");
        smartTv.play();
        smartTv.pause();
        smartTv.stop();

        smartTv.source("DVD");
        smartTv.play();
        smartTv.pause();
        smartTv.stop();

        smartTv.source("SS");
        smartTv.play();
        smartTv.pause();
        smartTv.stop();
    }
}

class SmartTV{
    private CommandControl commandControl = new CommandControl();
    public void source(String source){
        if(source.equals("TV")){
            this.commandControl = new TVCommandControl();
        }else if(source.equals("DVD")){
            this.commandControl = new DVDCommandControl();
        }else if(source.equals("SS")){
            this.commandControl = new SSCommandControl();
        }else{
            this.commandControl = new CommandControl();
        }
    }
    public void play(){
        this.commandControl.play();
    }
    public void stop(){
        this.commandControl.stop();
    }
    public void pause(){
        this.commandControl.pause();
    }
}

class CommandControl{
    public void play(){
        System.out.println("No source found!");
    }
    public void stop(){
        System.out.println("No source found!");
    }
    public void pause(){
        System.out.println("No source found!");
    }
}

class TVCommandControl extends CommandControl{
    public void play(){
        System.out.println("[TV] playing ...");
    }
    public void stop(){
        System.out.println("[TV] stop is not supported!");
    }
    public void pause(){
        System.out.println("[TV] pause is not supported!");
    }
}
class DVDCommandControl extends CommandControl{
    public void play(){
        System.out.println("[DVD] playing ...");
    }
    public void pause(){
        System.out.println("[DVD] paused!");
    }
    public void stop(){
        System.out.println("[DVD] stopped!");
    }
}
class SSCommandControl extends CommandControl{
    public void play(){
        System.out.println("[Sound System] playing ...");
    }
    public void pause(){
        System.out.println("[Sound System] paused!");
    }
    public void stop(){
        System.out.println("[Sound System] stopped!");
    }
}





