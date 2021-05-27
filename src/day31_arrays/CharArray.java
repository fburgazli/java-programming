package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j','a','v','a',' ','i','s',' ','f','u','n'};
        for (char each:letters){
            System.out.print(each+" ");
        }
        System.out.println();
        String sentence = new String(letters);
        System.out.println(sentence);

        String item ="wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println(itemArray.length);
        System.out.println(item.length());

        String[] fruits ={"banana","apples","kiwi","mango","papaya","strawberry"};
        System.out.println("*****Print with for loop*******");
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i]+"-");
        }
        System.out.println();
        String fruitStr ="";
        System.out.println("*****Print with for each loop*******");
        for (String each:fruits){
            fruitStr+= each+"-";
            System.out.print(each+"-");
        }
        System.out.println("*****Print by assigning to String*******");
        System.out.println(fruitStr);

        String[] languages ={"java","python","C++","SQL","ruby","javascript"};
        System.out.println(String.join("|",languages));
        System.out.println(String.join("##",languages));
        String joinedLanguages = String.join(" <> ",languages);
        System.out.println("joinedLanguages = " + joinedLanguages);
    }
}
