package PACKAGE_NAME;

import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {

    public static List<int[]> maxActivities(int[][] arr) {
        int n = arr.length;

        // Sort activities based on finish times
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));

        // The first activity always gets selected
        List<int[]> selectedActivities = new ArrayList<>();
        selectedActivities.add(arr[0]);

        // Consider the rest of the activities
        int i = 1;
        for (int j = 1; j < n; j++) {
            // If the current activity has a start time greater than or equal to the finish
            // time of the previously selected activity, then select it
            if (arr[j][0] >= arr[i - 1][1]) {
                selectedActivities.add(arr[j]);
                i = j + 1;
            }
        }

        return selectedActivities;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of events
        System.out.print("Enter the number of events: ");
        int eventCount = scanner.nextInt();

        // Input the events with start and end times
        int[][] arrInput = new int[eventCount][2];
        for (int i = 0; i < eventCount; i++) {
            System.out.print("Enter start time for event " + (i + 1) + ": ");
            arrInput[i][0] = scanner.nextInt();

            System.out.print("Enter end time for event " + (i + 1) + ": ");
            arrInput[i][1] = scanner.nextInt();
        }

        scanner.close(); // Close the scanner after taking input

        // Find and print the selected activities
        List<int[]> result = maxActivities(arrInput);
        System.out.println("Selected Activities:");
        for (int[] activity : result) {
            System.out.println(activity[0] + " " + activity[1]);
            System.out.println("bhavhesh");
        }
    }
}
