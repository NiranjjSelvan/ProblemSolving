package ProblemSolving;

class LivingBeing {
	void livingBeingMethod() {
		System.out.println("I'm a living being");
	}
}

class Animals extends LivingBeing {
	String animalName = "Tiger";
}

class Birds extends LivingBeing {
	String birdName = "Peacock";
}

public class HierarchiaInterface {

	public static void main(String[] args) {
		Animals aObject = new Animals();
		Birds bObject = new Birds();
		System.out.println(aObject.animalName);
		aObject.livingBeingMethod();
		System.out.println(bObject.birdName);
		bObject.livingBeingMethod();
	}

}
