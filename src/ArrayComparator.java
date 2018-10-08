public class ArrayComparator {
    public boolean compare(int[][] tab1, int[][] tab2) {
        if (tab1 == null && tab2 != null || tab1 != null && tab2 == null)
            return false;
        if (tab1 == null && tab2 == null)
            return true;
        if (tab1.length != tab2.length)
            return false;
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i].length != tab2[i].length)
                return false;
            for (int j = 0; j < tab1[i].length; j++) {
                if (tab1[i][j] != tab2[i][j])
                    return false;
            }
        }
        return true;
    }
}