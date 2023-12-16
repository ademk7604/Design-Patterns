package creationalDesignP.Item4.PrototypeDP;

public class PrototypeDPDemo {
	public static void main(String[] args) {

		Soldier availableSolder = new Soldier(100, 45, 20, 50, 60, 5, "Kilic", true);

		// Cloneable ozelligi ile asker uretelim
		// DP beni bundan kurtaracak isAvailableForWar ri manuel gelip falsh a cekmek problem
		
		Soldier notAvailableSoldier = availableSolder.clone();
		notAvailableSoldier.setAvailableForWar(false);

	}

}
