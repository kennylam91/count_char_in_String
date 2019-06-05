public class count_char_in_String {
    public static void main(String[] args) {
        String string="Vietnamtt  ";
        System.out.println(countCharinString(string,' '));

    }
    public static int countCharinString(String stringInput,char charInput){
        int count=0;
        for(int i=0;i<stringInput.length();i++){
            if(stringInput.charAt(i)==charInput) count++;
        }
        return count;
    }
}
