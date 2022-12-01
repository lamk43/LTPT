/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_laptrinhtaptin.C2;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author lam
 */
public class Student extends Person implements Serializable {
    private String name;
    private int studentID;
    private String phone;
    private String email;
    
    public Student() {
        
    }

    public Student(String name, int studentID, String phone, String email) {
        this.name = name;
        this.studentID = studentID;
        this.phone = phone;
        this.email = email;
    }

    public Student(String name, int studentID, String phone, String email, Date birthday, boolean gender, String blood_type) {
        super(birthday, gender, blood_type);
        this.name = name;
        this.studentID = studentID;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", studentID=" + studentID + ", phone=" + phone + ", email=" + email + '}';
    }

    
//    public static void serialize(Student[] s){
//        try {
//            FileOutputStream fileOut = new FileOutputStream("./src/BT_TepTin_Cau2/student.txt");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//
//            for (Student item : s) {
//                out.writeObject(item);
//            }
//
//            out.close();
//            fileOut.close();
//            System.out.println("Save object successfully!");
//            
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
//    
//    public static void deserialize(Student[] s) {
//        try{
//            FileInputStream fileInput = new FileInputStream("./src/bt_laptrinhtaptin.C2/student.txt");
//            ObjectInputStream input = new ObjectInputStream(fileInput);
//            
//            //readObject trả về một Object nên cần ép về kiểu Student
//            for(int i=0; i<s.length; i++) s[i] = (Student) input.readObject();
//
//            //Hiện thông tin
//            System.out.println("Read object from File:");
//            for (Student item : s) {
//                System.out.println(item.toString());
//            }
//            
//        } catch(IOException | ClassNotFoundException e){}
//    }
    
}
