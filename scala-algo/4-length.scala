// object GFG
// { 
//     // Main method 
//     def main(args:Array[String]):Unit =
//     { 
//         def leng1 (count:Int)(l:List[Int]):Int = l match{
//             case Nil => count
//             case x :: xs => leng1 (count + 1) (xs)
//         }
//         val leng = leng1(0)(_)
//         print(leng(List(1, 1, 2, 3, 5, 8)))

//     } 
// } 
  

