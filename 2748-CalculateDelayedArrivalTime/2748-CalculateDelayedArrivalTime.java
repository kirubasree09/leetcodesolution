// Last updated: 2/6/2026, 2:22:54 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int d=(arrivalTime+delayedTime)%24;
        return d;
    }
}