public class SubstringJudge {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] ret=new boolean[p.length];
        for (int i = 0; i < p.length; i++) {
            ret[i]=s.contains(p[i]);
        }
        return ret;
    }
}
