package Coords;


import Geom.Point3D;

public class Map {
	//y		//x
	private Point3D leftup;
	private Point3D Rightdown;

	private String Diractroymap;
	private double x_length;
	private double y_length;
	/**
	 * Default Constractor of my Class 
	 */
	public Map () {
		this.leftup = new Point3D(32.105770,  35.202469);
		this.Rightdown = new Point3D(32.101899, 35.211588);
		this.x_length = this.Rightdown.y()-this.leftup.y();
		this.y_length = this.Rightdown.x()-this.leftup.x();
		this.Diractroymap = "Pictures&Icones/Ariel.png";

	}
	/**
	 * Constructor of map : recev 3 params
	 * @param Leftup
	 * @param Rightdown
	 * @param MapPath
	 */
	public Map(Point3D Leftup , Point3D Rightdown, String MapPath) {
		this.leftup = Leftup;
		this.Rightdown = Rightdown;
		this.x_length = this.Rightdown.y()-this.leftup.y();
		this.y_length = this.Rightdown.x()-this.leftup.x();
		this.Diractroymap = MapPath;

	}
	/**
	 * Getter of directory picture
	 * @return a Directory actual 
	 */
	public String getMapDiractory() {
		return this.Diractroymap;
	}
	/**
	 * Change the Directory of Picture 
	 * @param PathPic Receiv the  new Directory 
	 */
	public void setMap(String PathPic) {
		this.Diractroymap = PathPic;
	}



	/**
	 * this method convert the  coord gps to pixel 
	 * @param p1
	 * @param p2
	 * @return Point3D in Pixel Coordinates
	 */ 
	public Point3D coord2pixel (Point3D p ) {
		return new Point3D(((p.y()-leftup.y())/x_length),((p.x()-leftup.x())/y_length));
	}	
	/**
	 * this method convert the pixel to coord gps 
	 * @param dx
	 * @param dy
	 * @return the coord gps from  Source pixel
	 */
	public Point3D pixel2coord (double lat, double lng ) {
		return new Point3D((lat * x_length+leftup.y()), lng * y_length+leftup.x()); 
	}
	public double destpixels (Point3D p1, Point3D p2) {
		MyCoords m=new MyCoords();
		return m.distance3d(pixel2coord(p1.x(), p1.y()), pixel2coord(p2.x(),p2.y()));

	}
}

