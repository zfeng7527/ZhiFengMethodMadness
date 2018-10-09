package ZhiFeng;

public class ZhiFengLib {
    public static boolean isPlaindrome(String word){
        String output = "";
        int i = word.length()-1;
        while(i >= 0){
            output += word.substring(i,i+1);
        }
        if(output.equals(word)){
            return true;
        }
        return false;
    }

    public static String dateNew(String date1){
        String mm = date1.substring(0,date1.indexOf("/"));
        date1 = date1.substring(date1.indexOf("/"));
        String dd = date1.substring(0,date1.indexOf("/"));
        date1 = date1.substring(date1.indexOf("/"));
        String yyyy = date1;
        return dd+" - "+mm+" - "+yyyy;
    }

    public static int numsum(int addnum){
        int i = 1;
        int newnum = 0;
        while(i <= addnum){
            newnum = newnum + i;
        }
        return newnum;
    }

    public static boolean isFibonnaci(int Fnum){
        int i = 1;
        while(i < Fnum){
            i = i + i;
        }
        if(i == Fnum){
            return true;
        }
        return false;
    }
}
