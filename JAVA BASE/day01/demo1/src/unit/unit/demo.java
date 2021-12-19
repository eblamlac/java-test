package unit;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        TanChiShe game = new TanChiShe(30, 50, 5);
        game.play();
    }
}

class TanChiShe {
    int[][] index;
    int Slength = 3;
    int headPx = 0, headPy = 0;
    int mDirection = 4;
    int score = 0;

    boolean alive = true;

    TanChiShe(int gridX, int gridY) {
        this.initGrid(gridX, gridY);
    }

    TanChiShe(int gridX, int gridY, int slength) {
        this.initGrid(gridX, gridY);
        this.Slength = slength;
    }

    public void initGrid(int gridX, int gridY) {
        this.index = new int[gridX][gridY];
        for (int i = 0; i < this.index.length; i++) {
            Arrays.fill(this.index[i], 0);
        }
    }

    public void move() {
        for (int i = 0; i < this.index.length; i++) {
            for (int j = 0; j < this.index[0].length; j++) {
                this.index[i][j] = this.index[i][j] <= 0 ? this.index[i][j] : this.index[i][j] - 1;
            }
        }
        switch (this.mDirection) {
            case 1:
                this.headPy--;
                break;
            case 2:
                this.headPy++;
                break;
            case 3:
                this.headPx--;
                break;
            case 4:
                this.headPx++;
                break;
        }
        this.headPx = this.headPx > this.index[0].length - 1 ? 0 : this.headPx;
        this.headPx = this.headPx < 0 ? this.index[0].length - 1 : this.headPx;
        this.headPy = this.headPy > this.index.length - 1 ? 0 : this.headPy;
        this.headPy = this.headPy < 0 ? this.index.length - 1 : this.headPy;

        switch (this.index[this.headPy][this.headPx]) {
            case 0:
                this.index[this.headPy][this.headPx] = this.Slength;
                break;
            case -1:
                // snake++
                this.Slength++;
                for (int i = 0; i < this.index.length; i++) {
                    for (int j = 0; j < this.index[0].length; j++) {
                        this.index[i][j] = this.index[i][j] > 0 ? this.index[i][j] + 1 : this.index[i][j];
                    }
                }
                this.index[this.headPy][this.headPx] = this.Slength;
                // draw reward
                int randomX, randomY;
                do {
                    randomX = (int) (Math.random() * this.index[0].length);
                    randomY = (int) (Math.random() * this.index.length);
                } while (this.index[randomY][randomX] != 0);
                this.index[randomY][randomX] = -1;

                break;
            default:
                // dead
                this.alive = false;
                break;
        }
    }

    public void show() {
        String pv = "";
        for (int i = 0; i < this.index.length; i++) {
            for (int j = 0; j < this.index[0].length; j++) {
                String body = "";
                switch (this.index[i][j]) {
                    case 0:
                        body = " - ";
                        break;
                    case -1:
                        body = " ◉ ";
                        break;
                    default:
                        body = i == this.headPy && j == this.headPx ? " ⊛ " : " ⊖ ";
                }
                pv = pv + body;
            }
            pv = pv + "\n";
        }
        System.out.println(pv);
    }

    public void play() {
        // draw sanke
        for (int i = 0; i < this.Slength; i++) {
            this.index[0][i] = i + 1;
        }
        this.headPx = this.Slength - 1;

        // draw reward
        int randomX, randomY;
        for (int i = 0; i < 16; i++) {
            do {
                randomX = (int) (Math.random() * this.index[0].length);
                randomY = (int) (Math.random() * this.index.length);
            } while (this.index[randomY][randomX] != 0);
            this.index[randomY][randomX] = -1;
        }

        Scanner zack_input = new Scanner(System.in);
        do {
            System.out.println("--------------------------");
            this.show();
            switch (zack_input.nextLine()) {
                case "w":
                    this.mDirection = 1;
                    break;
                case "s":
                    this.mDirection = 2;
                    break;
                case "a":
                    this.mDirection = 3;
                    break;
                case "d":
                    this.mDirection = 4;
                    break;
            }
            this.move();
        } while (this.alive);
        System.out.printf(
                "!! GAME OVER !!!! GAME OVER !!!! GAME OVER !!!! GAME OVER !!!! GAME OVER !!!! GAME OVER !!!! GAME OVER !!!! GAME OVER !!!! GAME OVER !!\n\nFinal score : %s",
                this.score);
        zack_input.close();
    }

}