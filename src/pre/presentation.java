package pre;

import dao.DaoImpl;
import metier.MetierImpl;

// instenciation statique

public class presentation {
    public static void main(String[] args) {
        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("Le résultat : "+metier.calcul());
    }
}
