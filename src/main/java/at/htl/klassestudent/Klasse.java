package at.htl.klassestudent;

import java.util.Arrays;

public class Klasse {

    private int klassenbezeichnung;
    private Student[] students;

    public Klasse() {
        students = new Student[30];
    }

    public Klasse(int klassenbezeichnung, Student[] students) {
        this.klassenbezeichnung = klassenbezeichnung;
        this.students = students;
    }

    public int getKlassenbezeichnung() {
        return klassenbezeichnung;
    }

    public void setKlassenbezeichnung(int klassenbezeichnung) {
        this.klassenbezeichnung = klassenbezeichnung;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return String.valueOf(klassenbezeichnung);
    }

    public void sortBubble() {

    }
}
