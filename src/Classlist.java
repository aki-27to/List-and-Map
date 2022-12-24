import java.util.ArrayList;
import java.util.Arrays;

public class Classlist {
    public static void main(String[] args) {

        ArrayList<Aclass> aclasses = new ArrayList<>();
        aclasses.add(new Aclass("田中",19,85));
        aclasses.add(new Aclass("鈴⽊",24,82));
        aclasses.add(new Aclass("佐藤",22,94));

        aclasses.addAll(Arrays.asList(new Aclass("太田",27,78),
                                      new Aclass("石田",16,56)));

        for (int i = 0; i < aclasses.size(); i++) {
            System.out.println((aclasses.get(i).getName() + "の得点は" + aclasses.get(i).getScore() + "点です。"));
        }

        System.out.println("\n");
        //try-catch文
        try {
            for (int i =  0 ; i <= aclasses.size(); i++) {
                System.out.println((aclasses.get(i).getName() + "の得点は" + aclasses.get(i).getScore() + "点です。"));
            }
        }catch (IndexOutOfBoundsException e) {//リストの範囲を超えた指示がされた際の例外クラス
            System.out.println("リストの範囲を超えた指定です。");
        }
    }
}