<!-- TOC -->
* [contents5_1](#contents51)
* [contents5_2](#contents52)
  * [@OverrideとInterface](#overrideとinterface)
    * [Override](#override)
    * [Interface](#interface)
      * [implements](#implements)
  * [コード](#コード)
<!-- TOC -->

# contents5_1
英単語

| 単語     | 意味  |
|--------|-----|
| Circle | 円   |
|Recatangle|長方形|
|Triangle|三角形|
|vertical|縦|
|horizontal|横|
|side|横|
|area|面積|
|volume|体積|

# contents5_2
## @OverrideとInterface

### Override
@Override は、Javaでメソッドをオーバーライドするためのアノテーション（注釈）です。オーバーライドとは、親クラスのメソッドを子クラスで再定義することを指します。

### Interface
Interface（インタフェース）とは、Javaで実装を持たずにメソッドや定数を定義することができる機能のことを指します。クラスがインタフェースを実装する場合、そのクラスはインタフェースで定義されたメソッドをすべてオーバーライド（実装）する必要があります。


#### implements 
Javaにおいて、あるクラスがインタフェースを実装することを示すためのキーワードです。インタフェースとは、クラスが実装すべきメソッドや定数の一覧を定義したものであり、クラスがインタフェースを実装すると、そのクラスはインタフェースで定義されたメソッドをすべて実装しなければなりません。

## コード
```java
//interface
package contents5_2;
public interface VolumeInterface {
    //面積
    double area();
    //体積
    double volume();
}
```

3角形の面積と体積
```java
//interface を　Overrideして実装
package contents5_2;
public class Triangle implements VolumeInterface {
        ...
                
        ...
	@Override
	public double area() {
		return (double)this.vertical * (double)this.side / 2;
	}

	//三角錐
	@Override
	public double volume() {
		return this.area() * this.height;
	}
}
```

長方形(4角形)の面積と体積
```java
public class Rectangle implements VolumeInterface {
        ...
    
        ...
	@Override
	public double area() {
		return (double)this.vertical * (double)this.side;
	}

    //四角錐の計算
	@Override
	public double volume() {
		return this.area() * this.height / 3;
	}
}
```
