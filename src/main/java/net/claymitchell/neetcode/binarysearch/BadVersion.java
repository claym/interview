package net.claymitchell.neetcode.binarysearch;

public class BadVersion {
    int lastBad;
    int start = 1;
    int end;

    public BadVersion(int end, int lastBad) {
        this.end = end;
        this.lastBad = lastBad;
    }

    public int firstBadVersion() {
        return firstBadVersion(end);
    }
    public int firstBadVersion(int n) {
        int L = 1;
        int R = n;

        while(L<=R) {
            int pivot = L + ((R-L) / 2);
            boolean isBad = isBadVersion(pivot);
            if(isBad) {
                if(L == R)
                    return R;
                R = pivot;
            } else {
                L = pivot+1;
            }
        }
        return -1;
    }

    private boolean isBadVersion(int n) {
        if(n >= lastBad)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "BadVersion{" +
                "lastBad=" + lastBad +
                ", end=" + end +
                '}';
    }
}
