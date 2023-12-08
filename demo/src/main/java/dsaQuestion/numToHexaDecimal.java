package dsaQuestion;

public class numToHexaDecimal {
      static String convertNum(int num) {
          String hexCode="0123456789abcdef";
          String ans = "";
          long rem=0;
          long n=num;
          if(num<0){
              n=(long) Math.pow(2,32)+n;
          }
          else if(n==0){
              return "0";
          }

        while (n!=0){
            if(n==0){
               return "0";
            }
rem =n%16;
ans=hexCode.charAt((int)rem)+ans;
n=n/16;
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String args[]){
        int number=0;
      convertNum(number);
    }
}
