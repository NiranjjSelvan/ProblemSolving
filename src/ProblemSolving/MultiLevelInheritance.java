package ProblemSolving;

class GrandParent {
	String GrandDadName = "Nataraj";

	void grandParentMethod() {
		System.out.println("I'm from GrandParent");
	}
}

class Parent extends GrandParent {
	String ParentName = "Selvan";

	void parentMethod() {
		System.out.println("I'm from Parent");
		System.out.println("GrandDad Name - " + GrandDadName);
	}
}

class Child extends Parent {
	String ChildName = "Niranjj";

	void childMethod() {
		System.out.println("I'm from child");
		System.out.println("Parent Name - " + ParentName);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Child childObject = new Child();
		childObject.childMethod();
		childObject.parentMethod();
		childObject.grandParentMethod();
		System.out.println("Vhild Name - " + childObject.ChildName);
	}

}
