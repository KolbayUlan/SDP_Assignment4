package DocumentVersionControlSystem;

public class Document {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public DocumentVersion saveVersion() {
        return new DocumentVersion(content);
    }

    public void restoreVersion(DocumentVersion memento) {
        this.content = memento.getContent();
    }
}
