package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N17863 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(br.readLine());
//        System.out.println(num/5550000==1?"YES":"NO"); // 이게 왜 안돼
        String str = br.readLine();
        int cnt = 0;
        for(int i=0; i<3; i++){
            if(str.charAt(i)=='5') cnt++;
        }
        if(cnt == 3)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}


