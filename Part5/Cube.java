package Part5;

public class Cube {
	private int volume;
	private int edge;
	public Cube (int edgeLength) {
		this.edge = edgeLength;
	}
	public int volume() {
		volume = edge * edge * edge;
		return volume;
	}
	public String toString() {
		return "The length of the edge is " + edge + " and the volume is " + volume;
	}
}
