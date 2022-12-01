/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_laptrinhtaptin.C2;

import java.util.Date;
/**
 *
 * @author quang
 */

public abstract class Person {
    private Date birthday;
    private boolean gender;
    private String blood_type;

    public Person() {
    }
    
    public Person(Date birthday, boolean gender, String blood_type) {
        this.birthday = birthday;
        this.gender = gender;
        this.blood_type = blood_type;
    }

    public Date getBirthday() {
        return birthday;
    }

    public boolean getGender() {
        return gender;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }
    
    
}

