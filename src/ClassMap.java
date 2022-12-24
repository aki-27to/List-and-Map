import java.util.HashMap;
import java.util.Map;

public class ClassMap {
    public static void main(String[] args) throws Exception {

        Map<String, Integer> classMember = new HashMap<>();
        //putでMapに要素を追加 put（キー,値）
        classMember.put("田中", 85);
        classMember.put("鈴木", 82);
        classMember.put("佐藤", 94);
        classMember.put("太田" , 78);
        classMember.put("石田" , 56);
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
            //下記に例外キーを定義。下記以外が選択された場合、catchする。
            Integer tanaka = classMember.get("田中"); //getで対応する値の取得
            Integer suzuki = classMember.get("鈴木");
            Integer satou = classMember.get("佐藤");
            Integer oota = classMember.get("太田");
            Integer ishida = classMember.get("石田");
            Integer takeda = classMember.get("武田");
            //武田の値をgetしようとすると、"武田はメンバー外です"を出力する
            System.out.println("合計得点は" +( tanaka + suzuki + satou + oota + takeda  )+ "点です。");
        } catch (NullPointerException e) {
            System.out.println("\n");
            System.out.println( "武田はメンバー外です");
        }
    }
}
