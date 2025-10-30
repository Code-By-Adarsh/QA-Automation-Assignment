package Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null){
            String reportPath = System.getProperty("user.dir") + "\\reports\\AutomationAssignment.html";
            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);

            spark.config().setDocumentTitle("Login Test Report");
            spark.config().setReportName("Automation Assignment");
            spark.config().setTheme(Theme.DARK);

            extent = new ExtentReports();
            extent.attachReporter(spark);
            extent.setSystemInfo("Automation Tester: ", "Adarsh Mishra");
            extent.setSystemInfo("Browser: ", "Chrome");
            extent.setSystemInfo("Report: ","QA Automation Assignment");
        }
        return extent;
    }
}