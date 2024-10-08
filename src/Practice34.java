/* [参照型]の暗黙の型変換・キャストによる型変換 */

abstract class Super {
    int x; int y;
    public abstract void print();
    public void setNum(int x, int y) {
        this.x = x; this.y = y;
    }
}

class Sub extends Super {
    public void print() {
        System.out.println("xの値は：" + x + " " + "yの値は：" + y );
    }

    public void printS() {
        System.out.println("このメソッドはSub独自のメソッドです");
    }
}

public class Practice34 {
    public static void main(String[] args) {
        Super objA = new Sub();    // 暗黙の型変換
        objA.setNum(10, 20);
        objA.print();

        // objA.printS();    このままだとsuperにないメソッドを呼び出そうとしている為コンパイルエラーが出る
        Sub objB = (Sub)objA;    // キャストによる型変換で元の型に戻す
        objB.printS();    // 上記のキャストをしたことでSub独自のメソッドも呼び出せる
    }
}
