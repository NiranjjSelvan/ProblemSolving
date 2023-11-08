package ProblemSolving;

class ElderSibling {
	String ElderName = "Nivejaa";

	void elderSibilingMethod() {
		System.out.println("I'm from ElderSibiling class");
	}
}

class YoungerSibiling extends ElderSibling {
	String YoungName = "Niranjj";

	void youngerSibilingMethod() {
		System.out.println("I'm from youngerSibiling class");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		YoungerSibiling youngObject = new YoungerSibiling();
		youngObject.elderSibilingMethod();
		youngObject.youngerSibilingMethod();
		System.out.println("Parent and child name is " + youngObject.ElderName + youngObject.YoungName);
	}
}
