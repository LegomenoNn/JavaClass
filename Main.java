import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String []arrayLine = line.split(" ");
        int count=0;
        String newLine = "";
        for(String item:arrayLine) {
              if(item.charAt(0)=='A' || item.charAt(0)=='a'){
                  newLine+='a'+item.substring(1)+' ';
                  count++;
              }
              else{
                  newLine+=item;
              }
        }
        System.out.println(newLine);
        System.out.println("Количество слов, начинающихся на а: "+count);
    }
}