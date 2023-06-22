package cloning;

public class CloneStudent implements Cloneable{

	int id = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
