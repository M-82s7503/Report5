public class Reigai {
    public static void main(String[] args){
        String str = "3．14";

        try {
            double value = Double.parseDouble(str);
            System.out.println("value = " + value);
        }catch (NumberFormatException e){
            System.out.println("\nError1");
            System.out.println("〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜");
            System.out.println("\nNumberFormatExceptionが発生しました！");
            System.out.println("\ne.toString()    → " + e.toString());
            System.out.println("\ne.getMessage()  → " + e.getMessage());
            System.out.print("\ne.printStackTrace()\n→ ");
            e.printStackTrace();
            System.out.println("\n〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜\n");

            str = "3.14";
            try {
                double value = Double.parseDouble(str);
                System.out.println("value = " + value);
            }catch (NumberFormatException e1){
                System.out.println("\nError2");
                System.out.println("〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜");
                System.out.println("\nNumberFormatExceptionが発生しました！");
                System.out.println("\ne.toString()    → " + e.toString());
                System.out.println("\ne.getMessage()  → " + e.getMessage());
                System.out.print("\ne.printStackTrace()\n→ ");
                e.printStackTrace();
                System.out.println("\n〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜\n");
            }
        }

        try {
            System.out.println("strの文字数 = " + str.length());
        } catch (NullPointerException e){
            System.out.println("\nError");
            System.out.println("〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜");
            System.out.println("\nぬるぽ(NullPointerException)が発生しました！");
            System.out.println("\ne.toString()    → " + e.toString());
            System.out.println("\ne.getMessage()  → " + e.getMessage());
            System.out.print("\ne.printStackTrace()\n→ ");
            e.printStackTrace();
            System.out.println("\n〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜\n");
        }
    }
}
