# Mapの使い方

JavaのMapは、キーと値のペアの集合を表すデータ構造です。
Mapを使用すると、キーを使用して値にアクセスすることができます。
以下は、Mapを使用する方法の例です。

<!-- TOC -->
* [Mapの使い方](#mapの使い方)
  * [Mapの宣言と初期化](#mapの宣言と初期化)
  * [putメソッドを使ってキーと値を追加する](#putメソッドを使ってキーと値を追加する)
  * [getメソッドを使って値を取得する](#getメソッドを使って値を取得する)
  * [putAllメソッドを使って別のMapを追加する](#putallメソッドを使って別のmapを追加する)
<!-- TOC -->

## Mapの宣言と初期化
```java
Map<String, Integer> myMap = new HashMap<>();
```
この例では、String型のキーとInteger型の値を持つHashMapを作成しています。HashMapは、Mapの一種であり、Javaの標準ライブラリに含まれています。HashMapは、キーと値のペアを格納する順序が保証されていないMapです。もしくは、TreeMapを使用することで、キーの自然順序でソートされるMapを作成することもできます。

## putメソッドを使ってキーと値を追加する

```java
myMap.put("apple", 1);
myMap.put("banana", 2);
```
この例では、"apple"というキーに対して値1を、
"banana"というキーに対して値2を設定しています。
Mapのputメソッドを使用すると、指定したキーと値のペアがMapに追加されます。
もし、同じキーを使用して別の値を設定した場合は、古い値は置き換えられます。

## getメソッドを使って値を取得する
```java
Integer appleValue = myMap.get("apple");
System.out.println(appleValue);
```
この例では、"apple"というキーに対応する値を取得しています。Mapのgetメソッドを使用すると、指定したキーに対応する値を取得することができます。もし、指定したキーが存在しない場合は、nullが返されます。

## putAllメソッドを使って別のMapを追加する
```java
Map<String, Integer> anotherMap = new HashMap<>();
anotherMap.put("cherry", 3);
anotherMap.put("durian", 4);
myMap.putAll(anotherMap);
```
この例では、別のMapであるanotherMapを、
putAllメソッドを使ってmyMapに追加しています。
putAllメソッドを使用すると、指定したMapのキーと値のペアが、
対象のMapに追加されます。

以上が、JavaのMapを使用する方法の例です。はnullを返します