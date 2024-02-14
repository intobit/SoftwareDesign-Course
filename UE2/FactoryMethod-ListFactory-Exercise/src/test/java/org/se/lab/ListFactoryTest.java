package org.se.lab;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ListFactoryTest
{
	private ServiceLocator locator = ServiceLocator.getInstance();

	@Test
	public void testDefaultCreateList()
	{
		ListFactory factory = locator.newListFactory();

		List<String> list = factory.createList();

		list.add("eins");
		list.add("zwei");
		list.add("drei");

		Assert.assertEquals(3, list.size());
		Assert.assertTrue(list instanceof ArrayList<String>);
	}

	@Test
	public void testCreateArrayList()
	{
		ListFactory factory = locator.newListFactory();
		
		List<String> list = factory.createList(Type.ARRAY);
		
		list.add("eins");
		list.add("zwei");
		list.add("drei");
		
		Assert.assertEquals(3, list.size());
		Assert.assertTrue(list instanceof ArrayList<String>);
	}

	@Test
	public void testCreateLinkedList()
	{
		ListFactory factory = locator.newListFactory();

		List<String> list = factory.createList(Type.LINKED);

		list.add("eins");
		list.add("zwei");
		list.add("drei");

		Assert.assertEquals(3, list.size());
		Assert.assertTrue(list instanceof LinkedList<String>);
	}

	@Test
	public void testSingleObject()
	{
		ServiceLocator s1 = ServiceLocator.getInstance();
		ServiceLocator s2 = ServiceLocator.getInstance();
		Assert.assertTrue(s1 == s2);
	}
}
