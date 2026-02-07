package sec12.inter;

interface Microphone {
  void sing(); // void 앞에 abstract은 생략 가능!
}

interface Speaker {
  void music();
}

// 인터페이스는 다중 구현 가능
class BluetoothMic implements Microphone, Speaker {
  @Override
  public void sing() {
    System.out.println("마이크에 대고 노래를 부릅니다.");
  }

  @Override
  public void music() {
    System.out.println("마이크에 장착된 스피커로 반주가 나옵니다.");
  }
}

public class Ex12_18 {
  public static void main(String[] args) {
    BluetoothMic bm = new BluetoothMic();

    bm.music();
    bm.sing();
    
    // 인터페이스 타입으로 사용 가능
    Microphone m = bm;
    // m.music();
    m.sing();

    Speaker s = bm;
    // s.sing();
    s.music();
  }
}
