package group_04.java_13;

/*
Të krijohet programi në gjuhën programuese Java për menaxhimin e transfereve bankare.
Kërkesat për programin janë si vijon:
- Klasa `Banka`:
   -  Mbart funksionalitetin bazë të një banke, por nuk implementon të gjitha metodat.
   -  Deklaron metodat për hapjen e llogarisë dhe transferimin e parave si metoda abstrakte.
   -  Përmban një listë të llogarive bankare me informacionet: id, perdoruesi (string), shuma (double) dhe banka.
- Klasa `BankaKomerciale`:
   - Mundëson krijimin e llogarive të reja bankare.
   - Transferet bankare ruhen në fajllin 'transferet.txt' duke përfshirë informacione si derguesi,
        banka e derguesit, pranuesi, banka e pranuesit dhe shuma e derguar.
   - Mundëson dergimin e transfereve vetëm brenda bankës së njëjtë; nëse tentohet transferimi në një bankë tjetër,
        shkakton një gabim i personalizuar.
- Klasa `BankaShteterore`:
   -  Mundëson krijimin e llogarive të reja bankare.
   - Transferet bankare ruhen në fajllin 'transferet.txt' duke përfshirë informacione si derguesi, banka e derguesit,
        pranuesi, banka e pranuesit dhe shuma e derguar.
   -  Mundëson të gjitha transferet, përfshirë ato në banka të ndryshme.
- Nderfaqja `TransferimiParave`:
   - Është një ndërfaqe e përbashkët e përdorur nga të dy llojet e bankave për të kryer transferime.
   - Deklaron të gjitha metodat lidhur me transferet.

Kjo detyrë synon të krijojë një program në gjuhën programuese Java për menaxhimin e transfereve bankare në dy lloje bankash:
    komerciale dhe shtetërore.
Për këtë qëllim, do të përdoret një strukturë hijerarkike dhe ndërfaqe për të lehtësuar zhvillimin dhe përmirësimin e
fleksibilitetit dhe performancës së programit.
 */

import java.util.ArrayList;

class BankCustomException extends Exception{

}
class TransferCustomException extends Exception{

}

class Llogaria{
    int id;
    String perdoruesi;
    double shuma;
    Banka banka;

    public Llogaria(int id, String perdoruesi, double shuma, Banka banka) {
        this.id = id;
        this.perdoruesi = perdoruesi;
        this.shuma = shuma;
        this.banka = banka;
    }
}

class Transfer{
    Llogaria derguesi;
    Llogaria pranuesi;
    double shuma;

    public Transfer(Llogaria derguesi, Llogaria pranuesi, double shuma) {
        this.derguesi = derguesi;
        this.pranuesi = pranuesi;
        this.shuma = shuma;
    }

    public String toFile(){
        return derguesi.id + "-" + derguesi.banka.id + "-" + pranuesi.id + "-" + pranuesi.banka.id + "-" + shuma;
    }
}

interface TransferimiParave{
    Transfer transferoFonde(Llogaria derguesi, Llogaria pranuesi, double shuma) throws BankCustomException;
    void executeTransfer(Transfer transfer) throws TransferCustomException;
}
abstract class Banka implements TransferimiParave{
    int id;
    ArrayList<Llogaria> klientet;

    public Banka(int id) {
        this.id = id;
        this.klientet = new ArrayList<>();
    }

    public abstract Llogaria krijoLlogarine(int id, String perdoruesi, double shuma);

    public void executeTransfer(Transfer transfer) throws TransferCustomException{
        Llogaria derguesi = transfer.derguesi;
        Llogaria pranuesi = transfer.pranuesi;
        double shuma = transfer.shuma;
        if (derguesi.shuma < shuma){
            throw new TransferCustomException();
        }
        derguesi.shuma -= shuma;
        pranuesi.shuma += shuma;
    }

}
class BankaKomerciale extends Banka{
    BankaKomerciale(int id){
        super(id);
    }
    @Override
    public Llogaria krijoLlogarine(int id, String perdoruesi, double shuma) {
//        Ndonje validim nese ka nevoje ....
        Llogaria newObj = new Llogaria(id, perdoruesi, shuma, this);
        this.klientet.add(newObj);
        return newObj;
    }

    @Override
    public Transfer transferoFonde(Llogaria derguesi, Llogaria pranuesi, double shuma) throws BankCustomException {
        if(derguesi.banka.id != pranuesi.banka.id){
            throw new BankCustomException();
        }
        Transfer newTransfer = new Transfer(derguesi, pranuesi, shuma);
        try{
            executeTransfer(newTransfer);
        }catch (TransferCustomException e){
            return null;
        }
        return newTransfer;
    }
}
class BankaShteterore extends Banka{

    BankaShteterore(int id){
        super(id);
    }

    @Override
    public Llogaria krijoLlogarine(int id, String perdoruesi, double shuma) {
//        Ndonje validim nese ka nevoje ....
        Llogaria newObj = new Llogaria(id, perdoruesi, shuma, this);
        this.klientet.add(newObj);
        return newObj;
    }

    @Override
    public Transfer transferoFonde(Llogaria derguesi, Llogaria pranuesi, double shuma) {
        Transfer newTransfer = new Transfer(derguesi, pranuesi, shuma);
        try{
            executeTransfer(newTransfer);
        }catch (TransferCustomException e){
            return null;
        }
        return newTransfer;
    }
}
public class Detyra1 {
}
