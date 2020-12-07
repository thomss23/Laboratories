package task1.document;

import task1.DocumentVisitor;

public class UrlSegment extends TextSegment {

    private String description;

    public UrlSegment(String content, String description) {
        super(content);
        this.description = description;
    }

    @Override
    public StringBuilder accept(DocumentVisitor visitor) {
        return visitor.visit(this);
    }

    public String getDescription() {
        return description;
    }
}
