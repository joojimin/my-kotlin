// 명령형 스타일
var doubleOfEven1 = mutableListOf<Int>()
for (i in 1..10) {
    if (i % 2 == 0) {
        doubleOfEven1.add(i * 2)
    }
}


// 함수형 스타일
var doubleOfEven2 = (1..10)
    .filter { e -> e % 2 == 0 }
    .map { e -> e * 2 }