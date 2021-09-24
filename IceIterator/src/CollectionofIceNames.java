
public class CollectionofIceNames implements Container {

	String IceNames[] = { "Crescent Ice", "Crushed Ice", "Nugget Ice", "Full Cube", "Block Ice","Spheres" };

	@Override
	public Iterator getIterator() {

		return new CollectionofIceIterator();
	}

	private class CollectionofIceIterator implements Iterator {
		int i;

		@Override
		public boolean hasNext() {
			if (i < IceNames.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return IceNames[i++];
			}
			return null;
		}
	}

}
