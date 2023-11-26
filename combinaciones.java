public class combinaciones {
    public static void main(String[] args) {
        byte inicial=0;
        for (int i = 10; i < 998; i++) {
            if (i<100) {
                System.out.println(inicial+""+i);
            } else {
                System.out.println(i);
            }
            
        }
    }
}
