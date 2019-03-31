

import java.util.Date;

public abstract class Angajat {
    private double varsta;
    private int id;
    private String nume;
    private String echipa;

    public Angajat(int id,String nume,double v,String echipa){
        this.id=id;
        this.nume=nume;
        this.varsta=v;
        this.echipa=echipa;
    }
    public Angajat(){
        varsta=-1;
        id=-1;
        nume="Undefined";
        echipa="Undefined";
    }

    public String getTip(){
        return "angajat";
    }

    public int getId(){
        return id;
    }

    public double getVarsta(){
        return varsta;
    }
    public String getNume(){
        return nume;
    }
    public String getEchipa(){
        return echipa;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setVarsta(double varsta) {
        this.varsta = varsta;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setEchipa(String echipa) {
        this.echipa = echipa;
    }

    //metoda abstracata implementatata in subclase
    abstract public double esteApt();

    public String getEchipaLaCareAFostAngajatInTrecut(){
        return "Nu a mai fost angajat la alta echipa in trecut";
    }

}



