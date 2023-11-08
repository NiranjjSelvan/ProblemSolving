package Implementations;

public class LandonHotel {
	String name;
	String type;
	int capacity;
	int rate;

	public LandonHotel(String name, String type, int capacity, int rate) {
		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

}
