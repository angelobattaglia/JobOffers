package jobOffers;

class Application {
    String candidate;
    String position;
    boolean discarded = false;

    Application (String candidate, String position) {
        this.candidate = candidate; this.position = position;
    }

    String getPosition () {return position;} //used in method reference
    String getCandidate () {return candidate;}
    public String toString() {return candidate + " " + position;}
}
