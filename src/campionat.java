import java.util.*;

public class campionat {

    private static campionat single_instance = null;
    private Sponsor sponsor;
    //private String s;

    private campionat(){
        System.out.println(" Bine ati venit la campionatul european de fotbal ! ");
    }

    public static campionat campionat(){
        if(single_instance==null)
            single_instance=new campionat();
        return single_instance;

    }

    private Meci[] meciuri = new Meci[]{
            new Meci(new Arbitru(1, "Arbitru1", "Facultatea de Sport, Cluj ",2789), "CSA Steaua", "Astra", "2-0","22 aprilie 2019"),
            new Meci(new Arbitru(2, "Arbitru2", "Facultatea de Educatie fizica si sport, Iasi ",5590), "CSA Steaua", "Dinamo", "4-1", "14 aprilie 2019"),
            new Meci(new Arbitru(3, "Arbitru3", "Colegiul National de Educatie fizica, Sibiu ",5876.5), "CSA Steaua", "Viitorul", "1-1","19 aprilie 2019"),
            new Meci(new Arbitru(4, "Arbitru4", "Facultatea de Sport, Sibiu  ",8234), "CSA Steaua", "Otelul", "2-0","19 aprilie 2019"),
            new Meci(new Arbitru(5, "Arbitru5", "Colegiul National de Educatie fizica, Bucuresti ",7777.7), "Rapid", "CSA Steaua", "1-2","19 aprilie 2019"),
            new Meci(new Arbitru(6, "Arbitru6", "Facultatea de Sport, Craiova  ",5643), "Astra", "Dinamo", "1-3","15 aprilie 2019"),
            new Meci(new Arbitru(7, "Arbitru7", "Colegiul National de Educatie fizica, Craiova ",4567), "Astra", "Viitorul", "1-4","1 mai 2019"),
            new Meci(new Arbitru(8, "Arbitru8", "Facultatea de Sport, Calarasi ",5239.8), "Rapid", "Astra", "2-4","14 aprilie 2019"),
            new Meci(new Arbitru(9, "Arbitru9", "Facultatea de Sport, Constanta",4890.2), "Astra", "Otelul", "2-5","22 aprilie 2019"),
            new Meci(new Arbitru(10, "Arbitru10", "Facultatea de Sport, Bacau ",5621), "Viitorul", "Dinamo", "0-0","24 aprilie 2019"),
            new Meci(new Arbitru(11, "Arbitru11", "Facultatea de Sport, Giurgiu  ",6900), "Viitorul", "Otelul", "2-1","2 aprilie 2019"),
            new Meci(new Arbitru(12, "Arbitru12", "Colegiul National de Educatie fizica, Bacau ",6431.6), "Rapid", "Viitorul", "3-3","28 aprilie 2019"),
            new Meci(new Arbitru(13, "Arbitru13", "Colegiul National de Educatie fizica, Bucuresti ",8844), "Otelul", "Dinamo", "3-4","29 aprilie 2019"),
            new Meci(new Arbitru(14, "Arbitru14", "Facultatea de Sport, Bucuresti  ",8364.6), "Rapid", "Dinamo", "2-0","2 aprilie 2019"),
            new Meci(new Arbitru(15, "Arbitru15", "Colegiul National de Educatie fizica, Craiova ",7314.8), "Rapid", "Otelul", "1-0","11 aprilie 2019")

    };
    public Meci[] getMeciuri(){
        return meciuri;
    }

}
