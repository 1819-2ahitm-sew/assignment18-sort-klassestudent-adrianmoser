package at.htl.klassestudent;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void student_compareTwoStudents_success() {
        Student maxi = new Student("Maxi", "Müller");
        Student susi = new Student("Susi", "Scholz");
        int compare = maxi.compareTo(susi);
        assertThat(compare, lessThan(0));
    }

    @Test
    public void student_compareEqualStudents_success() {
        Student maxi1 = new Student("Maxi", "Müller");
        Student maxi2 = new Student("Maxi", "Müller");
        int compare = maxi1.compareTo(maxi2);
        assertThat(compare, lessThan(0));
    }

    @Test
    public void student_compareEqualStudents02_success() {
        Student susi2 = new Student("Susi", "Scholz");
        Student maxi2 = new Student("Maxi", "Müller");
        int compare = susi2.compareTo(maxi2);
        assertThat(compare, lessThan(0));
    }

    @Test
    public void klasse_insertAStudent_success

}