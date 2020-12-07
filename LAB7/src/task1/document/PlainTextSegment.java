package task1.document;

import task1.DocumentVisitor;

public class PlainTextSegment extends TextSegment {


    public PlainTextSegment(String content) {
        super(content);
    }

    @Override
    public StringBuilder accept(DocumentVisitor visitor) {
        return visitor.visit(this);
    }
}
