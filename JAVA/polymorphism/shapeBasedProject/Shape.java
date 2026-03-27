package polymorphism.shapeBasedProject;

public interface Shape {
    void rotate();
	
	// Default method to resize the shape
	public default void resize() {
		System.out.println("Resizing the shape.");
		zoomOut();
		zoomIn();
	}
	// Static method to display shape info
	public static void displayShapeInfo() {
		System.out.println("This is a shape.");
	}
	
	//private methods
	private void zoomIn() {
		System.out.println("zoom in shape");
	}
	private void zoomOut() {
		System.out.println("zoom out shape");
	}
}
