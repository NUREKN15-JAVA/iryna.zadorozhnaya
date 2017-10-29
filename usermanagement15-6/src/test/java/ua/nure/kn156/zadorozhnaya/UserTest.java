package ua.nure.kn156.zadorozhnaya;

import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;

public class UserTest extends TestCase {

    private User user;
    private Date dateOfBirthd;

    protected void setUp() throws Exception {
        super.setUp();
        user = new User();

        Calendar calendar = Calendar.getInstance();
        calendar.set(1998, calendar.FEBRUARY, 4);
        dateOfBirthd = calendar.getTime();
    }

    public void testGetFullName() {
        user.setFirstName("Irina");
        user.setLastName("Zadorozhnaya");
        assertEquals("Zadorozhnaya, Irina", user.getFullName());
    }

    public void testGetAge() {
        user.setDateOfBirthd(dateOfBirthd);
        assertEquals(2017 - 1998, user.getAge());
    }
}
