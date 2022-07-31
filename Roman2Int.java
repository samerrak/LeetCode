import java.util.*;


public class Roman2Int {
    //Alternatively
    //            if (i + 1 < s.length()) {
//                if (romanTable.get((s.charAt(i))) < romanTable.get((s.charAt(i+1)))){
//                    val += (romanTable.get((s.charAt(i))) - romanTable.get((s.charAt(i+1)))) * -1;
//                    i++;  }
//                else
//                    val += romanTable.get(s.charAt(i));
//            }
//            else
//                val += romanTable.get(s.charAt(i));
    
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanTable = new HashMap<>(Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M',1000));
        int val = 0;
        for (int i = 0; i < s.length(); i++){
            try {
                if (romanTable.get((s.charAt(i))) < romanTable.get((s.charAt(i+1)))){
                    val += (romanTable.get((s.charAt(i))) - romanTable.get((s.charAt(i+1)))) * -1;
                    i++;
                }
                else
                    val += romanTable.get(s.charAt(i));


            }
            catch (StringIndexOutOfBoundsException e){
                val += romanTable.get(s.charAt(i));
            }

        }
        return val;
    }
    public static void main (String[] args) {
        // insert
        Roman2Int z = new Roman2Int();
        // test 1: insert in an emptying tree
        TST<Integer> tree = new TST<>();
        tree.insert(1);
        Scanner scanner = new Scanner(System.in);
        int val = z.romanToInt(scanner.nextLine());
        System.out.println(val);
    }
}
