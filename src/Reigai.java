public class Reigai {
    public static void main(String[] args){
        String str = null;

        try {
            System.out.println(str.length());
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
