package baseball;

public class Reviw03 {

    public static void main(String[] args) {
        // チームの名前と勝敗の情報のインスタンスを生成
        BaseBallTeam yakult = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam baystars = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam tigers = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam giants = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam carp = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam dragons = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        // チーム成績を表示
        yakult.report();
        baystars.report();
        tigers.report();
        giants.report();
        carp.report();
        dragons.report();

    }

}
