package by.epam.learn.action;

import by.epam.learn.entity.MyArray;
import by.epam.learn.exception.MyArrayException;

public class NegativeCount {

	public int findNegativeElements(MyArray array) throws MyArrayException {
		int count = 0;
		for (int i = 0; i < array.getSize(); i++) {
			if (array.getElement(i) < 0)
				count++;
		}
		return count;
	}
}
