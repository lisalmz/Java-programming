	Q8
	public static Range encompassingRange(Range[] ranges) {
		// test corner cases, ranges is null or empty

		if (ranges == null || ranges.length() == 0) {
			return null;
		}

		int min_val = ranges[0].getLowerBound();
		int max_val = ranges[0].getUpperBound();

		for (int i=1, i<ranges.length(), i++){
			if (ranges[i].getLowerBound() < min_val){
				min_val = ranges[i].getLowerBound();
			}
			if (ranges[i].getUpperBound() > max_val){
				max_val = ranges[i].getUpperBound();
			}
		}
		// we need to return a range object
		return new Range(min_val, max_val);
	}
	