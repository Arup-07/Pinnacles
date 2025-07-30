import java.util.*;
class PasswordAnalyzer{
    static String commonPass[]={"password", "password123", "123456", "qwerty", "letmein", "admin",
        "welcome", "hello", "iloveyou", "abc123", "111111"};
        String analyzePassword(String password)
        {
            int length=password.length();
            int upper=0,lower=0,digit=0,special=0;

            for (char ch : password.toCharArray())
             {
                if (Character.isUpperCase(ch))
                  upper++;
                else if (Character.isLowerCase(ch))
                  lower++;
                else if (Character.isDigit(ch)) 
                    digit++;
                else
                 special++;
             }
            if(length<8 || upper==0 || lower==0 || digit==0 || special==0)
               return "Invalid Password";
            else
            {
                if(length>=12 && upper>=2 && lower>=2 && digit>=2 && special>=2)
                   return "Strong Password";
                else if((length>8 && length<11) || (upper==1 || lower==1) || digit==1 || special==1)
                   return "Weak Password";
                else
                   for(String s:commonPass) 
                      if(password.toLowerCase().equals(s))
                          return "Weak Password";
                return "Moderate Password";
            }

        }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            PasswordAnalyzer ob = new PasswordAnalyzer();
            System.out.println("Enter your password");
            String password = sc.nextLine();
            System.out.println(ob.analyzePassword(password));
        }
    }
}
