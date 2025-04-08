package com.research.assistant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResearchRequest {
    private String content;
    private String operation;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }
}
