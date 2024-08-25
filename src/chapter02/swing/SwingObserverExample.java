package chapter02.swing;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("할까 말까?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        // 프레임 속성을 설정합니다.
        JButton button1 = new JButton("할까 말까?");
        button1.addActionListener(event ->
                System.out.println("하지마! 아마 후회할 걸?"));
        button1.addActionListener(event ->
                System.out.println("그냥 저질러 버렷!!!"));
    }
}
