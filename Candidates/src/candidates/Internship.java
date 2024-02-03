/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candidates;

/**
 *
 * @author Lul
 */

    public class Internship extends Candidate {

    private String major;
    private String semester;
    private String university;

    public Internship(String major1, String semester1, String university1, String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeCandidate) {
        super();
    }

   

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}

