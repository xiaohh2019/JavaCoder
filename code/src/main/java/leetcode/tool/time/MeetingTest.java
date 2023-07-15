package leetcode.tool.time;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 灵缘一梦
 */
public class MeetingTest {

    public static void main(String[] args) {
        List<Meeting> meetingList = new ArrayList<Meeting>();
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for (int i = 0; i < n; i++) {
            int start = cin.nextInt();
            int end = cin.nextInt();

            Meeting meeting = new Meeting(i+1,start,end);
            meetingList.add(meeting);
        }
        meetingList.sort(null);
        int curTime = 0;
        for (int i = 0; i < n; i++) {
            Meeting meeting = meetingList.get(i);
            if(meeting.startTime >= curTime){
                System.out.println(meeting.toString());
                curTime = meeting.endTime;
            }
        }

    }
}

class Meeting implements Comparable<Meeting> {
    int Num;
    int startTime;
    int endTime;

    public Meeting(int num, int startTime, int endTime) {
        super();
        Num = num;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "Num=" + Num +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    @Override
    public int compareTo(Meeting o) {
        if(this.endTime > o.endTime ){
            return  1;
        }
        return -1;
    }
}
