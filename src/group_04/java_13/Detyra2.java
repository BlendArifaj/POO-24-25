package group_04.java_13;


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
    Nota(int studentId, String lenda, int nota){
        this.studentId = studentId;
        this.lenda = lenda;
        this.nota = nota;
    }
    public String toFile(){
        return this.studentId + "-" + this.lenda + "-" + this.nota;
    }
}
interface NotimiInterface{
    String NOTAT_FILENAME = "notat.txt";

    void vendosNoten(int studentId, String lenda, int nota);
    void ruajNotenNeFile(Nota nota);
}
abstract class UserData{
    private int id;
    private String emri;
    public UserData(int id, String emri){
        this.id = id;
        this.emri = emri;
    }
    public abstract void shtypDetajet();

    public int getId(){
        return this.id;
    }
    public String getEmri(){
        return this.emri;
    }
}
class Profesori extends UserData implements NotimiInterface{
    Profesori(int id, String emri){
        super(id, emri);
    }
    public void shtypDetajet(){
        System.out.println("Id: " + this.getId());
        System.out.println("Emri: " + this.getEmri());
    }
    public void vendosNoten(int studentId, String lenda, int nota){
        if(nota < 5 || nota > 10){
            System.out.println("Nota nuk eshte valide");
            return;
        }
        Nota notaObj = new Nota(studentId, lenda, nota);
        this.ruajNotenNeFile(notaObj);
    }
    public void ruajNotenNeFile(Nota nota){
        try{
            FileWriter fw = new FileWriter(NOTAT_FILENAME, true);
            fw.write(nota.toFile());
            fw.close();
        }catch (IOException e){
            System.out.println("Nota nuk eshte ruajtur me sukses!");
        }
    }
}
public class Detyra2 {
}
