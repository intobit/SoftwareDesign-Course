package org.se.lab;

public abstract class XmlNode {

	public abstract String toXML();

	public void addNestedElement(XmlNode element)
	{
		throw new UnsupportedOperationException();
	}

}
