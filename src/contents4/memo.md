# ４章メモ
* [カジノ用語](#カジノ用語)
* [Mapの使い方](#mapの使い方)
* [Contents4_3](#contents43)
* [Contents4_4](#contents44)

ルーレットゲームの参考url
url :  https://casino-kingdom.com/roulette-rule/

# カジノ用語or普通の英単語
## ストレートアップ(Straight Up)
ストレートアップ(Straight Up) とは、ルーレットのインサイドベットの一つで、シングルナンバーベットとも呼ばれ、数字一つに賭ける方法です。通常は、ストレートアップにベットを付けて、ストレートアップベットとして使用されます。

おすすめurl：https://x.gd/pVQVZ
## HiGH&LOW
ハイ・ロウはハイの数字（19～36）、ローの数字（1～18）のどちらかに賭ける方法です。

おすすめurl：https://x.gd/cKw1o
## OddとEven
|単語| 意味 |
|---|---|
|odd| 奇数 |
|even| 偶数 |

おすすめurl：
https://x.gd/8Mt5K
# Mapの使い方

JavaのMapは、キーと値のペアの集合を表すデータ構造です。
Mapを使用すると、キーを使用して値にアクセスすることができます。
以下は、Mapを使用する方法の例です。

<!-- TOC -->
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

# Contents4_3
```java
  ...
  // ルーレットナンバー取得
  Integer num_roulette = (int) Math.floor(Math.random() * 37);
  if(num_roulette == 37) {
      // 37は0扱いにする
      num_roulette = 0;
  }

```


このコードは、ルーレットの番号をランダムに生成するためのものです。

1行目では、Math.random()を使用して0以上1未満の乱数を生成しています。この乱数に37を掛け、小数点以下を切り捨てることで、0から36までの整数をランダムに生成しています。

2行目では、生成された整数が37だった場合、ルーレットの番号として扱うために0に変換しています。これは、ルーレットの番号としては0から36までの37個の数字があるためです。

このコードで使用されている特殊な書き方は、(int)を使用して浮動小数点数を整数に変換する方法です。Math.random()が返すのは、0以上1未満の浮動小数点数なので、(int)を使用して整数に変換しています。また、Math.floor()を使用して、小数点以下を切り捨てています。これにより、0から36までの整数がランダムに生成されます。

# Contents4_4
* [OddEventJudgement](#oddeventjudgement)
* [StraightUpJudgement](#straightupjudgement)
## OddEventJudgement
```java
    ...
    private static Integer OddEventJudgement(Integer num_roulette, Map<String, Integer> oddEven){
        Integer result = 0;
        
        if (num_roulette == 0){
            result = 0;
        }else if(num_roulette % 2 == 0){
            if (oddEven.containsKey("Even")){
                result = oddEven.get("Even");
            }
        } else {
            if(oddEven.containsKey("Odd")){
                result = oddEven.get("Odd");
            }
        }
        return result;
    }
```
この関数は、ルーレットの番号が奇数か偶数かを判定し、それに応じて指定されたマップから対応する値を取得して返すものです。

関数の引数として、num_rouletteとoddEvenという2つの変数があります。num_rouletteは、ルーレットの番号を表す整数値で、0から36までの数値を取ります。oddEvenは、キーが"Odd"または"Even"で、それぞれ奇数と偶数に対応する値を保持するマップです。

関数の中身を見てみると、まず変数resultを初期化しています。次に、ルーレットの番号が0の場合は、resultに0を設定します。それ以外の場合は、num_rouletteを2で割った余りが0であるかどうかを判定して、奇数か偶数かを判定します。

もしnum_rouletteが偶数だった場合は、oddEvenマップに"Even"というキーが含まれているかどうかを確認します。もし含まれている場合は、その値をresultに設定します。num_rouletteが奇数だった場合は、同様に"Odd"というキーが含まれているかどうかを確認し、その値をresultに設定します。

最後に、resultを返します。つまり、この関数は、ルーレットの番号が奇数か偶数かを判定し、それに応じて指定されたマップから対応する値を取得して返すものです。

## StraightUpJudgement
```java
	private static Integer StraightUpJudgement(Integer num_roulette, Map<Integer, Integer> straightUp) {
		Integer result = 0;

		if(straightUp.containsKey(num_roulette)) {
			result = straightUp.get(num_roulette);
		}

		return result;
	}
```
この関数は、ルーレットの番号がストレートアップ（単一の数字）に該当するかどうかを判定し、straightUpというマップから対応する値を取得して返すものです。

関数の引数として、num_rouletteとstraightUpという2つの変数があります。num_rouletteは、ルーレットの番号を表す整数値で、0から36までの数値を取ります。straightUpは、キーがルーレットの番号に対応し、その番号に該当するストレートアップの配当倍率を保持するマップです。

関数の中身を見てみると、まず変数resultを初期化しています。次に、引数num_rouletteがstraightUpマップのキーとして存在するかどうかを確認します。もし存在する場合は、そのキーに対応する値をresultに設定します。

最後に、resultを返します。つまり、この関数は、ルーレットの番号がストレートアップに該当するかどうかを判定し、straightUpというマップから対応する値を取得して返すものです。