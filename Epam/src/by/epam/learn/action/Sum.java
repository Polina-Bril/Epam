package by.epam.learn.action;

import by.epam.learn.entity.MyArray;
import by.epam.learn.exception.MyArrayException;

public class Sum {

	public int findSum(MyArray array) throws MyArrayException {
		int sum = 0;
		for (int i = 0; i < array.getSize(); i++) {
			sum += array.getElement(i);
		}
		return sum;
	}
}
