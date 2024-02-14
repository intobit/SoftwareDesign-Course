package org.se.lab;

import java.util.ArrayList;
import java.util.List;

public class XmlElement extends XmlNode {

    private final String text;
    private final List<XmlNode> childElement = new ArrayList<>();

    public XmlElement(String text) {
        this.text = text;
    }

    @Override
    public String toXML() {
        StringBuilder xml = new StringBuilder();
        xml.append("<").append(text).append(">");
        for (XmlNode child: childElement) {
            xml.append(child.toXML());
        }
        xml.append("</").append(text).append(">");
        return xml.toString();
    }

    @Override
    public void addNestedElement(XmlNode element) {
        childElement.add(element);
    }
}
