
	public static boolean sameStates(){
		LicensePlate l1 = new LicensePlate('1ABC234','CA');

		LicensePlate l2 = new LicensePlate('2ABC345','CA');

		LicensePlate l3 = new LicensePlate('1ABC234','CA');

		if (l1.getState()==l2.getState()&&l1.getState()==l3.getState()){
			return true;
		} else {
			return false;
		}
	}
