
val temp1 = "hi"
val temp2 = 30
val temp3 = 3.0

val str1 = "$temp1 my age is $temp2, $temp3"
println(str1)


var str2 = "$temp1 => ${temp2 * temp3}"
println(str2)


var str3 = "\$temp1 => \${temp2 * temp3}$"
println(str3)