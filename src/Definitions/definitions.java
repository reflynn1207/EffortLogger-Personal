package Definitions;


import javafx.application.Application;
import javafx.stage.Stage;

public class definitions extends Application {

    // Default project arrays
    public static String[] projectNames = {"Business Project","Development Project"};
    public static int[] lifeCycleNumber = {1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 
                                            16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
                                            28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 40, 41,
                                            42, 43, 44, 45, 46, 47, 48, 49, 50};
    public static String[] lifeCycle = {"Problem Understanding", "Conceptual Design Plan", "Requirements",
                                        "Conceptual Design", "Conceptual Design Review", "Detailed Design Plan",
                                        "Detailed Design/Prototype", "Detailed Design Review", "Implementation Plan",
                                        "Test Case Generation", "Solution Specification", "Solution Review", 
                                        "Solution Implementation", "Unit/System Test", "Reflection", "Repository Update",
                                        "Planning", "Information Gathering", "Information Understanding", "Verifying",
                                        "Outlining", "Drafting", "Finalizing", "Team Meetinig", "Coach Meeting", "Stakeholder Meeting"};
    public static int[] effortCategoryNumber =  {1, 2, 3, 4, 5};
    public static String[] effortCategory = {"Plans", "Deliverables", "Interruptions", "Defects", "Others"};
    public static int[] deliverableNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    public static String[] plans = {"Project Plan", "Risk Management Plan", "Conceptual Design Plan", "Detailed Design Plan", "Implementation Plan"};
    public static String[] deliverables = {"Conceptual Design", "Detailed Design", "Test Cases", "Solution", 
                                            "Reflection", "Outline", "Draft", "Report", "User Defined", "Other"};
    public static String[] interruptions = {"Break", "Phone", "Teammate", "Vistor", "Other"};
    public static String[] defects = {"Not Specified", "10 Documentation", "20 Syntax", "30 Build, Package", "40 Assignment", "50 Interface", "60 Checking",
                                        "70 Data", "80 Function", "90 System", "100 Environment"};
    
    public static String[] test = {"test","test2","test3"};

    public static String[] logEntry = {"banana","apple","orange"};




    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }
    
}
