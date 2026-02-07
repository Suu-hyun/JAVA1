package sec13.anonymous;

interface ButtonClickListener {
  void click();
}

public class ButtonMain {

  class Button {
    private ButtonClickListener listener;

    void setButtonListener(ButtonClickListener listener) {
      this.listener = listener;
    }

    void click() {
      this.listener.click();
    }
  }

  public static void main(String[] args) {
    ButtonMain bm = new ButtonMain();
    ButtonMain.Button button = bm.new Button();

    // ButtonClickListener listener = new ButtonClickListener() {
    //   @Override
    //   public void click() {
    //     System.out.println("버튼을 눌렀습니다.");
    //   }
    // };

    // button.setButtonListener(listener);

    button.setButtonListener(new ButtonClickListener() {
      @Override
      public void click() {
        System.out.println("버튼을 눌렀습니다.");
      }
    });
    
    button.click();
  }
}
