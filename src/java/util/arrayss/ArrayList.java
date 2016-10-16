package java.util.arrayss;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;

public class ArrayList<Element> implements Serializable {
	/**
	 * Author Glib Kariahin Evgenijovich. Collection ArrayList Build on arrays.
	 * Version 1.0
	 */
	private static final long serialVersionUID = 1314905945238222694L;
	private Element e;
	private int capacity;
	private int index = 0;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;

	public ArrayList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("You cant make less 0");
		}
		this.capacity = capacity;
	}

	public ArrayList() {
		capacity = DEFAULT_CAPACITY;
	}

	public int getCapacity() {
		return capacity;
	}

	private transient Object[] element = new Object[capacity];

	public void addElement(Element e) {
		// ?
		element[index] = e;
		index++;
		size++;
		// ?
	}

	public void addElement(Element[] e) {

		element[index] = e;
		index++;
		size++;
	}

	public void addElement(Element e, int index) {

		element[index] = e;

		size++;
	}

	public void addCollection(Collection c) {
		element[index] = c;
		index++;
		size++;
	}

	public int indexOf(Element e) {
		int index = 0;
		int length = element.length;

		for (int x = 0; x < length; x++) {
			if (element[x] == e) {
				index = x;
			}
		}
		return index;
	}

	public boolean hasElement(Element e) {

		boolean has = false;
		int length = element.length;

		for (int x = 0; x < length; x++) {
			if (element[x] == e) {
				has = true;
			}

		}
		return has;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public Object lastIndexOf() {
		int length = element.length;

		Object obj = element[length];
		return obj;

	}

	public int leaveVolume() {
		int leave = element.length - size;
		if (leave < 0) {

			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return leave;
	}

	public boolean biggerElement(Element e) {
		if (element[element.length] == e) {
			return true;
		}
		return false;
	}

	public int getSize() {
		return size;
	}

	public boolean compareTo(Collection coll) {
		if (coll.size() < getSize()) {
			return true;
		}
		return false;

	}

	public boolean containsElement(Element element) {
		if (indexOf(element) > 0) {
			return true;
		}
		return false;

	}

	public void remove(Element e) {
		element[indexOf(e)] = null;
	}

	public void remove(int index) {
		element[index] = null;
	}

	public void removeAll() {
		element = null;
		size = -1;
		index = -1;
	}

	public class SubArray {
		public Element[] copy(Element[] e) {
			Element[] elements = e;
			return elements;

		}

		public Element[] copy(Element[] e, int from, int to) {

			int newLength = to - from;
			Element[] obj = (Element[]) new Object[newLength];

			Element[] elements = obj;

			return elements;
			// Maybe it can work ?(I don’t know!!!).
		}

	}
}
