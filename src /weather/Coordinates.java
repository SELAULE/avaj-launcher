package weather;

	public class Coordinates {
	    private int _longitude;
	    private int _latitude;
	    private int _height;

		public Coordinates(int longitude, int latitude, int height) {
			this._height = height;
			this._latitude = latitude;
			this._longitude = longitude;
		}

        public int get_longitude() {
            return _longitude;
        }

        public int get_latitude() {
            return _latitude;
        }

        public int get_height() {
            return _height;
        }
    }