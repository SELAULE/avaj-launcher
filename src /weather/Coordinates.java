package weather;

	public class Coordinates {
	    private int _longitude;
	    private int _latitude;
	    private int _height;

		public Coordinates(int longitude, int latitude, int height) {
		    if (height < 0)
		        this._height = 0;
		    else
		        this._height = height;

		    if (latitude < 0)
                this._latitude = 0;
		    else
		        this._latitude = latitude;
			if (longitude < 0)
                this._longitude = 0;
			else
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