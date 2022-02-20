spring 2021 exam

public static boolean allEqual(int[] a) {
	int i;
	if (a==null or a.length==0) {
		return false;
	}
	if (a.length==1) {
		return true;
	}	
	for (i = 0; i < a.length-1; i++) {
		if (a[i]!=a[i+1]) {
			return false;
		} else {
			return true;
		}
	}
}

