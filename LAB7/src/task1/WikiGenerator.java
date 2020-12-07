package task1;

import task1.document.TextSegment;

import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator {

    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        // TODO apply dokuwiki visitor on the text segments

        DokuVisitor doku = new DokuVisitor();
        for(TextSegment text: textSegments){
            doku.setDocument(doku.getDocument().append(text.accept(doku)));
        }
        return doku.getDocument();
    }

    public StringBuilder getMarkdownDocument() {
        // TODO apply Markdown visitor on the text segments

        MarkdownVisitor mark = new MarkdownVisitor();

        for(TextSegment text: textSegments){
            mark.setDocument(mark.getDocument().append(text.accept(mark)));
        }
        return mark.getDocument();

    }
}
