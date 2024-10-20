package ReportGenerationSystem;

public class Main {
    public static void main(String[] args) {
        ReportingSystem reportingSystem = new ReportingSystem();

        System.out.println("Generating PDF Report:");
        ReportGenerator pdfReport = new PDFReportGenerator();
        reportingSystem.generateReport(pdfReport);

        System.out.println("Generating HTML Report:");
        ReportGenerator htmlReport = new HTMLReportGenerator();
        reportingSystem.generateReport(htmlReport);

        System.out.println("Generating Plain Text Report:");
        ReportGenerator plainTextReport = new PlainTextReportGenerator();
        reportingSystem.generateReport(plainTextReport);
    }
}

