/**
 * fabryka zolnierzy
 * @author PiotrGrabowski
 *
 */
public class TroopFactory {
	/**
	 * @param ttype type of troop
	 * @param damage damage dealt by troop
	 * @param hp hitpoints of that troop
	 * @return instance of desired troop
	 */
	public Troop getTroop(TroopType ttype, int damage, int hp){
		switch(ttype){
		case SOLDIER:
			return new SoldierTroop(damage, hp, false);
		case MEDIC:
			return new MedicTroop(damage, hp, true);
		default:
			return null;
		}
	}
}
