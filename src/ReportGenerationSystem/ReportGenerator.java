package ReportGenerationSystem;

public abstract class ReportGenerator {

    public final void generateReport() {
        formatHeader();
        formatBody();
        formatFooter();
        System.out.println("Report generation complete.\n");
    }

    // Abstract methods for steps that vary in subclasses
    protected abstract void formatHeader();
    protected abstract void formatBody();
    protected abstract void formatFooter();
}

