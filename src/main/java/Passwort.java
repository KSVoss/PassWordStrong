import java.util.Locale;

public class Passwort {
    static int passwordMinimalLength=8;
    static String [] passwordForbidden={"Passwort","12345678","qwertz",""};
    public static void main(String[] args) {
        boolean t=isMajuskelInPassword("jjHsa");
        System.out.println(t);
         t=isMajuskelInPassword("jj3sa");
        System.out.println(t);

    }
    public  static boolean isPasswordForbidden(String password){
        int i=0;
        while(passwordForbidden[i]!=""){
            if(password.compareTo(passwordForbidden[i])==0){
                return true;
            }
            i++;
        }

        return false;
    }
    public static boolean isPasswordStrong(String password){
        return false;

    }
    public static boolean isMajuskelInPassword(String password){
        return password.compareTo(password.toLowerCase())!=0;
    }

    public  static boolean isMinuskelInPassword(String password){
        return password.compareTo(password.toUpperCase())!=0;

    }
    public static boolean isNumberInPassword(String password)
    {
        for(int i=0;i<10;i++){
            if(password.contains(""+i))return true;
            //System.out.println(""+i+" "+password.contains(""+i));
        }
        return false;
    }
    public static int countPasswordLength(String password){
        return password.length();
    }

    public static boolean isPasswordLongEnough(String password){
        // return password.length()<passwordMinimalLength;
        return false;
    }

    public static boolean isNumberPartOfPassword(String password){
        return false;
    }

    public static boolean isPasswordTooUsual(String password){
        return false;
    }


}
