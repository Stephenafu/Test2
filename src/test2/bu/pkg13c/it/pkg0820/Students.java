/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2.bu.pkg13c.it.pkg0820;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Stephen
 */
public class Students {
    static String stu_id, stu_name, stu_age, stu_class, stu_program;

    public static String getStu_id() {
        return stu_id;
    }

    public static void setStu_id(String stu_id) {
        Students.stu_id = stu_id;
    }

    public static String getStu_name() {
        return stu_name;
    }

    public static void setStu_name(String stu_name) {
        Students.stu_name = stu_name;
    }

    public static String getStu_age() {
        return stu_age;
    }

    public static void setStu_age(String stu_age) {
        Students.stu_age = stu_age;
    }

    public static String getStu_class() {
        return stu_class;
    }

    public static void setStu_class(String stu_class) {
        Students.stu_class = stu_class;
    }

    public static String getStu_program() {
        return stu_program;
    }

    public static void setStu_program(String stu_program) {
        Students.stu_program = stu_program;
    }
      public static void writeFile(String content)
    {
        try {
            BufferedWriter myBF; 
            myBF = new BufferedWriter(new FileWriter("Students.txt", true));
            myBF.newLine();
            myBF.write(content);
            myBF.close();
        } catch (IOException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void SaveDB(String inputName, String inputID, String inputAge, String inputClass, inputProgram) {
        try {
            Connection myCon;
            Statement myST;
            myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentprofile","root","");
            myST = myCon.createStatement();
            
            myST.executeUpdate("insert into student(Student_Name,ID,Age, Class, Program) values ('"+inputName+"', '"+inputID+"','"+inputAge+"', '"+inputClass+"','"+inputProgram+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    static void setStu_name(String inputName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
        


