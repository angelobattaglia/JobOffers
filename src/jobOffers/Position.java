package jobOffers;
import java.util.*;

public class Position {
    String position;

    String city;

    TreeMap<String, Integer> skillLevelMap = null;
    Position (String position, TreeMap<String, Integer> skillLevelMap) {
        this.position = position; this.skillLevelMap = skillLevelMap;
    }

    int getAverageLevel () {
        return skillLevelMap.values().stream()
                .mapToInt(v -> v).sum() / skillLevelMap.size();
    }
    Integer getLevel (String skill) {
        return skillLevelMap.get(skill);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPosition() {
        return position;
    }


}
