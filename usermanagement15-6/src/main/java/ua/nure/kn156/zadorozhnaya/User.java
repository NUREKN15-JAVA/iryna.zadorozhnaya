package ua.nure.kn156.zadorozhnaya;

import java.util.Calendar;
import java.util.Date;

public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirthd;

    public User(User user) {
        id = user.getId();
        firstName = user.getFirstName();
        lastName = user.getLastName();
        dateOfBirthd = user.getDateOfBirthd();
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirthd() {
        return dateOfBirthd;
    }

    public void setDateOfBirthd(Date dateOfBirthd) {
        this.dateOfBirthd = dateOfBirthd;
    }

    public String getFullName() {
        return getLastName() + ", " + getFirstName();
    }

    public int getAge() {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int currentYear = calendar.get(Calendar.YEAR);
        int currentDay = calendar.get(Calendar.DAY_OF_YEAR);
        calendar.setTime(getDateOfBirthd());
        int year = calendar.get(Calendar.YEAR);
        int day = calendar.get(Calendar.DAY_OF_YEAR);
        int fullYears = currentYear - year;

        if (currentDay < day)
            fullYears--;

        System.out.println(fullYears);
        return fullYears;
    }

}
