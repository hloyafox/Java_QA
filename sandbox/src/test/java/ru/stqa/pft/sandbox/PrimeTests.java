package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {

  @Test

  public void testPrimes () {
    Assert.assertTrue(Prime.isPrimeFast(Integer.MAX_VALUE));
  }

  @Test
  public void testNoPrimes () {
    Assert.assertFalse(Prime.isPrimeFast(Integer.MAX_VALUE - 2));
  }

  @Test(enabled = false)

  public void testPrimeLong () {
    long n = Integer.MAX_VALUE;
    Assert.assertTrue(Prime.isPrime(n));
  }
}
