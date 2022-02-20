public static boolean beginsWithZ (String[] s) {
	if (s == null || s.length() == 0) {
		return false;
	}
    if (s[0] == 'Z' || s[0] == 'z') {
		return true;
	}
    return false;
}