    package general;
    import javax.swing.*;
    import java.awt.Font;
    import java.awt.Color;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

    public class AboutPage extends JFrame implements ActionListener {


        JPanel aboutUS = new JPanel();
        JLabel aboutUSLabel = new JLabel("ABOUT US");
        JButton goBack = new JButton();
        JLabel aboutLabel = new JLabel();

        public AboutPage() {
            setTitle("AboutPage");
            setLayout(null);


            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(1200, 800);
            setLocationRelativeTo(null);

            aboutUS.setBounds(0,0 , 1200,100);
            aboutUS.setOpaque(true);
            aboutUS.setVisible(true);
            aboutUS.setBackground(new Color(0, 0, 139));
            add(aboutUS);

            aboutUSLabel.setFont(new Font("Arial", Font.BOLD, 40));
            aboutUSLabel.setForeground(Color.WHITE);
            aboutUSLabel.setHorizontalAlignment(JLabel.CENTER);
            aboutUSLabel.setVerticalAlignment(JLabel.CENTER);
            aboutUSLabel.setBounds(0, 0, 1200, 100);
            aboutUS.add(aboutUSLabel);


            aboutLabel.setText("<html><div style='text-align: center; width: 800px;'>" +
                            "<p>The CLSU Athlete Monitoring System is a simple and secure platform designed to store and manage the personal information of student athletes at Central Luzon State University.</p>" +
                            "<p></p>" +
                            "<p>This system allows athletes to record and update basic details such as their name, sport, course, and other relevant profile information. By keeping athlete records organized in one database, the university can maintain accurate and easily accessible information when needed.</p>" +
                            "<p></p>" +
                            "<p>The CLSU Athlete Monitoring System is focused purely on information storage — no performance tracking, attendance monitoring, or evaluation features are included. Our goal is simply to provide a clean and reliable way to keep athlete data safe and well-organized.</p>" +
                            "<p></p>" +
                            "<p>A straightforward system for secure athlete information management</p>" +
                            "</div></html>");

            aboutLabel.setHorizontalAlignment(JLabel.CENTER);
            aboutLabel.setFont(new Font("Arial", Font.PLAIN, 30));
            aboutLabel.setHorizontalTextPosition(JLabel.CENTER);
            aboutLabel.setVerticalTextPosition(JLabel.CENTER);
            aboutLabel.setBounds(50,50, 1200, 700);
            aboutLabel.setOpaque(true);
            add(aboutLabel);

            goBack.setBounds(0,680 , 1200,90);
            goBack.setBackground(new Color(0, 0, 139));
            goBack.setForeground(Color.WHITE);
            goBack.setRolloverEnabled(false);
            goBack.setFocusPainted(false);
            goBack.setText("Go to MainPage");
            goBack.addActionListener(this);
            add(goBack);
        }


        public static void main(String[] args) {
            AboutPage aboutPage = new AboutPage();
            aboutPage.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Object source =e.getSource();

            if(source ==goBack){
                Frame frame = new Frame();
                frame.setVisible(true);

                dispose();
            }
        }
    }