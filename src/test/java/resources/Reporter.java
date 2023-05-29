package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporter {
    public  static  ExtentReports extent;
    public static ExtentSparkReporter spark;

    public Reporter() {
    }

    public static ExtentReports getExtentReports(){
        if (extent == null) {
            extent = new ExtentReports();
        }
        return extent;
    }

    public static void getExtentSparkReporter(String codeSpring){
        if (spark == null) {
            spark = new ExtentSparkReporter(System.getProperty("user.dir") + "\\reportsTest\\" + codeSpring + "\\report" + codeSpring + ".html");
            extent.attachReporter(spark);
            extent.setReportUsesManualConfiguration(true);
        }
    }

    public static void createTestCase(String nameTestCase, Status status, String details){
        extent
                .createTest(nameTestCase)
                .log(status, details);
        //extent.flush();
    }

    public static void flushTest(){
        extent.flush();
    }
}
