package com.classofmay;

abstract class Figure {

	abstract void calcArea(double length);

}

class FigureImpl extends Figure {

	@Override
	void calcArea(double length) {
		// TODO Auto-generated method stub
		

			double result = length * length;

			System.out.println("Area of rectangle is:"+result);
	}

	

	}

	public class AbstractDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			FigureImpl fimpl = new FigureImpl();

			fimpl.calcArea(25);
			
			
		

	}
}

