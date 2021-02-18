import java.awt.*;
import java.util.*;

public class Dog {

    private Color color;
    private Integer over, down;
	
	
    public Dog(Color c) {
        color = c;
    } // end of constructor

	
    public void setOver(Integer x) {
        over = x;
    } // end of setOver()
	
    public void setDown(Integer y) {
        down = y;
    } // end of setDown()
        

    public void draw(Graphics g) {

        
      
        
        
        
        
        // Dog comes from PixelJoint.com
        int row, col;
        Color[][] pixel = new Color[33][33];
        for (row = 1; row < 33; row++) 
            for (col = 1; col < 33; col++)
                pixel[row][col] = Color.WHITE; //color;
        
        setPixelValues(pixel);
        
        for (row = 5; row < 32; row++)
            for (col = 2; col < 16; col++) {
                    g.setColor(pixel[row+1][col+1]);
                    g.fillRect(over+col*2, down+row*2, 2, 2);
            }
        for (row = 11; row < 32; row++)
            for (col = 16; col < 20; col++) {
                    g.setColor(pixel[row+1][col+1]);
                    g.fillRect(over+col*2, down+row*2, 2, 2);
            }
        for (row = 16; row < 32; row++)
            for (col = 20; col < 32; col++) {
                    g.setColor(pixel[row+1][col+1]);
                    g.fillRect(over+col*2, down+row*2, 2, 2);
            }
    } // end of draw()

	
    public void setPixelValues(Color[][] p) {
        // WARNING:  This code is ugly -- view it at your own risk!
        
        Color dogDark = new Color(197, 174, 151);
        Color dogLight = new Color(242, 229, 199);
        
        for (int r = 7; r <=11; r++) p[r][4] = Color.BLACK;
        p[7][6] = Color.BLACK; p[8][7] = Color.BLACK;
        p[7][13] = Color.BLACK; p[8][12] = Color.BLACK;
        for (int r = 7; r <=11; r++) p[r][16] = Color.BLACK;
        p[12][17] = Color.BLACK;
        p[13][18] = Color.BLACK;
        p[17][19] = Color.BLACK;
        p[18][20] = Color.BLACK;
        for (int c = 22; c <=25; c++) p[19][c] = Color.BLACK;
        p[20][26] = Color.BLACK;
        p[21][27] = Color.BLACK;
        p[22][27] = Color.BLACK;
        for (int r = 22; r <=27; r++) p[r][28] = Color.BLACK;
        p[28][27] = Color.BLACK;
        p[29][26] = Color.BLACK;
        p[30][24] = Color.BLACK;
        p[31][23] = Color.BLACK;
        for (int c = 17; c <=22; c++) p[32][c] = Color.BLACK;
        p[31][20] = Color.BLACK;
        p[30][20] = Color.BLACK;
        for (int c = 19; c <=21; c++) p[29][c] = Color.BLACK;
        p[28][18] = Color.BLACK;
        p[28][21] = Color.BLACK;
        p[28][22] = Color.BLACK;
        p[31][16] = Color.BLACK;
        p[30][15] = Color.BLACK;
        p[29][14] = Color.BLACK;
        for (int r = 27; r <=29; r++) p[r][13] = Color.BLACK;
        for (int r = 29; r <=31; r++) p[r][12] = Color.BLACK;
        for (int c = 10; c <=11; c++) p[32][c] = Color.BLACK;
        for (int r = 30; r <=31; r++) p[r][9] = Color.BLACK;
        p[29][8] = Color.BLACK;
        for (int c = 7; c <=9; c++) p[28][c] = Color.BLACK;
        p[27][6] = Color.BLACK;
        for (int c = 4; c <=10; c++) p[20][c] = Color.BLACK;
        p[21][4] = Color.BLACK;
        p[21][6] = Color.BLACK;
        p[21][8] = Color.BLACK;
        p[22][8] = Color.BLACK;
        p[21][9] = Color.BLACK;
        for (int c = 9; c <=11; c++) p[19][c] = Color.BLACK;
        for (int c = 11; c <=12; c++) p[17][c] = Color.BLACK;
        for (int c = 11; c <=12; c++) p[18][c] = Color.BLACK;
        for (int c = 4; c <=5; c++) p[14][c] = Color.BLACK;
        for (int c = 10; c <=11; c++) p[14][c] = Color.BLACK;
        p[19][3] = Color.BLACK;
        p[19][5] = Color.BLACK;
        for (int c = 4; c <=6; c++) p[18][c] = Color.BLACK;
        p[17][5] = Color.BLACK;
        for (int c = 27; c <=28; c++) p[18][c] = Color.BLACK;
        for (int c = 30; c <=31; c++) p[17][c] = Color.BLACK;
        p[18][32] = Color.BLACK;
        p[19][31] = Color.BLACK;
        p[20][30] = Color.BLACK;
        p[21][29] = Color.BLACK;
        p[22][7] = Color.BLACK;
        
        for (int r = 22; r <=23; r++) p[r][6] = Color.PINK;
        for (int r = 21; r <=22; r++) p[r][5] = Color.PINK;
        for (int r = 21; r <=22; r++) p[r][7] = Color.PINK;
        
        for (int c = 5; c <=7; c++) p[16][c] = dogLight;
        p[15][6] = dogLight;
        p[17][7] = dogLight;
        for (int c = 8; c <=13; c++) p[34-c][c] = dogLight;
        for (int c = 9; c <=14; c++) p[35-c][c] = dogLight;
        for (int c = 10; c <=15; c++) p[36-c][c] = dogLight;
        p[26][7] = dogLight;
        p[25][6] = dogLight;
        p[24][5] = dogLight;
        
        for (int c = 10; c <=11; c++) p[30][c] = dogDark;
        for (int c = 16; c <=19; c++) p[30][c] = dogDark;
        for (int c = 21; c <=23; c++) p[30][c] = dogDark;
        for (int c = 10; c <=11; c++) p[31][c] = dogDark;
        for (int c = 17; c <=19; c++) p[31][c] = dogDark;
        for (int c = 21; c <=22; c++) p[31][c] = dogDark;
        for (int c = 8; c <=11; c++) p[27][c] = dogDark;
        p[26][6] = dogDark;
        for (int c = 11; c <=12; c++) p[26][c] = dogDark;
        for (int c = 12; c <=13; c++) p[25][c] = dogDark;
        for (int c = 7; c <=8; c++) p[25][c] = dogDark;
        p[24][13] = dogDark;
        for (int c = 8; c <=9; c++) p[24][c] = dogDark;
        p[23][5] = dogDark;
        for (int c = 9; c <=10; c++) p[23][c] = dogDark;
        p[23][14] = dogDark;
        for (int c = 10; c <=11; c++) p[22][c] = dogDark;
        p[22][15] = dogDark;
        for (int c = 11; c <=12; c++) p[21][c] = dogDark;
        
        
        p[17][4] = color.darker();
        p[17][6] = color.darker();
        p[24][4] = color.darker();
        for (int c = 6; c <=7; c++) p[24][c] = color.darker();
        p[23][8] = color.darker();
        p[22][9] = color.darker();
        p[21][10] = color.darker();
        p[20][11] = color.darker();
        p[6][5] = color.darker();
        for (int c = 14; c <=15; c++) p[6][c] = color.darker();
        p[7][15] = color.darker();
        for (int c = 7; c <=11; c++) p[9][c] = color.darker();
        p[10][6] = color.darker();
        for (int c = 8; c <=9; c++) p[10][c] = color.darker();
        p[10][13] = color.darker();
        p[11][5] = color.darker();
        p[11][8] = color.darker();
        p[11][14] = color.darker();
        p[12][16] = color.darker();
        p[13][17] = color.darker();
        p[15][18] = color.darker();
        p[16][18] = color.darker();
        p[18][19] = color.darker();
        p[19][21] = color.darker();
        p[19][26] = color.darker();
        p[18][29] = color.darker();
        p[18][31] = color.darker();
        p[19][30] = color.darker();
        for (int c = 27; c <=29; c++) p[20][c] = color.darker();
        p[21][28] = color.darker();
        p[18][19] = color.darker();
        for (int c = 9; c <=11; c++) p[29][c] = color.darker();
        for (int c = 10; c <=12; c++) p[28][c] = color.darker();
        p[27][12] = color.darker();
        

        p[15][3] = color;
        for (int c = 16; c <27; c++)
            for (int r = 20; r < 28; r++)
                p[r][c] = color;
        for (int r = 8; r <=20; r++) p[r][15] = color;
        for (int r = 23; r <=29; r++) p[r][15] = color;
        for (int r = 7; r <=20; r++) p[r][14] = color;
        for (int r = 24; r <=28; r++) p[r][14] = color;
        for (int r = 8; r <=20; r++) p[r][13] = color;
        p[26][13] = color;
        for (int r = 9; r <=16; r++) p[r][12] = color;
        for (int r = 19; r <=20; r++) p[r][12] = color;
        for (int r = 10; r <=13; r++) p[r][11] = color;
        for (int r = 15; r <=16; r++) p[r][11] = color;
        for (int r = 13; r <=19; r++) p[r][16] = color;
        for (int r = 13; r <=19; r++) p[r][17] = color;
        for (int r = 15; r <=19; r++) p[r][18] = color;
        p[19][19] = color;
        p[19][20] = color;
        p[19][21] = color;
        for (int r = 10; r <=13; r++) p[r][10] = color;
        for (int r = 15; r <=18; r++) p[r][10] = color;
        for (int r = 11; r <=18; r++) p[r][9] = color;
        for (int r = 12; r <=19; r++) p[r][8] = color;
        for (int r = 10; r <=19; r++) p[r][7] = color;
        for (int r = 8; r <=9; r++) p[r][6] = color;
        for (int r = 11; r <=16; r++) p[r][6] = color;
        p[19][6] = color;
        for (int r = 7; r <=13; r++) p[r][5] = color;
        for (int r = 15; r <=16; r++) p[r][5] = color;
        for (int r = 12; r <=13; r++) p[r][4] = color;
        for (int r = 15; r <=17; r++) p[r][4] = color;
        p[19][4] = color;
        for (int r = 13; r <=18; r++) p[r][3] = color;
        for (int c = 27; c <=29; c++) p[19][c] = color;
        p[18][30] = color;
        for (int r = 23; r <=27; r++) p[r][27] = color;
        for (int c = 19; c <=20; c++) p[28][c] = color;
        for (int c = 23; c <=26; c++) p[28][c] = color;
        for (int c = 16; c <=18; c++) p[29][c] = color;
        for (int c = 16; c <=17; c++) p[28][c] = color;
        for (int c = 22; c <=26; c++) p[29][c] = color;
        
    } // end of setPixelValues()
    
} // end of class Dog
