package by.epam.learn.action;

import by.epam.learn.entity.MyArray;
import by.epam.learn.exception.MyArrayException;

public class MinElement {

	public int findMinElement(MyArray array) throws MyArrayException {
		int min = array.getElement(0);
		for (int i = 0; i < array.getSize(); i++) {
			if (array.getElement(i) < min)
				min = array.getElement(i);
		}
		return min;
	}
}
