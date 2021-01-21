package by.epam.learn.action;

import by.epam.learn.entity.MyArray;
import by.epam.learn.exception.MyArrayException;

public class Average {

	public double findAverage(MyArray array) throws MyArrayException {
		Sum sum = new Sum();
		int arraySum = sum.findSum(array);
		double average = (double) arraySum/ array.getSize();
		return average;
	}
}
