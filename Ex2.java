import java.util.Scanner;
import java.util.Random;

abstract class Ex {
	abstract void execute();
}

class Ex2_0 extends Ex{
	void execute(){
		double x;
		double y;
    double z;

		x = 63.4;
		y = 18.6;
    z = 12.3;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
    System.out.println("zの値は" + z + "です。");
		System.out.println("合計は" + (x + y + z) + "です。");
		System.out.println("平均は" + (x + y + z) / 3 + "です。");
	}
}

public class Ex2 {
	public static void main(String[] args){
		Ex a;
		a = new Ex2_0();
		a.execute();
	}
}
