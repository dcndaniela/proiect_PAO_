
import java.util.*;

import static java.lang.Math.abs;
import static java.util.Collections.sort;

import java.util.Collections;

public class OameniService {

    protected Persoana[] persoane=
            new Persoana[]{
                    new Suporter(1,"Suporter1","Gica Hagi"),
                    new Suporter(2,"Suporter2","Marius Pop"),
                    new Suporter(3,"Suporter3","Vlad Chiriches"),
                    new Suporter(4,"Suporter4","Marius Lacatus"),
                    new Suporter(5,"Suporter5","Ciprian Tatarusanu"),

                    new Sponsor(6,"Sponsor1",2744.88,6.5),
                    new Sponsor(7,"Sponsor2",54000,4),
                    new Sponsor(8,"Sponsor3",39000.99,0.8),
                    new Sponsor(9,"Sponsor4",4400.44,12),
                    new Sponsor(10,"Sponsor5",100000,2),
                    new Sponsor(11,"Sponsor6",53000.2,0.3),

                    new PresedinteEchipa(12,"PresedinteSteaua","CSA Steaua",128),
                    new PresedinteEchipa(13,"PresedinteDinamo","Dinamo",284),
                    new PresedinteEchipa(14,"PresedinteAstra","Astra",321),
                    new PresedinteEchipa(15,"PresedinteViitorul","Viitorul",123),
                    new PresedinteEchipa(16,"PresedinteOtelul","Otelul",222),
                    new PresedinteEchipa(17,"PresedinteRapid","Rapid",311)



            };

    public Persoana getPersoana(int i){
        return persoane[i];
    }

    private Angajat[] angajati =
            new Angajat[]{
                    new Antrenor(1,"Antrenor1",45, "CSA Steaua",7.3),
                    new Antrenor(2,"Antrenor2",50,"Dinamo",12),
                    new Antrenor(3,"Antrenor3",39,"Rapid",3),
                    new Antrenor(4,"Antrenor4",39,"Viitorul",2.4),
                    new Antrenor(5,"Antrenor5",39,"Astra",6),
                    new Antrenor(6,"Antrenor6",39,"Otelul",5.1),

                    new Jucator(7,"Gica Hagi",34.4  ,"CSA Steaua","atacant"),
                    new Jucator(8,"Marius Pop",30,"Otelul","atacant"),
                    new Jucator(9,"Ciprian Tatarusanu",23,"CSA Steaua","portar"),
                    new Jucator(10,"Vlad Chiriches",32,"Dinamo","fundas"),
                    new Jucator(11,"Ion Pop",27,"Rapid","fundas"),
                    new Jucator(12,"Marius Radu",25,"Rapid","atacant"),
                    new Jucator(13,"Alex Chirita",26,"Otelul","atacant"),
                    new Jucator(14,"Ion Marian",21,"Astra","fundas"),
                    new Jucator(15,"Paul Nastase",22,"CSA Steaua","atacant"),
                    new Jucator(16,"Cosmin Alexei",23,"Dinamo","portar"),
                    new Jucator(17,"Dorin Doru",24,"Viitorul","portar"),
                    new Jucator(18,"Marian Cretu",25,"Rapid","portar"),
                    new Jucator(19,"Ilie Timofte",26,"CSA Steaua","fundas"),
                    new Jucator(20,"George Radu",27,"Rapid","fundas"),
                    new Jucator(21,"Stefan Stan",22,"Astra","portar"),
                    new Jucator(22,"Mihai Radulescu",26,"Otelul","portar")

            };


    private Jucator getJucatorById(int idjucator){
        int i;
        Jucator curent=null;
        for(i=0;i<angajati.length;i++)
            if(angajati[i] instanceof Jucator && angajati[i].getId()==idjucator ){
                curent=(Jucator)angajati[i];
            }
        return curent;
    }

    //
// 1)Determina numarul de jucatori din echipa ech
    public int detNrJucatorDinEchipa(String ech){
        int nr=0;
        for(int i=0;i<angajati.length;i++)
            if(angajati[i] instanceof Jucator && angajati[i].getEchipa().equals(ech) ){
                nr++;
            }
        return nr;
    }


    // 2) echipa pe care o sustine 1 suporter:
// a) det suporterul cu ID-ul specificat
    private Suporter getSuporterById(int suporterId) {
        Suporter selectedSuporer = null;
        for (int i = 0; i < persoane.length; i++) {
            if ( persoane[i] instanceof Suporter &&persoane[i].getId() == suporterId) {
                selectedSuporer =(Suporter) persoane[i];
            }
        }
        if(selectedSuporer == null){
            System.out.println("Nu a fost gasit un user cu id-ul: "+suporterId);
        }
        return selectedSuporer;
    }

    // det echipa pe care o sustine 1 suporter(echipa pe care o sustine e cea din care face parte jucatorul preferat al lui)
    // c)
    public void detEchipaSustinuta(int suporterId, int jucatorId) {
        System.out.print("Suporterul cu id-ul: "+suporterId);
        Suporter suporter = getSuporterById(suporterId);
        //System.out.println("se numeste "+ persoane[suporterId-1] );
        System.out.print(" se numeste "+suporter.getNume_persoana());
        //System.out.println(" si il are ca jucator favorit pe :"+ "["+jucatorId+"] ");
        Jucator jucator = getJucatorById(jucatorId);
        System.out.println(" si il are ca jucator favorit pe "+jucator.getNume()+" cu id-ul: "+jucatorId+", deci sustine echipa "+jucator.getEchipa());
        // Date startDate = new Date();
        //  Reservation newReservation = new Reservation(user, book, startDate, endDate);
        // reservations[currentIndex] = newReservation;
        //  currentIndex++;
    }

    // 3)   Performanta unui antrenor
//a)cauta antrenorul cu numele respectiv
    private Antrenor getAntrenorByNume(String numeAntrenor){
        Antrenor curent=null;
        for(int i=0;i<angajati.length;i++)
            if(angajati[i] instanceof Antrenor && angajati[i].getNume().equals(numeAntrenor) ){
                curent=(Antrenor) angajati[i];
            }
        return curent;
    }

    // b) ii afiseaza performanta
    public void detPerformantaAntrenor(String numeAntrenor){
        Antrenor antrenor=getAntrenorByNume(numeAntrenor);
        System.out.print("Antrenorul "+numeAntrenor+ " al echipei "+antrenor.getEchipa());
        System.out.println(", ca performanta este "+antrenor.getNivelPerformanta());
    }

    // 4) cat timp mai poate sa activeze 1 jucator
    private Jucator getJucatorByNume(String numeJucator){
        Jucator curent=null;
        for(int i=0;i<angajati.length;i++)
            if(angajati[i] instanceof Jucator && angajati[i].getNume().equals(numeJucator) ){
                curent=(Jucator) angajati[i];
            }
        return curent;
    }

    public void detPerioadaJucator(String numeJucator){
        Jucator jucator=getJucatorByNume(numeJucator);
        System.out.print("Jucatorul "+jucator.getTip()+ " "+jucator.getNume());
        double nr=jucator.esteApt();
        if(nr<=0)
            System.out.println(" si-a incheiat activitatea acum "+ abs(jucator.esteApt())+ " ani");
        else
        if(nr<1)
            System.out.println(" mai poate activa timp de  "+ nr*10+ " luni");
        else
            System.out.println(" mai poate activa timp de "+ nr + " ani");

    }



// 5) echipa castigatoare

    public String detEchipaCastigatoare() {

        campionat c = campionat.campionat();
        String ech = "Unknown";
        String castigatoare="Unknown";
        int nrS = 0, nrD = 0, nrA = 0, nrV = 0, nrO = 0, nrR = 0, x = 0, maxi = 0,nr;

        for (int i = 0; i < c.getMeciuri().length; i++) {
            String[] sir = c.getMeciuri()[i].getScor().split("-");
            nr = 0;

            for (String a : sir) {
                x = Integer.parseInt(a);
                nr++;
                if (nr == 1)
                    ech = c.getMeciuri()[i].getEchipa1();
                else
                    ech = c.getMeciuri()[i].getEchipa2();

                switch (ech) {
                    case "CSA Steaua":
                        nrS += x;
                        if (nrS > maxi) {
                            maxi = nrS;
                            castigatoare = "CSA Steaua";
                        }
                        break;
                    case "Dinamo":
                        nrD += x;
                        if (nrD > maxi) {
                            maxi = nrD;
                            castigatoare = "Dinamo";
                        }
                        break;
                    case "Viitorul":
                        nrV += x;
                        if (nrV > maxi) {
                            maxi = nrV;
                            castigatoare = "Viitorul";
                        }
                        break;
                    case "Astra":
                        nrA += x;
                        if (nrA > maxi) {
                            maxi = nrA;
                            castigatoare = "Astra";
                        }
                        break;
                    case "Otelul":
                        nrO += x;
                        if (nrO > maxi) {
                            maxi = nrO;
                            castigatoare = "Otelul";
                        }
                        break;
                    case "Rapid":
                        nrR += x;
                        if (nrR > maxi) {
                            maxi = nrR;
                            ech = "Rapid";
                        }
                        break;
                    default:
                        castigatoare = "Unknown";
                        break;
                }
            }
        }
        //System.out.println(nrO+" "+nrS+" "+nrD+" "+nrA+" "+nrV+" "+nrR);
        return castigatoare;
    }



// 6) sponsorul pentru un meci

    public Sponsor detSponsorMeci(String meciul){
        //generez nr aleator de la 5 la 10(inclusiv)
        int x=(int)(Math.random() * ((10 - 5) + 1)) + 5;
        return (Sponsor) persoane[x];
    }


    // 7) meciurile care se joaca in aceeasi zi
/*
    public void detMeciuriJucateInAceeasiZi(){
        campionat c=campionat.campionat();
        int i,j;
        int nr=0;
        String sir[]=new String[6];

        int ok;
        for(i=0;i<c.getMeciuri().length-1;i++) {
            ok=1;
            if(i>0) {
                for(int k=0;k<sir.length;k++)
                    if(sir[k].equals(c.getMeciuri()[i].getData_meci()))
                    {ok=0;break;}
            }

            if(ok==0)
                continue;

            sir[nr++]=c.getMeciuri()[i].getData_meci();

            System.out.println(" Meciurile care s-au jucat in data de " + c.getMeciuri()[i].getData_meci() + " sunt: ");
            System.out.println(c.getMeciuri()[i].getEchipa1() + " - " + c.getMeciuri()[i].getEchipa2());
            for (j = i + 1; j < c.getMeciuri().length; j++)
                if (c.getMeciuri()[i].getData_meci().equals(c.getMeciuri()[j].getData_meci() ) )
                    System.out.println(c.getMeciuri()[j].getEchipa1() + " - " + c.getMeciuri()[j].getEchipa2());
        }
    }

    */


    // 8) cel mai bine platit arbitru

    public Arbitru detCelMaiBinePlatitArbitru(){
        Arbitru a=new Arbitru(0,"","",0);
        campionat c=campionat.campionat();
        double maxi=0;
        int i;
        for(i=0;i<c.getMeciuri().length;i++)
            if(maxi< c.getMeciuri()[i].getArbitru().getSalariu()) {
                maxi = c.getMeciuri()[i].getArbitru().getSalariu();
                a = c.getMeciuri()[i].getArbitru();
            }
        return a;
    }


    // 9) jucatorii dintr-un meci

    public void detJucatoriiDinMeci(String partida){

        String sir[]=partida.split("-");
        for (String a : sir){
            System.out.println("Jucatorii din echipa "+ a+ ": ");
            for(int i=0;i<angajati.length;i++)
                if(angajati[i] instanceof Jucator && angajati[i].getEchipa().equals(a) )
                    System.out.println(angajati[i].getNume());

        }
    }


    // 10) Atacantii din echipa ech
    public void detAtacantiiDinEchipa(String ech){

        System.out.println("Atacantii din echipa "+ech+" sunt: ");
        for (int i=0;i<angajati.length;i++)
            if((angajati[i] instanceof Jucator) && (angajati[i].getEchipa().equals(ech) ) && (angajati[i].getTip().equals("atacant") ) )
                System.out.println(angajati[i].getNume()+" - "+angajati[i].getVarsta()+" ani");
    }


    // 11) Angajatii dintr-o echipa
    public void detAngajatiiDinEchipa(String ech){

        System.out.println("Angajatii din echipa "+ech+" sunt: ");
        for (int i=0;i<angajati.length;i++)
            if( (angajati[i].getEchipa().equals(ech) ))
                System.out.println(angajati[i].getNume()+" - "+angajati[i].getTip());
    }


// 12) Afiseaza presedintii echipelor sortati descrescator dupa actiuni

    public void detPresedintiEchipe(){
        int maxi=0,mini=9999;
        PresedinteEchipa p_maxi=new PresedinteEchipa(),p_mini=new PresedinteEchipa();
        System.out.print("Presedintele care detine cele mai multe actiuni este ");
        for (int i=0;i<persoane.length;i++)
            if(persoane[i] instanceof PresedinteEchipa) {
                PresedinteEchipa pre = (PresedinteEchipa) persoane[i];
                if (pre.getNumar_actiuni() > maxi) {
                    maxi = pre.getNumar_actiuni();
                    p_maxi = pre;
                }
                if (pre.getNumar_actiuni() < mini) {
                    mini = pre.getNumar_actiuni();
                    p_mini = pre;
                }
            }
        System.out.println(p_maxi.getNume_persoana() +" - "+p_maxi.getNumar_actiuni()+" actiuni");
        System.out.print("Presedintele care detine cele mai putine actiuni este ");
        System.out.println(p_mini.getNume_persoana() +" - "+p_mini.getNumar_actiuni()+" actiuni");
    }

}
