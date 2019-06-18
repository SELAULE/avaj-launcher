package coordinates;

	public class Coordinates {
	    private int _longitude;
	    private int _latitude;
	    private int _height;

		protected Coordinates(int longitude, int latitude, int height) {
			this._height = height;
			this._latitude = latitude;
			this._longitude = longitude;
		}

	    public getLongitude() {
	        return _longitude;
		}
		
		public getLatitude() {
	        return _latitude;
		}
		
		public getHeight() {
	        return _height;
	    }
	}