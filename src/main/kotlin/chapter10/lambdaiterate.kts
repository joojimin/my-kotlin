fun walk1To(n: Int, action: (Int) -> Unit) =
    (1..n).forEach { action(it) }

walk1To(5, { i -> print(i) }) // 12345
walk1To(5) { i -> print(i) } // 12345
walk1To(5) { print(it) } // 12345
//walk1To(5) { ::println } // 메서드 참조