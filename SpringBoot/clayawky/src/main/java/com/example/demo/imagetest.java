package com.example.demo;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
public class imagetest {
    private void setAlpha(String os) {
        try {
            ImageIcon imageIcon = new ImageIcon(os);
            BufferedImage bufferedImage = new BufferedImage(imageIcon.getIconWidth(),imageIcon.getIconHeight()
                    , BufferedImage.TYPE_4BYTE_ABGR);
            Graphics2D g2D = (Graphics2D) bufferedImage.getGraphics();
            g2D.drawImage(imageIcon.getImage(), 0, 0,
                    imageIcon.getImageObserver());
            int alpha = 100;
            for (int j1 = bufferedImage.getMinY(); j1 < bufferedImage.getHeight(); j1++) {
                for (int j2 = bufferedImage.getMinX(); j2 < bufferedImage.getWidth(); j2++) {
                    int pixel = bufferedImage.getRGB(j2, j1);
                    int[]   rgb = new int[3];
                    rgb[0] = (pixel & 0xff0000) >> 16;
                    rgb[1] = (pixel & 0xff00) >> 8;
                    rgb[2] = (pixel & 0xff);
                    System.out.println("i=" + j1 + ",j=" + j2 + ":(" + rgb[0] + ","
                            + rgb[1] + "," + rgb[2] + ")");
                    pixel = ( (alpha + 1) << 24) | (pixel & 0x00ffffff);
                    bufferedImage.setRGB(j2, j1, pixel);
                }
            }
            g2D.drawImage(bufferedImage, 0, 0, imageIcon.getImageObserver());
            ImageIO.write(bufferedImage, "jpg",  new File("/Users/chenyuxi/Pictures/gaga.jpg"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        int x = 0;
        imagetest rc = new imagetest();
        rc.setAlpha("/Users/chenyuxi/Pictures/gaga.png");
        rc.setAlpha("/Users/chenyuxi/Pictures/gaga.png");
    }
}
