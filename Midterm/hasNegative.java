public static boolean hasNegative(int[] a) {
	int i;
	boolean hasNegative = false;
	for (i = 0; i < a.length-1; i++) {
		if (a[i] < 0) {
			return true;
			hasNegative = true;
			break;
		}
	}

	if (hasNegative = false) {
		return false;
	}
}
