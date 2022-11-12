// object GFG
// { 
//     // Main method 
//     def main(args:Array[String]):Unit =
//     { 
//         def kth (n:Int)(l:List[Int]):Int = l match {
//             case Nil => -1
//             case head :: tail if n <= 0   => head
//             case head :: tail => kth (n-1) (tail)

//         }

//         println(kth(2)(List(1, 1, 2, 3, 5, 8)))

//     } 
// } 
  