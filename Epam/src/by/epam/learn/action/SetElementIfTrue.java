package by.epam.learn.action;

import by.epam.learn.entity.MyArray;
import by.epam.learn.exception.MyArrayException;

public class SetElementIfTrue {

	public void setElements(MyArray array, int rule, int value) throws MyArrayException {
		for (int i = 0; i < array.getSize(); i++) {
			if (array.getElement(i) >= rule)
				array.setElement(i, value);
		}
	}
}
