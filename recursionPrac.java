//1
public int largest(int[] numbers, int index) {
    if (index == 0)
      return numbers[0];
    return Math.max(numbers[index], largest(numbers, index-1));
  }

  //2
  public int multiply(int x, int y) {
    if (x > 0 || y > 0) {
      int sum = x * y;
        return sum;
    } else {
      return multiply(x - 1, y) + y;
    }
  }

  //3
  public int GCD(int x, int y) 
{
if (y != 0)
    return GCD(y, x % y);
else
    return x;
}


