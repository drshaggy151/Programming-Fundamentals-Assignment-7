package QueueClass;

//*********************************************************************************************************
//Assignment 7 Queue Program         Author: Carlos Fernandez/L30031020
//
//Program that stores alphabet characters with a limit of 10 letters
//*********************************************************************************************************

public class Queue<abc> {

	public static final int MAX_SIZE = 10;

	public class Node {

		public abc element;

		public Node link;

	}

	public Node first;

	public Node last;

	public int numOfElements;

	public Queue() {

		first = null;

		last = null;

		numOfElements = 0;

	}

	public void add(abc element) {

		if (isFull())

			throw new RuntimeException("Queue overflow");

		Node a = new Node();

		a.element = element;

		a.link = null;

		if (first == null) {

			first = a;

		}

		else

		{

			last.link = a;

		}

		last = a;

		numOfElements++;

	}

	public abc remove() {

		if (first == null) {

			throw new RuntimeException("Queue underflow");

		}

		else

		{

			abc removed = first.element;

			first = first.link;

			if (first == null) {

				last = null;

			}

			numOfElements--;

			return removed;

		}

	}

	public int size() {

		return numOfElements;

	}

	public boolean isFull() {

		if (numOfElements == MAX_SIZE)

			return true;

		else

			return false;

	}

	public boolean isEmpty() {

		if (first == null)

			return true;

		else

			return false;

	}

	public boolean contains(Object o) {

		Node cur = first;

		while (cur != null) {

			if (cur.element.equals(o))

				return true;

			cur = cur.link;

		}

		return false;

	}

	public String toString() {

		String string1 = "[";

		if (numOfElements > 0) {

			string1 += first.element;

			Node cur = first.link;

			while (cur != null) {

				string1 += ", " + cur.element;

				cur = cur.link;

			}

		}

		string1 += "]";

		return string1;

	}

}
