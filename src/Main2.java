public class Main2 {
    public static void main(String[] args) {
        String a = "dsfgsdfg(dsfgsdfg)dsfgsdfg(sdfg(Sdfg)s)dfg(sdfg)sdfg)dsfg";

        System.out.println(check(a));
    }

    public static boolean check(String a) {
        int i = 0;
        for(char c : a.toCharArray()) {
            if(c == '(') {
                i++;
            }
            if(c == ')') {
                i--;
            }
            if(i < 0) {
                return false;
            }
        }
        return i == 0;
    }
}
