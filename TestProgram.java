package QueueClass;

//*********************************************************************************************************
//Assignment 7 Queue Program         Author: Carlos Fernandez/L30031020
//
//Program that stores alphabet characters with a limit of 10 letters
//*********************************************************************************************************

public class TestProgram {

	public static void main(String[] args) {

		Queue<Character> letters = new Queue<Character>();

		char ch = 'A';

		try {

			System.out.println("Let's try to enqueue 12 letters into the queue");

			for (int i = 1; i < 12; i++, ch++) {

				System.out.println("Enqueue " + ch);

				letters.enqueue(ch);

			}

		}

		catch (Exception e)

		{

			System.out.println("***Error: " + e.getMessage() + "***");

		}

		System.out.println("Number of Characters in Queue = " + letters.size());

		System.out.println("Queue: " + letters);

		System.out.println("Now let's dequeue from the queue");

		while (!letters.isEmpty())

		{

			System.out.println("Dequeue " + letters.dequeue());

		}

		System.out.println("Number of Characters in Queue = " + letters.size());

		System.out.println("Queue: " + letters);

	}

}
