public class SumAverage {

  private static int minBound = Integer.MAX_VALUE;
  private static int maxBound = Integer.MIN_VALUE;

  private static void setBounds(int firstBound, int secondBound) {
    if (firstBound < secondBound) {
      minBound = firstBound;
      maxBound = secondBound;
    } else {
      minBound = secondBound;
      maxBound = firstBound;
    }
  }

  private static void setBounds(int[] numbers) {
    minBound = numbers[0];
    maxBound = numbers[0];

    for (int number : numbers) {
      if (minBound > number) {
        minBound = number;
      }
      if (maxBound < number) {
        maxBound = number;
      }
    }
  }

  public static int sum(int lowerBound, int upperBound) {
    setBounds(lowerBound, upperBound);
    int sum = 0;
    for (int i = minBound; i <= maxBound; i++){
      sum += i;
    }
    return sum;
  }

  public static int sum(int[] numbers) {
    setBounds(numbers);
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }

  public static double average(int lowerBound, int upperBound) {
    setBounds(lowerBound, upperBound);
    double average;
    double sum = 0.0;
    int i = minBound;
    while (i <= maxBound) {
      sum += i;
      i++;
    }
    average = sum / Math.abs(maxBound - minBound + 1);
    return average;
  }

  public static double average(int[] numbers) {
    double average;
    double sum = 0.0;
    int i = 1;
    do {
      sum += numbers[i-1];
      i++;
    }
    while (i <= numbers.length);
    average = sum / (i - 1);
    return average;
  }
}