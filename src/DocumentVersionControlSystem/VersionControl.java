package DocumentVersionControlSystem;

import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private List<DocumentVersion> versions = new ArrayList<>();

    public void saveVersion(DocumentVersion version) {
        versions.add(version);
        System.out.println("Version saved.");
    }

    public void listVersions() {
        for (int i = 0; i < versions.size(); i++) {
            System.out.println("Version " + (i + 1) + ": " + versions.get(i).getContent());
        }
    }

    public DocumentVersion getVersion(int index) {
        if (index >= 0 && index < versions.size()) {
            return versions.get(index);
        }
        throw new IllegalArgumentException("Invalid version index");
    }
}
