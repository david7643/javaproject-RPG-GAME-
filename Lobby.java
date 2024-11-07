package backjun;

import javax.swing.*;
import java.awt.*;

public class Lobby extends JFrame {
    public Lobby() {
        player la = new player();
        Container c = getContentPane();
        c.setLayout(null); // 레이아웃을 null로 설정하여 절대 위치 사용
        setSize(800, 600); // 프레임 크기 설정
        setTitle("RPG게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료 시 프레임 닫기

        // Background 패널 설정
        Background bg = new Background();
        bg.setBounds(0, 0, 800, 600); // 패널 위치와 크기 설정
        c.add(bg);

        // player 라벨 설정
        la.setBounds(400, 300, 100, 100); // 라벨 위치와 크기 설정
        c.add(la);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Lobby();
    }
}

class Background extends JPanel {
    private Image backgroundImage;

    public Background() {
        backgroundImage = new ImageIcon("images/background.jpg").getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}

class player extends JLabel {
    private Image img2;

    public player() {
        img2 = new ImageIcon("images/player.jpeg").getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img2, 0, 0, getWidth(), getHeight(), this);
    }
}
