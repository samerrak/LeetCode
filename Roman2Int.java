import java.util.*;


public class Roman2Int {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanTable = new HashMap<>();
        romanTable.put('I', 1); romanTable.put('V', 5); romanTable.put('X', 10);
        romanTable.put('L', 50); romanTable.put('C', 100); romanTable.put('D', 500); romanTable.put('M',1000);
        int val = 0;
        for (int i = 0; i < s.length(); i++){
            if (i + 1 < s.length()) {
                if (romanTable.get((s.charAt(i))) < romanTable.get((s.charAt(i+1)))){
                    val += (romanTable.get((s.charAt(i))) - romanTable.get((s.charAt(i+1)))) * -1;
                    i++;  }
                else
                    val += romanTable.get(s.charAt(i)); }
            else
                val += romanTable.get(s.charAt(i)); }
        return val;
    }
    public static void main (String[] args) {
        Roman2Int z = new Roman2Int();
        Scanner scanner = new Scanner(System.in);
        int val = z.romanToInt(scanner.nextLine());
        System.out.println(val);
    }
}
