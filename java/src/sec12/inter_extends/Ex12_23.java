package sec12.inter_extends;

interface Microphone {
  void sing();
}

interface Speaker {
  void music();
}

// 인터페이스는 부모 인터페이스 다중 상속 가능
interface BluetoothMic extends Microphone, Speaker {
  void connect();
}

class TJmic implements BluetoothMic {
  @Override
  public void sing() {
    System.out.println("TJ 마이크에 대고 노래를 부릅니다.");
  }

  @Override
  public void music() {
    System.out.println("TJ 마이크에 장착된 스피커로 반주가 나옵니다.");
  }

  @Override
  public void connect() {
    System.out.println("핸드폰과 TJ 마이크가 연결 되었습니다.");
  }

}

public class Ex12_23 {
  public static void main(String[] args) {
    // TJmic tj = new TJmic();
    BluetoothMic tj = new TJmic();
    tj.connect();
    tj.music();
    tj.sing();
  }
}
