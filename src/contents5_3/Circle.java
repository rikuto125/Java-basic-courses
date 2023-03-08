package contents5_3;

/***
 * 円クラス
 * @author 作成者
 *
 */
public class Circle implements VolumeInterface  {
	// 直径
	private Integer diameter;

	// 円周率
	private Double pi = 3.14;

	public Integer getDiameter() {
		return diameter;
	}

	public void setDiameter(Integer diameter) {
		this.diameter = diameter;
	}

	public Double getPi() {
		return pi;
	}

	@Override
	public double area() {
		double radius = (double)this.diameter / 2;
		return radius * radius * this.pi;
	}

	@Override
	public double volume() {
		double radius = (double)this.diameter / 2;
		return radius * radius * radius * this.pi * 4 / 3;
	}
}
