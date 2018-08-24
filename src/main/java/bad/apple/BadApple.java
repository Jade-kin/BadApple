package bad.apple;

import javax.swing.*;
import java.io.*;
import java.net.URL;

public class BadApple {

    public BadApple() {

        JFrame ck = new JFrame();
        JFrame ck1 = new JFrame();
        ck.setBounds(0, 80, 505, 515);
        ck.setResizable(false);// 不可改变大小
        ck.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 关闭方式
        ck.setTitle("badapple_by_jack");
        ck1.setBounds(505, 80, 505, 515);
        ck1.setResizable(false);// 不可改变大小
        ck1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 关闭方式
        ck1.setTitle("badapple_by_jack");
        ck.setUndecorated(true);
        ck1.setUndecorated(true);
        JTextArea are = new JTextArea();
        JTextArea are1 = new JTextArea();
        ck.add(are);
        ck1.add(are1);

        are.setBounds(0, 0, 505, 515);
        are.setFont(new java.awt.Font("宋体", 2, 12));
        are1.setBounds(0, 0, 505, 515);
        are1.setFont(new java.awt.Font("宋体", 2, 12));

        InputStream is2 = BadApple.class.getClassLoader().getResourceAsStream("badapple2.txt");
        InputStream is6  = BadApple.class.getClassLoader().getResourceAsStream("badapple6.txt");

        ck.setVisible(true);
        ck1.setVisible(true);

        Music music = new Music();
        music.start();

        try {
            InputStreamReader isr = new InputStreamReader(is2);
            InputStreamReader isr1 = new InputStreamReader(is6);

            BufferedReader br = new BufferedReader(isr);// 缓存阅读
            StringBuffer sb = new StringBuffer();

            BufferedReader br1 = new BufferedReader(isr1);// 缓存阅读
            StringBuffer sb1 = new StringBuffer();
            try {
                int b = 0;
                int a = 0;
                while (b < 230000) {
                    b++;
                    a++;

                    String str = br.readLine();
                    sb.append(str + "\n");
                    String str2 = br1.readLine();
                    sb1.append(str2 + "\n");
                    if (a % 35 == 0) {

                        try {
                            String str1 = sb.toString();
                            sb = new StringBuffer("");
                            String str3 = sb1.toString();
                            sb1 = new StringBuffer("");
                            are.setText(str1);
                            are1.setText(str3);
                            Thread.sleep((long) 30);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    } else if (a > 229880) {
                        are.setText("");
                        are.append("byJACK");
                    }
                }
                isr.close();
                br.close();

            } catch (IOException e) {

                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
