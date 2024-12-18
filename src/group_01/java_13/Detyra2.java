package group_01.java_13;

import java.io.FileWriter;
import java.io.IOException;

/*
Të shkruhet një program në gjuhën programuese Java, i cili i mundëson profesorit të ruaj
në fajll notat e studenteve,të arritura në provim.
Kërkesat:
-	Logjika e funksionimit të programit do të vendoset në klasën Profesori, e cila do të
        zgjerohet nga klasa UserData, që i përmban vecoritë private: id dhe emri,
        dhe metodën abstrakte shtypDetajet, e cila kur të implementohet duhet të shtyp
        detajet e klasës në ekran.
-	Logjika e notimit për një student dhe ruajtja e notave ne fajll duhet të deklarohet
        në ndërfaqen NotimiInterface dhe implementimi të bëhet në klasën Profesori.
-	Programi nuk duhet te dështoj nese ka gabim gjatë ruatjes së notave në fajll, por
        duhet ta njoftoj profesorin se notat nuk jan ruajtur me sukses!
-	Nota duhet të deklarohet si një objekt, që përmban id-n e studentit (studentId),
        lenden dhe notën.
-   Formati i ruajtjes ne fajll duhet të jetë: studentId – lenda – nota,
        p.sh: 150714-POO-10, 150713-KNK-9.
 */
class Nota{
    int studentId;
    String lenda;
    int nota;
    public Nota(int studentId, String lenda, int nota){
        this.studentId = studentId;
        this.lenda = lenda;
        this.nota = nota;
    }
    public String toFile(){
        return this.studentId + "-" + this.lenda + "-" + this.nota + "\n";
    }
}
interface NotimiInterface{
    void notoStudentin(int studentId, String lenda, int nota);
    void ruajNotenNeFile(Nota nota);
}
abstract class UserData{
    private int id;
    private String emri;
    public abstract void shtypDetajet();
    public UserData(int id, String emri){
        this.id = id;
        this.emri = emri;
    }
    public int getId(){
        return this.id;
    }
    public String getEmri(){
        return this.emri;
    }
}
class Profesor extends UserData implements NotimiInterface {

    public Profesor(int id, String emri){
        super(id, emri);
    }
    public void shtypDetajet(){
        System.out.println("Id: " + this.getId());
        System.out.println("Emri: " + this.getEmri());
    }

    public void notoStudentin(int studentId, String lenda, int nota) throws RuntimeException{
        if(nota < 5 || nota > 10){
            throw new RuntimeException("Nota nuk eshte valide");
        }
        Nota notaObj = new Nota(studentId, lenda, nota);
        ruajNotenNeFile(notaObj);
    }

    public void ruajNotenNeFile(Nota nota){
        try{
            FileWriter fileWriter = new FileWriter("notat.txt", true);
            fileWriter.write(nota.toFile());
            fileWriter.close();
        }catch (IOException e){
            System.out.println("Nota nuk eshte ruajtur me sukses!");
        }
    }

}
public class Detyra2 {
}
