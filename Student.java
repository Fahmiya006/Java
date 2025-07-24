import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int[][] attendance = new int[5][8]; // 5 days, 8 hours
        float[] dailyPercent = new float[5];
        float weeklyTotal = 0;

        Scanner sc = new Scanner(System.in); // Scanner only once

        for (int day = 0; day < 5; day++) {
            float count = 0;
            System.out.println("Attendance for Day " + (day + 1) + ":");

            for (int hr = 0; hr < 8; hr++) {
                System.out.print("  Hour " + (hr + 1) + " (Enter 1 for Present, 0 for Absent): ");
                attendance[day][hr] = sc.nextInt();

                if (attendance[day][hr] == 1) {
                    count++;
                }
            }

            dailyPercent[day] = (count / 8) * 100;
            System.out.println("→ Day " + (day + 1) + " Attendance: " + dailyPercent[day] + "%\n");
            weeklyTotal += dailyPercent[day];
        }

        float weeklyPercent = weeklyTotal / 5;
        System.out.println("Weekly Attendance: " + weeklyPercent + "%");
    }
}
