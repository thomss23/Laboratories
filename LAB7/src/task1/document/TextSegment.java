package task1.document;

import task1.DocumentVisitor;

/**
 * Represents a text segment of a document that needs to be parsed.
 */
public abstract class TextSegment {
    private String content;

    TextSegment(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // TODO add method for applying the visitor
    public abstract StringBuilder accept(DocumentVisitor visitor);
}
