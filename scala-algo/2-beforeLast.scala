// object GFG
// { 
//     // Main method 
//     def main(args:Array[String]):Unit =
//     { 
//         def beforeLast (l:List[Int]):Int = l match {
//             case Nil => -1
//             case before :: head :: Nil => before
//             case head :: tail => beforeLast (tail)
//         }

//         println(beforeLast(List(1, 1, 2, 3, 5, 8)))

//     } 
// } 
  