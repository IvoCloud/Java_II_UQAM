public class AccoladeFermante extends Chainon {
    AccoladeOuvrante associe;


    public AccoladeFermante() {
        this.associe = associe;
    }
    public AccoladeFermante(AccoladeOuvrante associe) {
        this.associe = associe;
    }




    //GET SET
    public void setAssocie(AccoladeOuvrante associe) {
        this.associe = associe;
    }

    public AccoladeOuvrante getAssocie() {
        return associe;
    }
}
