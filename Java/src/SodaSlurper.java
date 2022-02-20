public class SodaSlurper{
    public static void main(String[] args) {
        calculate(9,0,3);
        calculate(5,5,2);
    }
    public static void calculate(int e, int f, int c) {
        int slurped = 0;
        e = e + f;
        while(e >= c){
            e -= c;
            slurped++;
            e++;
        }
        System.out.println(slurped);
    }
}
