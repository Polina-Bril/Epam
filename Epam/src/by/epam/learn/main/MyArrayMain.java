package by.epam.learn.main;

import by.epam.learn.action.*;
import by.epam.learn.creator.MyArrayCreator;
import by.epam.learn.entity.MyArray;
import by.epam.learn.exception.MyArrayException;

public class MyArrayMain {
	public static void main(String[] args) {
		try {
			MyArrayCreator creator = new MyArrayCreator();
			MyArray q = new MyArray(5);
			creator.fillRandomized(q, 2, 7);
			System.out.println(q);
			Average average= new Average();
			double resultAverage = average.findAverage(q);
			System.out.println("Array's average is " + resultAverage);

			MaxElement max= new MaxElement();
			int resultMax = max.findMaxElement(q);
			System.out.println("Array's max is " + resultMax);
			
			MinElement min= new MinElement();
			int resultMin = min.findMinElement(q);
			System.out.println("Array's min is " + resultMin);
			
			NegativeCount negativeElements = new NegativeCount();
			int resultNegative = negativeElements.findNegativeElements(q);
			System.out.println("Array has " + resultNegative + " negative elements");
		
			PositiveCount positiveElements = new PositiveCount();
			int resultPositive = positiveElements.findPositiveElements(q);
			System.out.println("Array has " + resultPositive + " positive elements");
		
			Sum sum= new Sum();
			int resultSum = sum.findSum(q);
			System.out.println("Array's sum is " + resultSum);
		
			SetElementIfTrue set= new SetElementIfTrue();
			int rule = 5;
			set.setElements(q, rule, 100);
			System.out.println("Array with new sets\n" + q);
		
		} catch (MyArrayException e) {
			System.err.println("Error of creating array " + e);
		}
	}
}