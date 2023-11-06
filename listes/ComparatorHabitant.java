package listes;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

    @Override
    public int compare(Ville v1, Ville v2) {
        if (v1.getNbHabs() > v2.getNbHabs()){
            return -1; // Ville passé en paramètre + grande que this
        }
        else if (v1.getNbHabs() < v2.getNbHabs()){
            return 1;
        }
        return 0;
    }
}
