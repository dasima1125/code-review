public class Function2 {
    public static void main(String[] args) {
        work(1, 2);     

        System.out.println(circlearea(10) * 2);
        System.out.println(circlearea(5) / 2);

    }
    static void work(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static float circlearea(int r)
    {
        float output =(int)(r*r*3.14);

        return output;
    }
    
}
