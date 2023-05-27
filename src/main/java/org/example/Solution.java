package org.example;

import java.util.Arrays;

public class Solution {
    public String stoneGameIII(int[] stoneValue) {

        int[] scores = {0, 0};
        int sum = 0;
        for (int i = 0; i < stoneValue.length; i++) {
            sum += stoneValue[i];
        }
        scores[0] = dfs(stoneValue, 0, 0);
        scores[1] = sum - scores[0];
        String result = "";
        if (scores[0] == scores[1]) {
            result = "Tie";
        }
        if (scores[0] > scores[1]) {
            result = "Alice";
        }
        if (scores[0] < scores[1]) {
            result = "Bob";
        }
        return result;
    }

    private int dfs(int[] stoneValue, int isAlice, int i) {
        if (i >= stoneValue.length ) return 0;

        int result = Integer.MIN_VALUE;

        if (isAlice == 1) {
            result = Integer.MAX_VALUE;
        }

        int sum = 0;

        int j = i;

        for (; j < i + 3; j++) {
            if (j >= stoneValue.length) {
                break;
            }
            sum = sum + stoneValue[j];

            if (isAlice == 0) {
                result = Math.max(result, sum + dfs(stoneValue, 1 - isAlice, j + 1));
            } else {
                result = Math.min(result, dfs(stoneValue, 1 - isAlice, j + 1));
            }
        }
        return result;
    }
}
