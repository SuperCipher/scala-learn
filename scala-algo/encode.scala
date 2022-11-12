// object GFG
// { 
//     // Main method 
//     def main(args:Array[String]):Unit =
//     {

//         val list = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
//         type KeyValue = (Int, String)
//         // [a,a,a,a] -> (Int,String)
//         def pack(l:List[String]):(Int, String) = l match{
//             (1,3)
//         }

//         def rec(l:List[String], acc:List[List[String]]):List[List[String]] = l match {
//             case Nil => acc
//             case head :: rest => {
//                 println(rest)
//                 rec(l.filterNot(head == _) ,  acc :+ l.filter(head == _) )
//             }
//         }


//         val answer = rec(list, List[List[String]]())

//         println(answer)

//     } 
// } 
  