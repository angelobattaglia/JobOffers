package jobOffers;
import java.util.*;

class Consultant {
    String name;
    Set<String> skills = null;
    Consultant (String name, Set<String> skills) {
        this.name = name; this.skills = skills;
    }
}
