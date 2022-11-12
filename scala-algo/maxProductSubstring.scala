// object GFG
// { 
//     // Main method 
//     def main(args:Array[String]):Unit =
//     { 
  
// val list = List(-6, 4, -5, 8, -10, 0, 8)

// val sorted = list.sorted

// val neg = sorted.filter(_ < 0)


// (neg:List[Int]) => if neg.size % 2 == 1 then neg.dropRight(1) else neg


// // val restNeg = fakeAnonymous(neg)
// val restNeg = (neg) => {if neg.size % 2 == 1 then neg.dropRight(1) else neg}


// val restPos = sorted.filter(_ > 0)

// println(restNeg)
// println(restPos)
// println(restNeg.foldRight(1)(_ * _) * restPos.foldRight(1)(_ * _))

//     } 
// } 
  

