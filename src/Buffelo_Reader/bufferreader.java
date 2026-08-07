import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bufferreader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt("12");
        System.out.println(n);
        br.close();
    }
}
