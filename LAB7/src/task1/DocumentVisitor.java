package task1;

import task1.document.BoldTextSegment;
import task1.document.ItalicTextSegment;
import task1.document.PlainTextSegment;
import task1.document.UrlSegment;

public interface DocumentVisitor {
    public StringBuilder visit(ItalicTextSegment italic);
    public StringBuilder visit(BoldTextSegment bold);
    public StringBuilder visit(UrlSegment url);
    public StringBuilder visit(PlainTextSegment plain);
    public StringBuilder getDocument();
}
