import java.util.HashMap;
import java.util.Map;

public class ClassMap {
    public static void main(String[] args) throws Exception {

        Map<String, Integer> classMember = new HashMap<>();
        //putでMapに要素を追加 put（キー,値）
        classMember.put("田中", 85);
        classMember.put("鈴木", 82);
        classMember.put("佐藤", 94);
        classMember.put("太田", 78);
        classMember.put("石田", 56);
        //keySetMethodを使用してmapの全てのキーを出力
        for (String key : classMember.keySet()) {
            System.out.println(key + "はAクラスです");

        }
        //valuesMethodを使用してmapの全ての値を出力
        for (Integer val : classMember.values()) {
            System.out.println(val);
        }

        try {
            //getMethodを使用、キーに対応する値を取得する。
            //下記にキーを定義。下記で定義したキーがMapに存在しない場合はcatchする。
            Integer tanakaScore = classMember.get("田中");
            Integer suzukiScore = classMember.get("鈴木");
            Integer satouScore = classMember.get("佐藤");
            Integer ootaScore = classMember.get("太田");
            Integer ishidaScore = classMember.get("石田");
            Integer takedaScore = classMember.get("武田");
            //武田の値をgetしようとすると、"武田はメンバー外です"を出力する。武田を消すと総得点を計算する。
            System.out.println("合計得点は" + (tanakaScore + suzukiScore + satouScore + ootaScore + ishidaScore + takedaScore) + "点です。");
        } catch (NullPointerException e) {
            System.out.println("\n");
            System.out.println("武田はメンバー外です");
        }
    }
}
