package contents5_3;

public class Contents5_3 {

	public static void main(String[] args) {
		// 三角形クラスを作成
		Triangle triangle = new Triangle();
		triangle.setVertical(10);
		triangle.setSide(5);
		triangle.setHeight(3);

		System.out.println("三角形の面積：" + triangle.area());
		System.out.println("三角形の体積：" + triangle.volume());

		// 四角形クラスを作成
		Rectangle rectangle = new Rectangle();
		rectangle.setVertical(10);
		rectangle.setSide(5);
		rectangle.setHeight(3);

		System.out.println("四角形の面積：" + rectangle.area());
		System.out.println("四角形の体積：" + rectangle.volume());

		// 円クラスを作成
		Circle circle = new Circle();
		circle.setDiameter(10);

		System.out.println("円の面積：" + circle.area());
		System.out.println("円(球)の体積：" + circle.volume());
	}

}
