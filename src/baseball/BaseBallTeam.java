package baseball;

public class BaseBallTeam {
    // フィールド
    private String name; // チーム名
    private int win;     // 勝利数
    private int lose;    // 敗北数
    private int draw;    // 引分数
    private double winningRate; // 勝率

    //　引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
        setRate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public double getRate() {
        return winningRate;
    }

    public void setRate() {
        // 勝率 = 勝ち数 / (勝ち数 + 負け数)　の計算をするメソッド
        if (this.win + this.lose == 0.0) {
            this.winningRate = 0.0;
        } else {
            this.winningRate = (double)this.win / (this.win + this.lose);
        }
    }

    // チームの成績を表示するメソッド
    public void report() {
        System.out.println(name + " の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は " + winningRate + "です。");


    }
}
