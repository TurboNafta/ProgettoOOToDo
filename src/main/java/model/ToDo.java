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

    public ToDo(){
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
}
