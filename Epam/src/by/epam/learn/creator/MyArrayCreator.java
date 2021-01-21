package by.epam.learn.creator;

import by.epam.learn.entity.MyArray;
import by.epam.learn.exception.MyArrayException;

public class MyArrayCreator {

	public void fillRandomized(MyArray array, int minValue, int maxValue) {
		int h = array.getSize();
		for (int j = 0; j < h; j++) {
			try {
				int value = (int) ((Math.random() * (maxValue - minValue)) + minValue);
				array.setElement(j, value);
			} catch (MyArrayException e) {
				// log: exception impossible
			}
		}
	}

	public MyArray createArray(int n, int minValue, int maxValue) throws MyArrayException {

		MyArray array = new MyArray(n);
		fillRandomized(array, minValue, maxValue);
		return array;
	}
}
