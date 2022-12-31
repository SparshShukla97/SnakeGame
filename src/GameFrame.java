import javax.swing.JFrame;

public class GameFrame extends JFrame {

 GameFrame(){
    this.add(new GamePanel());
    this.setTitle("Snake Game(SPARSH SHUKLA)");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);         // resizing the window
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);

}
}
