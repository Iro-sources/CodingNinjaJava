public class LoveCalc {
    static int count_true = 0;
    static int count_love = 0;
    public static void loveCalc(String name1, String name2){
       String combinedNames = name1 + name2;

       for (char c : combinedNames.toCharArray()){
           if ("true".indexOf(c) != -1){
               count_true ++;
           }
       }

        for (char c : combinedNames.toCharArray()){
            if ("love".indexOf(c) != -1){
                count_love +=1;
            }
        }

        System.out.println(String.valueOf(count_true) + count_love);
    }

    public static void modifyValue(int num){
        num = num * 2;
    }

    public static void main(String[]args){
        loveCalc("mohamed", "qureysha");
    }
}
