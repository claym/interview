package net.claymitchell.neetcode.binarysearch;

public class SearchRange {
    private int answer;
    private int start;
    private int end;

    public SearchRange(int start, int end, int answer) {
        this.start = start;
        this.end = end;
        this.answer = answer;
    }

    public int guess() {
        return guessNumber(end);
    }

    public int guessNumber(int n) {
        int L = 1;
        int R = n;

        while(L<=R) {
            int pivot = L + ((R-L) / 2);
            int response = guess(pivot);
            if(response == -1) {
                R = pivot - 1;
            } else if(response == 1) {
                L = pivot + 1;
            } else {
                return pivot;
            }
        }
        return -1;
    }

    public int guess(int n) {
        if(answer < n) {
            return -1;
        } else if(answer > n) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "SearchRange{" +
                "answer=" + answer +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}



