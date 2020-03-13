package 比较;

public class CompareVersion {
    public int compareVersion(String version1, String version2) {

        int i=0;

        int j=0;

        while (i < version1.length() || j < version2.length()){

            int a=0;
            int b=0;

            while(i<version1.length()&&version1.charAt(i) != '.'){
                a = a * 10 + version1.charAt(i++) - '0';
            }

            while(j<version2.length()&&version2.charAt(j) != '.'){

                b = b * 10 + version2.charAt(j++) - '0';

            }

            if(a>b)

                return 1;

            else if(a<b)

                return -1;

            i++;

            j++;

        }



        return 0;

    }
}
