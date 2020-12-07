package task1;

import task1.document.BoldTextSegment;
import task1.document.ItalicTextSegment;
import task1.document.PlainTextSegment;
import task1.document.UrlSegment;

public class MarkdownVisitor implements DocumentVisitor {

    private StringBuilder document = new StringBuilder();

    @Override
    public StringBuilder visit(ItalicTextSegment italic) {
        StringBuilder builder = new StringBuilder(italic.getContent());

        builder.insert(0,"*");
        builder.append("*");

        return builder;

    }

    @Override
    public StringBuilder visit(BoldTextSegment bold) {
        StringBuilder builder = new StringBuilder(bold.getContent());

        builder.insert(0,"**bold**");
        builder.append("**bold**");

        return builder;
    }

    @Override
    public StringBuilder visit(UrlSegment url) {
        StringBuilder builder = new StringBuilder(url.getContent());
        StringBuilder description = new StringBuilder(url.getDescription());

        builder.insert(0,"(");
        builder.append(")");
        description.insert(0,"[");
        description.append("]");

        return description.append(builder);

    }

    @Override
    public StringBuilder visit(PlainTextSegment plain) {
        StringBuilder builder = new StringBuilder(plain.getContent());

        return builder;
    }

    @Override
    public StringBuilder getDocument() {
        return document;
    }

    public void setDocument(StringBuilder document) {
        this.document = document;
    }
}
