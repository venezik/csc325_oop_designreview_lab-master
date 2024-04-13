package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    private int credits;

    public Senior(String name, short age, double gpa, int credits) {
        super(name, age, "", gpa);
        if (credits >= 85) {
            this.credits = credits;
        } else {
            throw new IllegalArgumentException("Senior student must have at least 85 credits");
        }
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        if (credits >= 85) {
            this.credits = credits;
        } else {
            throw new IllegalArgumentException("Senior student must have at least 85 credits");
        }
    }

    @Override
    public String toString() {
        return "Senior{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", address='" + getAddress() + '\'' +
                ", gpa=" + getGpa() +
                ", credits=" + credits +
                '}';
    }

}

