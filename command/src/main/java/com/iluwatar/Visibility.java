package com.iluwatar;

public enum Visibility {

	VISIBLE,
	INVISIBLE;

	@Override
	public String toString() {
		
		String s = "";
		
		switch (this) {
		case INVISIBLE:
			s = "invisible";
			break;
		case VISIBLE:
			s = "visible";
			break;
		default:
			break;
		
		}
		return s;
	}
}
