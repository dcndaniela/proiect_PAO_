

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class Antrenor extends Angajat {

    private double vechime_antrenor; //de cat timp lucreaza ca antrenor

    public Antrenor(int id,String nume, double v,String ech,double vechime_antrenor)
    {
        super(id,nume,v,ech);
        this.setVechime(vechime_antrenor);
    }

    public Antrenor(){
        super();
        vechime_antrenor=-1;
    }

    public double getVechime() {
        return vechime_antrenor;
    }

    public void setVechime(double vechime_antrenor) {
        this.vechime_antrenor = vechime_antrenor;
    }

    public String getNivelPerformanta(){
        String mesaj=new String();
        if(vechime_antrenor <2)
            mesaj="incepator, avand o vechime mai mica de 2 ani";
        if(vechime_antrenor >2 && vechime_antrenor< 5.5)
            mesaj="avansat, cu o vechime intre 2 si 5 ani jumatate";
        if(vechime_antrenor>5.5)
            mesaj="experimentat, cu o vechime care depaseste 5 ani jumatate";
        return mesaj;
    }

    public double esteApt(){return (60-this.getVarsta());
    }


    @Override
    public String getTip()
    {return "antrenor";}

    @Override
    public String getEchipaLaCareAFostAngajatInTrecut(){
        List<String> lista_echipe= Arrays.asList("ASC Otelul Galati","FC Vaslui","CS Universitatea Craiova",
                "CS Gaz Metan Medias","Viitorul Constanta","FC Astra Giurgiu","FC Timisoara","FC Galati","CFR Cluj");
        SecureRandom nr=new SecureRandom();
        int x=nr.nextInt(8);
        if(lista_echipe.get(x).equals(this.getEchipa()))
            return lista_echipe.get(x+1);
        return lista_echipe.get(x);
    }

}
