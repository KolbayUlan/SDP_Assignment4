package DocumentVersionControlSystem;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        VersionControl versionControl = new VersionControl();

        document.setContent("Version 1: Initial draft.");
        versionControl.saveVersion(document.saveVersion());

        document.setContent("Version 2: Added introduction.");
        versionControl.saveVersion(document.saveVersion());

        document.setContent("Version 3: Added conclusion.");
        versionControl.saveVersion(document.saveVersion());

        System.out.println("List of all document versions:");
        versionControl.listVersions();

        System.out.println("\nRestoring to Version 2...");
        document.restoreVersion(versionControl.getVersion(1));
        System.out.println("Current Document Content: " + document.getContent());
    }
}

