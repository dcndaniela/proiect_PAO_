

import java.util.Arrays;
import java.util.List;
import java.security.SecureRandom;

public class Jucator extends Angajat {

    String tip;//atacant, fundas, portar

    public Jucator(int id, String nume, double v, String ech, String tip) {
        super(id, nume, v, ech);
        this.tip = tip;
    }

    public Jucator(){
        super();
        tip="Undefined";
    }

    public double esteApt() {
        return (35 - this.getVarsta());
    }

    public void setTip(String tip)
    {
        this.tip=tip;
    }

    @Override
    public String getTip()
    {return tip;}

    @Override
    public String getEchipaLaCareAFostAngajatInTrecut(){
        List<String> lista_echipe= Arrays.asList("CSA Steaua", "Dinamo","Astra","Viitorul","Galati","Rapid");
        SecureRandom nr=new SecureRandom();
        int x=nr.nextInt(6);
        if(lista_echipe.get(x).equals(this.getEchipa()))
            return lista_echipe.get(x+1);
        return lista_echipe.get(x);
    }

}










