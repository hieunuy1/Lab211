/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candidates;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Lul
 */
public class Manager {

    private int menu() {
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Internship");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkLimit(1, 5);
        return choice;
    }

    public void createCandidate(ArrayList<Candidate> candidates,
            int type) {
        while (true) {
            System.out.print("Enter id: ");
            String id = Validation.checkString();
            System.out.print("Enter first name: ");
            String firstName = Validation.checkString();
            System.out.print("Enter last name: ");
            String lastName = Validation.checkString();
            System.out.print("Enter birth date: ");
            int birthDate = Validation.checkLimit(1900,
                    Calendar.getInstance().get(Calendar.YEAR));
            System.out.print("Enter address: ");
            String address = Validation.checkString();
            System.out.print("Enter phone: ");
            String phone = Validation.checkPhone();
            System.out.print("Enter email: ");
            String email = Validation.checkEmail();
            Candidate candidate = new Candidate(id, firstName, lastName,
                    birthDate, address, phone, email, type);
            if (Validation.checkId(candidates, id)) {
                switch (type) {
                    case 0 -> createExperience(candidates, candidate);
                    case 1 -> createFresher(candidates, candidate);
                    case 2 -> createInternship(candidates, candidate);
                }
            } else {
                return;
            }
            System.out.print("Do you want to continue (Y/N): ");
            if (!Validation.checkYN()) {
                return;
            }
        }
    }

    public void createExperience(ArrayList<Candidate> candidates,
            Candidate candidate) {
        System.out.print("Enter year of experience: ");
        int yearExperience = Validation.checkExprience(candidate.getBirthDate());
        System.out.print("Enter professional skill: ");
        String professionalSkill = Validation.checkString();
        candidates.add(new Experience(yearExperience, professionalSkill,
                candidate.getId(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate()));
        System.err.println("Create success.");
    }

    public void createFresher(ArrayList<Candidate> candidates,
            Candidate candidate) {
        System.out.print("Enter graduation date: ");
        String graduationDate = Validation.checkString();
        System.out.print("Enter graduation rank: ");
        candidates.add(new Fresher(candidate.getId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getTypeCandidate()));
        System.err.println("Create success.");
    }

    public void createInternship(ArrayList<Candidate> candidates,
            Candidate candidate) {
        System.out.print("Enter major: ");
        String major = Validation.checkString();
        System.out.print("Enter semester: ");
        String semester = Validation.checkString();
        System.out.print("Enter university: ");
        String university = Validation.checkString();
        candidates.add(new Internship(major, semester, university, candidate.getId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getTypeCandidate()));
        System.err.println("Create success.");
    }

    public  void searchCandidate(ArrayList<Candidate> candidates) {
        printListNameCandidate(candidates);
        System.out.print("Enter andidate name (First name or Last name): ");
        String nameSearch = Validation.checkString();
        System.out.print("Enter type of candidate: ");
        int typeCandidate = Validation.checkLimit(0, 2);
        for (Candidate candidate : candidates) {
            if (candidate.getTypeCandidate() == typeCandidate
                    && candidate.getFirstName().contains(nameSearch)
                    || candidate.getLastName().contains(nameSearch)) {
                System.out.println(candidate.toString());
            }
        }
    }

    public void printListNameCandidate(ArrayList<Candidate> candidates) {
        System.err.println("Experience Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Experience) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
        System.err.println("Fresher Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Fresher) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
        System.err.println("Internship Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Internship) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
    }

}
