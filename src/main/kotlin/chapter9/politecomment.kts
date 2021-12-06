import chapter9.PoliteString

var comment: String by PoliteString("Some nice message")
println(comment) // Some nice message
comment = "This is stupid"
println(comment) // This is s*****
println("comment is of length: ${comment.length}") // comment is of length: 14