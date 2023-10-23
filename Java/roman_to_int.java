import java.util.Scanner;

public class roman_to_int {
    public static int getvalue(char charAt){
        switch(charAt){
            case 'I':
            case 'i':
                return 1;
            case 'V':
            case 'v':
                return 5;

            case 'X':
            case 'x':
                return 10;

            case 'L':
            case 'l':
                return 50;

            case 'C':
            case 'c':
                return 100;

            case 'D':
            case 'd':
                return 500;

            case 'M':
            case 'm':
                return 1000;

            default:
                return 0;
        }
    }
    public static int romanToInt(String s) {
        int result = 0;
        int prev = 0;
        int curr = 0;

        for (int i = s.length() - 1; i >= 0; i--)
        {
            // get current and previous character
            curr = getvalue(s.charAt(i));
            if (curr < prev)
            {
                result -= curr;
            }
            else
            {
                result += curr;
            }
            prev = curr;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = romanToInt(str);
        System.out.println(ans);
    }
}
