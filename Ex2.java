import java.util.Scanner;
import java.util.Random;

abstract class Ex {
  abstract void execute();
}


class Ex2_0 extends Ex{
  void execute(){
    int x;
    int y;

    x = 63;
    y = 12;

    System.out.println("xの値は" + x + "です。");
    System.out.println("yの値は" + y + "です。");
    System.out.println("合計は" + (x + y ) + "です。");
    System.out.println("平均は" + (x + y ) / 2 + "です。");
  }
}
class Ex2_1 extends Ex{
  void execute(){
    double x;
    double y;

    x = 63;
    y = 18;

    System.out.println("xの値は" + x + "です。");
    System.out.println("yの値は" + y + "です。");
    System.out.println("合計は" + (x + y ) + "です。");
    System.out.println("平均は" + (x + y ) / 2 + "です。");
  }
}

class Ex2_2 extends Ex{
  void execute(){
    int x;
    int y;
    int z;

    x = 63;
    y = 12;
    z = 120;
    System.out.println("xの値は" + x + "です。");
    System.out.println("yの値は" + y + "です。");
    System.out.println("zの値は" + z + "です。");
    System.out.println("合計は" + (x + y + z) + "です。");
    System.out.println("平均は" + (x + y  +z) / 3 + "です。");
  }
}
class Ex2_00 extends Ex{
  void execute(){
    Scanner stdIn = new Scanner(System.in);

    System.out.println("xとyを加減乗算します。");

    System.out.println("xの値:");
    int x = stdIn.nextInt();

    System.out.println("yの値:");
    int y = stdIn.nextInt();

    System.out.println("x + x = " + (x + y)); // x + yの値を表示
    System.out.println("x - x = " + (x - y)); // x - yの値を表示
    System.out.println("x * x = " + (x * y)); // x * yの値を表示
    System.out.println("x / x = " + (x / y)); // x / yの値を表示 
    System.out.println("x % x = " + (x % y)); // x % yの値を表示 
  }
}
class Ex2_3 extends Ex{
  void execute(){
    Scanner stdIn = new Scanner(System.in);

    System.out.println("数字を入力してください。");

    System.out.println("xの値:");
    int x = stdIn.nextInt();

    System.out.println("yの値:");
    int y = stdIn.nextInt();

    System.out.println("ｘは" + x + "yは" + y);

  }
}
class Ex2_4 extends Ex{
  void execute(){
    Scanner stdIn = new Scanner(System.in);

    System.out.println("xとyを足し算します");

    System.out.println("xの値:");
    int x = stdIn.nextInt();

    System.out.println("yの値:");
    int y = stdIn.nextInt();

    System.out.println((x + 10) + (y + 10));
  }
}
class Ex2_5 extends Ex{
  void execute(){
    Scanner stdIn = new Scanner(System.in);

    System.out.println("xの値:");
    double x = stdIn.nextDouble();

    System.out.println("yの道:");
    double y = stdIn.nextDouble();

    System.out.println("和" +  (x + y) + "平均" + (x + y)/2);
  }
}
class Ex2_6 extends Ex{
  void execute(){
    Scanner stdIn = new Scanner(System.in);

    System.out.println("底辺の値:");
    double x = stdIn.nextDouble();

    System.out.println("高さの値:");
    double y = stdIn.nextDouble();

    System.out.println("三角形の面積は" + (x * y)/2 + "です。");
  }
}
class Ex2_000 extends Ex{
  void execute(){
    Random rand = new Random();
    int lucky = rand.nextInt(10);

    System.out.println("今日のラッキーナンバーは" + lucky + "です。");
  }
}

class Ex2_7 extends Ex{
  void execute(){
    Random rand = new Random();

    int num = rand.nextInt(9)+1;
    System.out.println("正の数は"+ num);

    int num2 = rand.nextInt(9)-9;
    System.out.println("負の数は"+ num2);

    int num3 = rand.nextInt(90)+10;
    System.out.println("正の整数は"+ num3);
  }
}
class Ex2_8 extends Ex{
  void execute(){
    Random rand = new Random();
    int aaa = rand.nextInt(11);
    aaa = aaa -5;

    Scanner stdIn = new Scanner(System.in);
    System.out.println("整数値:");
    int bbb = stdIn.nextInt();

    bbb = bbb + aaa;
    System.out.println("±５した結果は" + bbb + "です。");
  }
}
class Ex2_9 extends Ex{
  void execute(){
  Random rand = new Random();
 

  double x = rand.nextDouble();
  System.out.println("0.0以上1.0未満" + x);
  
  double y = rand.nextDouble()*10.0;
  System.out.println("1.0以上10.0未満" + y);

  double z = rand.nextDouble()*2.0-1.0;
  System.out.println("-1.0以上1.0未満" + z);
  }
}
class Ex2_10 extends Ex{;
  void execute(){
   Scanner stdIn = new Scanner(System.in);
   System.out.println("姓:");
   String sei = stdIn.next();
   System.out.println("名:");
   String mei = stdIn.next();
   System.out.println("こんにちは" + sei + mei + "さん。");
  }
}
public class Ex2 {
  public static void main(String[] args){
    Ex a;
    //a = new Ex2_0();
    //a.execute();
    //a = new Ex2_1();
    //a.execute();
    //a = new Ex2_2();
    //a.execute();
    //a = new Ex2_00();
    //a.execute();
    //a = new Ex2_3();
    //a.execute();
    //a = new Ex2_4();
    //a.execute();
    //a = new Ex2_5();
    //a.execute();
    //a = new Ex2_6();
    //a.execute();
    a = new Ex2_000();
    a.execute();
    a = new Ex2_7();
    a.execute();
    a = new Ex2_8();
    a.execute();
    a = new Ex2_9();
    a.execute();
    a = new Ex2_10();
    a.execute();
  }
}
