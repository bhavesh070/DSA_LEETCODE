package PACKAGE_NAME.GFG.LinkedList;

import java.util.Arrays;
import java.util.Stack;

class StockSPAN {
    public int[] calculateSpan(int[] stockPrices) {
        int n = stockPrices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && stockPrices[i] >= stockPrices[stack.peek()]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        StockSPAN calculator = new StockSPAN();
        int[] stockPrices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = calculator.calculateSpan(stockPrices);
        System.out.println("Stock Prices: " + Arrays.toString(stockPrices));
        System.out.println("Stock Spans: " + Arrays.toString(spans));
    }
}