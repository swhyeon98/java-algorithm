package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N21591 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w1 = Integer.parseInt(st.nextToken());
        int h1 = Integer.parseInt(st.nextToken());
        int w2 = Integer.parseInt(st.nextToken());
        int h2 = Integer.parseInt(st.nextToken());

        System.out.println(w1-w2>1&&h1-h2>1 ? 1 : 0);

    }
}
