/**
 * Created by Peonsson on 2015-09-11.
 */
public class Problem_1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int sum = 0;

        for(int i = 0; i < 1000;i++) {
            if(i % 3 == 0)
                sum = sum + i;
            else if(i % 5 == 0)
                sum = sum + i;
        }
        System.out.println(sum);
    }
}
