package Implementations;

import java.util.Collection;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		LandonHotel cambridge = new LandonHotel("Cambridge", "regular", 2, 150);
		LandonHotel oxford = new LandonHotel("Oxford", "suite", 4, 250);
		LandonHotel bloomington = new LandonHotel("Bloomington", "Guest", 1, 100);
		
		Collection<LandonHotel> rooms = List.of(cambridge, oxford, bloomington);
		double total = getPotentialRevenue(rooms);
		System.out.println("Total potential revenue is : " + total);
	}

	private static double getPotentialRevenue(Collection<LandonHotel> rooms) {
		return rooms.stream().mapToDouble(r -> r.getRate()).sum();
	}

}
