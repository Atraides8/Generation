package EstudioPersonal;

public class FakeBynary {
    public static String fakeBin(String numberString) {
        String res = "";
        
        for(int i = 0; i < numberString.length(); i++){
          if(numberString.charAt(i) < '5'){
            res += "0";
          }
          else if(numberString.charAt(i) >= '5'){
            res += "1";
          }
          
        }
        
          return res;
      }
  }
