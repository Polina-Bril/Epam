package by.epam.learn.entity;

import by.epam.learn.exception.MyArrayException;

public class MyArray {
	private int[] a;

	public MyArray(int[] a) {
		super();
		this.a = a;
	}

	public MyArray(int n) throws MyArrayException {
		if (n < 1) {
			throw new MyArrayException();
		}
		a = new int[n];
	}

	public int getSize() {
		return a.length;
	}

	public int getElement(int i) throws MyArrayException {
		if (checkRange(i)) {
			return a[i];
		} else {
			throw new MyArrayException();
		}
	}

	public void setElement(int i, int value) throws MyArrayException {
		if (checkRange(i)) {
			a[i] = value;
		} else {
			throw new MyArrayException();
		}
	}

	@Override
	public String toString() {
		final String BLANK = " ";
		StringBuilder s = new StringBuilder("Array with length: " + a.length + "\n");
		for (int value : a) {
			s.append(value).append(BLANK);
		}
		return s.toString();
	}

	private boolean checkRange(int i) {
		return (i >= 0 && i < a.length);
	}
}
