import jobOffers.*;

import java.util.List;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        try {
            JobOffers jo = new JobOffers();

            // Adding skills
            jo.addSkills("java", "python", "swEng", "mvc", "projectMgmt", "userEx");

            // Adding positions
            jo.addPosition("juniorProgrammer", "python:5", "java:8");
            jo.addPosition("internA", "python:5", "java:8");

            // Adding candidates
            jo.addCandidate("John", "java");
            jo.addCandidate("Mary", "python", "java");
            jo.addCandidate("Linda", "java", "python");
            jo.addCandidate("Jack", "java", "python");

            // Adding applications
            List<String> applications = jo.addApplications("Mary", "juniorProgrammer", "internA");
            System.out.println("Applications for Mary: " + applications);

            // Adding consultants
            jo.addConsultant("James", "python", "java");
            jo.addConsultant("Susan", "mvc", "java");

            // Adding ratings
            jo.addRatings("James", "John", "java:8");
            jo.addRatings("James", "Linda", "java:4", "python:7");
            jo.addRatings("James", "Mary", "java:8", "python:9");

            // Discarding applications
            List<String> discardedApplications = jo.discardApplications();
            System.out.println("Discarded Applications: " + discardedApplications);

            // Getting eligible candidates for a position
            List<String> eligibleCandidates = jo.getEligibleCandidates("juniorProgrammer");
            System.out.println("Eligible candidates for juniorProgrammer: " + eligibleCandidates);

            // Adding candidate city
            jo.addCandidateCity("John", "New York");

            // Adding position city
            jo.addPositionCity("juniorProgrammer", "San Francisco");

            // Adding city distance
            jo.addCityDistance("New York", "San Francisco", 3000);

            // Calculating distance
            int distance = jo.calculateDistance("New York", "San Francisco");
            System.out.println("Distance between New York and San Francisco: " + distance);

            // Getting candidates by distance (this one is the one to fix)
            // List<String> candidatesByDistance = jo.getCandidatesbyDistance("juniorProgrammer", 3500);
            // System.out.println("Candidates within 3500 miles for juniorProgrammer: " + candidatesByDistance);

            // System.out.println("Candidates within 3500 miles for juniorProgrammer: " + candidatesByDistance);

        } catch (JOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}