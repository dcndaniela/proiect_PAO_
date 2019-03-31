public class Arbitru extends Persoana{

    private String facultate;
    private double salariu;

    public Arbitru(int id, String nume, String facultate,double salariu){
        super(id, nume);
        this.facultate=facultate;
        this.salariu=salariu;
    }
    public Arbitru(){
        super();
        facultate="Undefined";
        salariu=-1;
    }

    public double getSalariu() {
        return salariu;
    }
    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public String getFacultate() {
        return facultate;
    }
    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

}
