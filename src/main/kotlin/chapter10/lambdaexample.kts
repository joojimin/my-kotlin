fun isPrime(n: Int) = n > 1 && (2 until n).none { i: Int -> n % i == 0 }


fun isPrime2(n: Int) = n > 1 && (2 until n).none { n % it == 0 }