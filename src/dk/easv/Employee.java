package dk.easv;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee {
    private String name;
    private Birthday birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }

    public Birthday getBirthday() {
        return this.birthday;
    }

    public int getAge() {
        LocalDate start = LocalDate.of(this.birthday.getYear(), this.birthday.getMonth(), this.birthday.getDay());
        LocalDate now = LocalDate.now();

        return (int) ChronoUnit.YEARS.between(start, now);
    }
}
