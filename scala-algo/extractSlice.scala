// object GFG
// { 
//     // Main method 
//     def main(args:Array[String]):Unit =
//     { 
//         val n = 3
//         val e = 7
//         val list = List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k")

//         def slice(l:List[String],count:Int,acc:List[String]):List[String] = {
//             println(s"$l, $acc, $count")
//             l match {
//                 case Nil => Nil
//                 case head :: tail if count > e => acc
//                 case head :: tail if count > n => slice (tail,count+1,acc:+head) 
//                 case head :: tail => slice (tail,count+1,acc)

//             }
//         }       
            
//         print(slice(list,1,List[String]()))

//     } 
// } 
  

