import java.util.*;
public class TelephoneNumber{
    public static void main(String[] args){
        String symbol="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number="222333444555666777788899991234567890";
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            ArrayList<String> arrayList=new ArrayList<String>();
            for(int i=0;i<n;i++){
                String str=scanner.next();
                str=str.replace("-","");
                String result="";
                for(int j=0;j<7;j++){
                    result+=number.charAt(symbol.indexOf(str.charAt(j)+""));
                }
                result=result.substring(0,3)+"-"+result.substring(3,7);
                if(!arrayList.contains(result))
                    arrayList.add(result);
            }
            Collections.sort(arrayList);
            for(int j=0;j<arrayList.size();j++){
                System.out.println(arrayList.get(j));
            }
            System.out.println();
        }
    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        String symbol="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
//        String number="222333444555666777788899991234567890";
//        while(sc.hasNext()){
//            int n=sc.nextInt();
//            String[] str=new String[n];
//            for(int i=0;i<n;i++){
//                str[i]=sc.nextLine();
//
//            }
//
//            ArrayList<String> arrayList=new ArrayList<String>();
//
//            for(int i=0;i<n;i++){
//                String result="";
//                str[i]=str[i].replace("-","");
//                for(int j=0;j<7;j++){
//                    result+=number.charAt(symbol.indexOf(str[i].charAt(j)+""));
//                }
//                result=result.substring(0,3)+"-"+result.substring(3,7);
//                if(!arrayList.contains(result))
//                    arrayList.add(result);
//            }
//            Collections.sort(arrayList);
//            for(int j=0;j<arrayList.size();j++){
//                System.out.println(arrayList.get(j));
//            }
//            System.out.println();
//
//        }
 //   }
}
