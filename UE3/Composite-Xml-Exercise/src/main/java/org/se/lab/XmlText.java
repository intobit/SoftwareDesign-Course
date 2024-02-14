package org.se.lab;

public class XmlText extends XmlNode {

    private final String text;
    public XmlText(String text) {
        this.text = text;
    }

    @Override
    public String toXML() {
        return text;
    }
}
