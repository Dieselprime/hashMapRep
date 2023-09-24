


public class Main {

    public static void main(String[] args) {
        List list = new List(new Node(1,new Node(2,new Node(3,new Node(4,null)))));
        System.out.println(list.mean(0,null));
        System.out.println(recursiveDouble(5, 0, true));
        String a = "Hello world";
        System.out.println(a.charAt(0));
    }

    public static double recursiveDouble(int n, double result, boolean first){
        if (n == 1) return result;
        if (first){
            result = Math.pow(3*(n-1) + Math.pow(3*n, 0.5), 0.5);
            n--;
        }
        return recursiveDouble(n-1, Math.pow(3*(n-1) + result, 0.5),false);
    }
}
