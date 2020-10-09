import lesson2.MVP1;
import lesson2.MVP2;
import lesson2.MVP3;
import lesson2.MVP4;

class Main {
	public static void main(String[] args) {
		MVP1 question1 = new MVP1();
		question1.replaceitems();

		MVP2 question2 = new MVP2();
		question2.populatearray();

		MVP3 question3 = new MVP3();
		question3.multiply();
		
		MVP4 question4 = new MVP4();
		question4.diagonal();
	}
}