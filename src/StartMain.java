import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class StartMain {

    public static void main(String[] args) {

        OameniService os=new OameniService();

        System.out.println("Cate cautari doriti sa efectuati? ");
        Scanner in = new Scanner(System.in);
        Scanner inn = new Scanner(System.in);
        int nr_cautari = inn.nextInt();
        int i;

        System.out.println("Echipele calificate in campionat sunt: CSA Steaua, Rapid, Dinamo, Viitorul, Astra, Otelul");
        for(i=0;i<nr_cautari;i++)
        {
            System.out.println();
            System.out.println("Optiunea 1: Numarul de jucatori dintr-o anumita echipa");
            System.out.println("Optiunea 2: Echipa sustinuta de un anumit suporter");
            System.out.println("Optiunea 3: Aflati performanta unui antrenor");
            System.out.println("Optiunea 4: Cat timp mai poate activa un jucator");
            System.out.println("Optiunea 5: Echipa castigatoare ");
            System.out.println("Optiunea 6: Sponsorul unui anumit meci");
            //System.out.println("Optiunea 7: Zilele in care s-au jucat meciurile");
            System.out.println("Optiunea 8: Cel mai bine platit arbitru");
            System.out.println("Optiunea 9: Jucatorii dintr-un anumit meci");
            System.out.println("Optiunea 10: Atacantii dintr-o anumita echipa");
            System.out.println("Optiunea 11: Angajatii dintr-o anumita echipa");
            System.out.println("Optiunea 12: Presedintele de echipa care detine cele mai multe/putine actiuni");


            System.out.println("Tastati optiunea: ");
            int op=inn.nextInt();

            switch(op){
                case 1:
                    System.out.println("Tastati echipa: ");
                    String e=in.nextLine();
                    System.out.println("In echipa "+e+" sunt "+os.detNrJucatorDinEchipa(e)+" jucatori");
                    break;
                case 2:
                    //int sup_id, juc_id;
                    System.out.println("Tastati id suporter: ");
                    int sup_id=inn.nextInt();
                    System.out.println("Tastati id jucator: ");
                    int juc_id=inn.nextInt();
                    os.detEchipaSustinuta(sup_id,juc_id);
                    break;
                case 3:
                    System.out.println("Tastati nume antrenor: ");
                    e=in.nextLine();
                    os.detPerformantaAntrenor(e);
                    break;
                case 4:
                    System.out.println("Tastati nume jucator: ");
                    e=in.nextLine();
                    os.detPerioadaJucator(e);
                    break;
                case 5:
                    System.out.println("Echipa castigatoare este "+os.detEchipaCastigatoare()+" !!!");
                    break;
                case 6:
                    System.out.println("Tastati meciul:  ");
                    e=in.nextLine();
                    System.out.println("Sponsorul meciului "+ e+ " este "+ os.detSponsorMeci(e).getNume_persoana()+
                            " care investit "+os.detSponsorMeci(e).getSponsorizare()+" lei");
                    break;
                /*case 7:
                    os.detMeciuriJucateInAceeasiZi();
                    break;
                */
                case 8:
                    System.out.println("Cel mai bine platit arbitru este  "+os.detCelMaiBinePlatitArbitru().getNume_persoana()+
                            ", avand salariul de "+os.detCelMaiBinePlatitArbitru().getSalariu()+" lei");
                    break;
                case 9:
                    System.out.println("Tastati meciul:  ");
                    e=in.nextLine();
                    os.detJucatoriiDinMeci(e);
                    break;
                case 10:
                    System.out.println("Tastati echipa:  ");
                    e=in.nextLine();
                    os.detAtacantiiDinEchipa(e);
                    break;
                case 11:
                    System.out.println("Tastati echipa:  ");
                    e=in.nextLine();
                    os.detAngajatiiDinEchipa(e);
                    break;
                case 12:
                    os.detPresedintiEchipe();
                    break;
                default:
                    System.out.println("Ati introdus un numar invalid");
                    break;
            }
        }

        List<Object> list = new ArrayList<Object>();
        list.add(new Jucator());
        list.add(new Antrenor());
        list.add(new Arbitru());
        list.add(new Suporter());
        list.add(new Sponsor());
        list.add(new Meci());
        list.add(new PresedinteEchipa());
        list.add(new Persoana());

        Object obj = list.get(2);
        System.out.println(obj.getClass());





    }
}
