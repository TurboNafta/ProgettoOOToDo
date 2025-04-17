package model;

public class Utente {
    private String login;
    private String password;
    public Utente(String login, String password){
        this.login = login;
        this.password = password;
    }

    public void CreaBacheca(Bacheca bacheca) {
    }

    public void ModificaBacheca(Bacheca bacheca) {
    }

    public void EliminaBacheca(Bacheca bacheca) {

    }

    public void LeggereUtenti(ToDo todo){

    }

    public void ModificaSfondo(ToDo todo){

    }

    public void RicercaToDo(ToDo todo){

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
