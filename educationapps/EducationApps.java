/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educationapps;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author regular Adam and Kevin
 */
public class EducationApps {

    
    private static ArrayList<JFrame> frames = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login Temp_Login = new Login();
        frames.add(Temp_Login);
        frames.get(0).setVisible(true);
        Home_Screen Temp_Home_Screen = new Home_Screen();
        frames.add(Temp_Home_Screen);
	LessonPlans Temp_LessonPlans = new LessonPlans();
	frames.add(Temp_LessonPlans);
	Edit_Lesson_plan Temp_Edit_Lesson_plan = new Edit_Lesson_plan();
	frames.add(Temp_Edit_Lesson_plan);
	NewJFrame Temp_NewJFrame = new NewJFrame();
	frames.add(Temp_NewJFrame);
	JFrameScience Temp_JFrameScience = new JFrameScience();
	frames.add(Temp_JFrameScience);
	JFrame_Chem Temp_JFrame_Chem = new JFrame_Chem();
	frames.add(Temp_JFrame_Chem);
    }

    
    public static void switchFrame(JFrame originatingFrame, int NextFrame){
        originatingFrame.setVisible(false);
        frames.get(NextFrame).setVisible(true);
    }
    
    
}
