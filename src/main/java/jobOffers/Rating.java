package jobOffers;

import java.util.*;

class Rating {
    String consultant;
    String candidate;
    TreeMap<String, Integer> skillsRatings = null;
    Rating (String consultant, String candidate, TreeMap<String, Integer> skillsRatings) {
        this.consultant = consultant;
        this.candidate = candidate;
        this.skillsRatings = skillsRatings;
    }
    int getAverageRating () {
        return skillsRatings.values().stream()
                .mapToInt(v -> v).sum() / skillsRatings.size();
    }

    Integer getRating (String skill) {
        return skillsRatings.get(skill);
    }

    public String toString() {
        return consultant + " " + candidate + " " + skillsRatings;
    }
}
