import java.util.*;

public class Liste{
    private int _taille;
    private Chainon _tete;
    private Chainon _queue;
    private int indexe = 0;
    Stack<AccoladeOuvrante> pile = new Stack();
    List<Mot> listeMot = new ArrayList<>();

    private Pile stackOpenBracket = new Pile();

    //Pour test
    public int getIndexe() {
        return indexe;
    }

    public int add(String element){
        _taille++;
        switch (element){
            case "{":
                AccoladeOuvrante a1 = new AccoladeOuvrante();
                pile.add(a1);
                break;

            case "}":
                AccoladeFermante accoladeF = new AccoladeFermante();
                AccoladeOuvrante accolade = pile.pop();
                accoladeF.setAssocie(accolade);
                accoladeF.getAssocie().setAssocie(accoladeF);
                break;

            default:
                Mot mot = new Mot(element,indexe);
                listeMot.add(mot);
                indexe++;
                break;
        }
        return _taille;
    }

    public int trouverMot(String motRecherche, int dernierIndexe){
        int i = dernierIndexe;
        while (i < listeMot.size()&&motRecherche != listeMot.get(i).clef){
            if(listeMot.get(i).clef.equals(motRecherche)){
                dernierIndexe = i;
            }
            System.out.println(dernierIndexe + " ");
            i++;
        }
        return dernierIndexe;
    }

}
