package com.q1;

import java.util.Comparator;

public class SortingAsPerName implements Comparator<Merchandise> {

	@Override
	public int compare(Merchandise arg0, Merchandise arg1) {
		return arg0.getItemCode().compareTo(arg1.getItemCode());

	}
}
