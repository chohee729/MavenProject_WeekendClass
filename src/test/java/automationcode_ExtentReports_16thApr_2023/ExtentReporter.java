package automationcode_ExtentReports_16thApr_2023;



import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {

	public static ExtentReports generateExtentReport() throws Throwable {
	//Step1: make sure the dependency of extentreports is inside pom.xml file
	//Step2: create the object of ExtentReports Class
	
	ExtentReports extentReport = new ExtentReports();
	
	//Step3: create the object of File Class and pass the path of the .html in the constructor
	File extentReportFile = new File(System.getProperty("user.dir")+"//test-output//ExtentReports//extentreport.html");
	
	//Step4: Create the Object of ExtentReporter Class and pass the File reference in the Constructor
	ExtentSparkReporter sparkReporter = new ExtentSparkReporter (extentReportFile);

	//Step5: using the sparkReporter, we can configure a lot of things
	sparkReporter.config().setTheme(Theme.DARK);
	sparkReporter.config().setReportName("TN Automation Results");
	sparkReporter.config().setDocumentTitle("TNReportTitle|Automation|Results");
	sparkReporter.config().setTimeStampFormat("MM/dd/yyyy hh:mm:ss");
	
	//Step6: We need to attach the ExtentReport with the SparkReporter
	extentReport.attachReporter(sparkReporter);
	
	//Step7: Additional information 안해도됌
	
	//Step8: Return the extentReport
	return extentReport;
	
}}
