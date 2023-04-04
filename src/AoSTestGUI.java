import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class AoSTestGUI {
  public static void main(String[] args){

    //JFrame
    JFrame frame = new JFrame();
    frame.setTitle("AoS");
    frame.setSize(700,1020);
    frame.setResizable(false);
    frame.setBackground(new Color(72, 204, 205));

    ImageIcon imageIcon = new ImageIcon("icon.png");
    frame.setIconImage(imageIcon.getImage());

    //JPanel
    JPanel picPanel = new JPanel();
    picPanel.setBackground(new Color(72, 204, 205));
    picPanel.setBounds(0, 0, 280, 750);

    JPanel Panel = new JPanel();
    Panel.setBackground(new Color(72, 204, 205));
    Panel.setBounds(280, 0, 420, 750);

    JPanel tPanel = new JPanel();
    //tPanel.setBackground(Color.blue);
    tPanel.setBackground(new Color(72, 204, 205));
    tPanel.setBounds(0, 750, 700, 50);

    JPanel Panel1 = new JPanel();
    //Panel1.setBackground(Color.red);
    Panel1.setBackground(new Color(72, 204, 205));
    Panel1.setBounds(0, 800, 700, 50);

    JPanel Panel2 = new JPanel();
    //Panel2.setBackground(Color.blue);
    Panel2.setBackground(new Color(72, 204, 205));
    Panel2.setBounds(0, 850, 700, 50);

    JPanel Panel3 = new JPanel();
    //Panel3.setBackground(Color.red);
    Panel3.setBackground(new Color(72, 204, 205));
    Panel3.setBounds(0, 900, 700, 90);

    //Ractangle
    //pic
    ImageIcon picR = new ImageIcon("picR.png");
    JLabel lPicR = new JLabel();
    lPicR.setIcon(picR);
    //text
    JLabel labelR = new JLabel(">> RECTANGLE ; W x L <<");
    //InputWidth
    JLabel labelR1 = new JLabel("Input your width:");
    JTextField width = new JTextField(20);
    // InputLength
    JLabel labelR2 = new JLabel("Input your length:");
    JTextField length = new JTextField(20);
    // AreaR
    JLabel resultR = new JLabel("");
    //Button
    JButton buttonR = new JButton("=");
    buttonR.setBounds(850, 400, 600, 550);
    lPicR.setVerticalAlignment(JButton.TOP);
    lPicR.setHorizontalAlignment(JButton.LEFT);
    buttonR.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource()==buttonR) {
             double w =  Double.valueOf(width.getText());
             double l =  Double.valueOf(length.getText());
             double areaR = 0;
             areaR = w * l;
             resultR.setText("The area of this ractangle is " +areaR);
           }
           }});

    //Triangle
    //pic
    ImageIcon picT = new ImageIcon("picT.png");
    JLabel lPicT = new JLabel();
    lPicT.setIcon(picT);
    //text
    JLabel labelB = new JLabel("*******************************************************************************");
    JLabel labelT = new JLabel(">> TRIANGLE ; 1/2 x B x H <<");
    //InputBase
    JLabel labelT1 = new JLabel("Input your base:");
    JTextField base = new JTextField(20);
    // InputHeight
    JLabel labelT2 = new JLabel("Input your height:");
    JTextField height = new JTextField(20);
    // AreaT
    JLabel resultT = new JLabel("");
    //Button
    JButton buttonT = new JButton("=");
    buttonT.setBounds(850, 400, 600, 550);
    lPicT.setVerticalAlignment(JButton.CENTER);
    lPicT.setHorizontalAlignment(JButton.LEFT);
    buttonT.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource()==buttonT) {
             double b =  Double.valueOf(base.getText());
             double h =  Double.valueOf(height.getText());
             double areaT = 0;
             areaT = 0.5 * b * h;
             resultT.setText("The area of this triangle is " +areaT);
           }
           }});

    //Circle
    //pic
    ImageIcon picC = new ImageIcon("picC.png");
    JLabel lPicC = new JLabel();
    lPicC.setIcon(picC);
    //text
    JLabel labelB1 = new JLabel("*******************************************************************************");
    JLabel labelC = new JLabel(">> CIRCLE ; Pi x (r^2) <<");
    // InputRadius
    JLabel labelC1 = new JLabel("Input your radius:");
    JTextField radius = new JTextField(20);
    // AreaC
    JLabel resultC = new JLabel("");
    //Button
    JButton buttonC = new JButton("=");
    buttonC.setBounds(850, 400, 600, 550);
    lPicC.setVerticalAlignment(JButton.BOTTOM);
    lPicC.setHorizontalAlignment(JButton.LEFT);
    buttonC.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource()==buttonC) {
             double r =  Double.valueOf(radius.getText());
             double areaC = 0;
             areaC = 3.14 * r * r;
             resultC.setText("The area of this circle is " +areaC);
           }
           }});

    //UnitOfArea
    JLabel labelB2 = new JLabel("**************************************************************************************************************************************************************");
    JLabel labelU = new JLabel(">> UNIT OF AREA <<");

    //Cm2ToM2
    // InputCm2
    JLabel labelU1 = new JLabel("[+] cm^2   >>   m^2    |    Input:");
    JTextField cm1 = new JTextField(10);
    JLabel labelU2 = new JLabel("cm^2");
    // m2
    JLabel resultM2 = new JLabel("");
    //Button
    JButton buttonM2 = new JButton("=");
    buttonM2.setBounds(850, 400, 600, 550);
    buttonM2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource()==buttonM2) {
             double cm =  Double.valueOf(cm1.getText());
             double M2 = 0;
             M2 = cm/10000;
             resultM2.setText(" " +M2+ " m^2");
           }
           }});

    //Cm2ToIn2
    // InputCm2
    JLabel labelU3 = new JLabel("[+] cm^2   >>   in^2    |    Input:");
    JTextField Cm2 = new JTextField(10);
    JLabel labelU4 = new JLabel("cm^2");
    // In2
    JLabel resultIn2 = new JLabel("");
    //Button
    JButton buttonIn2 = new JButton("=");
    buttonIn2.setBounds(850, 400, 600, 550);
    buttonIn2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource()==buttonIn2) {
             double cm2 =  Double.valueOf(Cm2.getText());
             double In2 = 0;
             In2 = cm2 * 0.15500;
             resultIn2.setText(" " +In2+ " in^2");
           }
           }});
    //In2ToCm2
    // InputIn2
    JLabel labelU5 = new JLabel("[+] in^2   >>   cm^2    |    Input:");
    JTextField in1 = new JTextField(10);
    JLabel labelU6 = new JLabel("in^2");
    // In2
    JLabel resultCm2 = new JLabel("");
    //Button
    JButton buttonCm2 = new JButton("=");
    buttonCm2.setBounds(850, 400, 600, 550);
    buttonCm2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==buttonCm2) {
              double in =  Double.valueOf(in1.getText());
              double Cm = 0;
              Cm = in/0.15500;
              resultCm2.setText(" " +Cm+ " cm^2");
            }
            }});

    picPanel.add(lPicR);
    picPanel.add(lPicT);
    picPanel.add(lPicC);
    picPanel.setLayout(new GridLayout(0, 1));
    picPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 10, 10));

    Panel.add(labelR);
    Panel.add(labelR1);
    Panel.add(width);
    Panel.add(labelR2);
    Panel.add(length);
    Panel.add(buttonR);
    Panel.add(resultR);
    Panel.add(labelB);
    Panel.add(labelT);
    Panel.add(labelT1);
    Panel.add(base);
    Panel.add(labelT2);
    Panel.add(height);
    Panel.add(buttonT);
    Panel.add(resultT);
    Panel.add(labelB1);
    Panel.add(labelC);
    Panel.add(labelC1);
    Panel.add(radius);
    Panel.add(buttonC);
    Panel.add(resultC);
    Panel.setLayout(new GridLayout(0, 1));
    Panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 10, 20));

    tPanel.add(labelB2);
    tPanel.add(labelU);

    Panel1.add(labelU1);
    Panel1.add(cm1);
    Panel1.add(labelU2);
    Panel1.add(buttonM2);
    Panel1.add(resultM2);
    Panel1.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
    Panel1.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 20));

    Panel2.add(labelU3);
    Panel2.add(Cm2);
    Panel2.add(labelU4);
    Panel2.add(buttonIn2);
    Panel2.add(resultIn2);
    Panel2.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
    Panel2.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 20));

    Panel3.add(labelU5);
    Panel3.add(in1);
    Panel3.add(labelU6);
    Panel3.add(buttonCm2);
    Panel3.add(resultCm2);
    Panel3.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
    Panel3.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 20));

    frame.add(picPanel);
    frame.add(Panel);
    frame.add(tPanel);
    frame.add(Panel1);
    frame.add(Panel2);
    frame.add(Panel3);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }
}
