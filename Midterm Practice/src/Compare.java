	public static boolean allEqual(int[] a) {
		int i;	
		for (i = 0; i < a.length; i++) {
			if (a[i]!=a[i+1]) {
				return false;
			} else {
				return true;
			}
		}
	}
	

