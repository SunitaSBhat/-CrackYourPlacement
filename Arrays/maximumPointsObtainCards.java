class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;
        
        // Calculate the total sum of all card points
        for (int point : cardPoints) {
            totalSum += point;
        }

        // If k is equal to the length of the array, return the total sum
        if (k == n) {
            return totalSum;
        }

        // Find the minimum sum of 'n - k' consecutive cards
        int windowSize = n - k;
        int currentWindowSum = 0;

        // Initial window sum of the first 'n - k' elements
        for (int i = 0; i < windowSize; i++) {
            currentWindowSum += cardPoints[i];
        }

        int minWindowSum = currentWindowSum;

        // Slide the window from the start to the end of the array
        for (int i = windowSize; i < n; i++) {
            currentWindowSum += cardPoints[i] - cardPoints[i - windowSize];
            minWindowSum = Math.min(minWindowSum, currentWindowSum);
        }

        // The maximum score is the total sum minus the minimum window sum
        return totalSum - minWindowSum;
    }
}
