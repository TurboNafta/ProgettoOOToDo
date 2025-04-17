package model;

import java.util.ArrayList;

public class CheckList {
    private ArrayList<Attivita> attivita;
    public CheckList(){
        this.attivita = new ArrayList<>();
    }
    public CheckList(ArrayList<Attivita> attivita){
        this.attivita = attivita;

    }

    private void AggiungiAttivita(Attivita attivita){

    }

    private void RimuoviAttivita(Attivita attivita){

    }

    public ArrayList<Attivita> getAttivita() {
        return attivita;
    }

    public void setAttivita(ArrayList<Attivita> attivita) {
        this.attivita = attivita;
    }
}
