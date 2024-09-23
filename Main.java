import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String s1=scanner.nextLine();
        int max_count=0;
        int count=0;
        for(int i=0;i<s1.length();i++){
            count++;
            if(i==s1.length()-1) {
                break;
            }
            if(s1.charAt(i+1)<s1.charAt(i)) {
                max_count = (count > max_count) ? count : max_count;
                count = 0;
            }
        }
        System.out.println("Длина самой длинной возрастающей подпоследовательности: "+max_count);
    }
}