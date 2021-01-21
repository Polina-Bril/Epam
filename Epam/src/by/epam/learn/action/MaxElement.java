package by.epam.learn.action;

import by.epam.learn.entity.MyArray;
import by.epam.learn.exception.MyArrayException;

public class MaxElement {

	public int findMaxElement(MyArray array) throws MyArrayException {
		int max = array.getElement(0);
		for (int i = 0; i < array.getSize(); i++) {
			if (array.getElement(i) > max)
				max = array.getElement(i);
		}
		return max;
	}
}
