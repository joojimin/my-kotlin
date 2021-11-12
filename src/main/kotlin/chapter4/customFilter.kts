val myCondition = { it: Int -> it % 3 == 0 }

for (i in (1..5).filter(myCondition)) {
    print("$i, ")
}

