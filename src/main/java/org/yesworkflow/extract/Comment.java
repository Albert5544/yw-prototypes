package org.yesworkflow.extract;

public class Comment {

    public final Long lineId;
    public final Long sourceId;
    public final Long lineNumber;
    public final String text;
    
    public Comment(Long lineId, Long sourceId, Long lineNumber, String text) {
        this.lineId = lineId;
        this.sourceId = sourceId;
        this.lineNumber = lineNumber;
        this.text = text;
    }
}