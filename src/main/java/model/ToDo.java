package model;

import java.awt.*;
import java.util.ArrayList;

public class ToDo {
    private String titolo;
    private String scadenza;
    private String link;
    private String url;
    private String descrizione;
    private Image immagine;
    private String coloresfondo;

    private Utente autore;
    private ArrayList <Utente> condivisione;
    private CheckList checklist;

    public ToDo(String titolo, String scadenza, String link, String url,String descrizione,Image immagine,
                String coloresfondo, Utente autore, Utente condivisione, CheckList checklist){
        this.titolo = titolo;
        this.scadenza = scadenza;
        this.link = link;
        this.url = url;
        this.descrizione = descrizione;
        this.immagine = immagine;
        this.coloresfondo = coloresfondo;
        this.autore = autore;
        this.condivisione= new ArrayList<>();
        this.checklist = new CheckList();
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getScadenza() {
        return scadenza;
    }

    public void setScadenza(String scadenza) {
        this.scadenza = scadenza;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Image getImmagine() {
        return immagine;
    }

    public void setImmagine(Image immagine) {
        this.immagine = immagine;
    }

    public String getColoresfondo() {
        return coloresfondo;
    }

    public void setColoresfondo(String coloresfondo) {
        this.coloresfondo = coloresfondo;
    }

    public Utente getAutore() {
        return autore;
    }

    public void setAutore(Utente autore) {
        this.autore = autore;
    }

    public ArrayList<Utente> getCondivisione() {
        return condivisione;
    }

    public void setCondivisione(ArrayList<Utente> condivisione) {
        this.condivisione = condivisione;
    }

    public CheckList getChecklist() {
        return checklist;
    }

    public void setChecklist(CheckList checklist) {
        this.checklist = checklist;
    }
}
