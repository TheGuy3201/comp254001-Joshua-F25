package exercise3;

public class FindFiles {
    public static String find(java.io.File path, String filename) {
        String s = "";

        if (path.isDirectory()) {
            java.io.File[] children = path.listFiles();
            if (children != null) {
                for (java.io.File child : children) {
                    // accumulate results from recursive calls; each match will include a newline
                    s += find(child, filename);
                }
            }
        } else {
            if (path.getName().equals(filename)) {
                s += path.getPath() + "\n";
            }
        }
        return s;
    }
}