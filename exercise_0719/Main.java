package exercise.exercise_0719;

/*
计算日期到天数转换
 */
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int y = in.nextInt();
            int m = in.nextInt();
            int d = in.nextInt();
            int[] num = {31,28,31,30,31,30,31,31,30,31,30,31};
            int result = 0;
            for(int i=0; i<m-1; i++){
                result += num[i];
            }
            result += d;
            //判断闰年
            if((y%400==0 ||(y%4==0&&y%100!=0))&&m>2){//闰年
                result++;
            }
            System.out.println(result);
        }
    }
}*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.next();
            String str2 = in.next();
            System.out.println(helper1(str));
            System.out.println(helper2(str2));
        }
    }
    public static String helper1(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0,len=str.length(); i<len; i++){
            char tmp = str.charAt(i);
            if(tmp == 'z'){
                sb.append("A");
            }else if(tmp == 'Z'){
                sb.append("a");
            }else if('a'<=tmp && tmp<'z'){
                sb.append(String.valueOf((char)(tmp-31)));
            }else if('A'<=tmp && tmp<'Z'){
                sb.append(String.valueOf((char)(tmp+33)));
            }else if('0'<=tmp && tmp<='9'){
                sb.append(String.valueOf((tmp-47)%10));
            }else{
                sb.append(String.valueOf(tmp));
            }
        }
        return sb.toString();
    }
    public static String helper2(String str2) {
        StringBuilder sb = new StringBuilder();
        for(int i=0,len=str2.length(); i<len; i++){
            char tmp = str2.charAt(i);
            if(tmp == 'A'){
                sb.append("z");
            }else if(tmp == 'a'){
                sb.append("Z");
            }else if('a'<tmp && tmp<='z'){
                sb.append(String.valueOf((char)(tmp-33)));
            }else if('A'<tmp && tmp<='Z'){
                sb.append(String.valueOf((char)(tmp+31)));
            }else if('0'==tmp){
                sb.append("9");
            }else if('0'<tmp && tmp<='9'){
                sb.append(String.valueOf((char)(tmp-1)));
            }else{
                sb.append(String.valueOf(tmp));
            }
        }
        return sb.toString();
    }
}
//TJm5Jpgv9gokaSPV4xa77ZeT7W08RI7G7DIp77k9Hx8zM9VfrK47qL05VaC6uf8P1p0EMu259D1Oj0P4lFi36MM
//ukN6kQHW0HPLBtqw5YB88aFu8x19sj8h8ejQ88L0iY9An0wGSl58Rm16wBd7VG9q2Q1fnV360e2pK1q5MgJ47nn
//ukN6kQHW0HPLBtqw5YB88aFu8x19sj8h8ejQ88L0iY9An0wGSl58Rm16wBd7VG9q2Q1fnV360e2pK1q5MgJ47nn