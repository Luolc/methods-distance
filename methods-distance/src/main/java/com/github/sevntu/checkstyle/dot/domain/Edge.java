package com.github.sevntu.checkstyle.dot.domain;

import java.util.HashMap;
import java.util.Map;

/* Class name is sufficiently descriptive. */
@SuppressWarnings("PMD.ShortClassName")
public class Edge implements Element, AttributeHolder {

    private final Node start;

    private final Node end;

    private final Map<String, String> attrs = new HashMap<>();

    public Edge(Node start, Node end) {
        this.start = start;
        this.end = end;
    }

    public Node getStart() {
        return start;
    }

    public Node getEnd() {
        return end;
    }

    public void setLabel(String label) {
        addAttribute("label", label);
    }

    @Override
    public Map<String, String> attributes() {
        return attrs;
    }
}
