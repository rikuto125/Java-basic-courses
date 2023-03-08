package contents5_2;

public class Rectangle implements VolumeInterface {
	// 縦
	private Integer vertical;

	// 横
	private Integer side;

	// 高さ
	private Integer height;

	public Integer getVertical() {
		return vertical;
	}

	public void setVertical(Integer vertical) {
		this.vertical = vertical;
	}

	public Integer getSide() {
		return side;
	}

	public void setSide(Integer side) {
		this.side = side;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	@Override
	public double area() {
		return (double)this.vertical * (double)this.side;
	}

	//四角錐
	@Override
	public double volume() {
		return this.area() * this.height / 3;
	}
}
