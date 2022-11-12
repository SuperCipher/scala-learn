// object GFG
// { 
//     // Main method 
//     def main(args:Array[String]):Unit =
//     { 
//         // val n = 3
//         val list = List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k")

//         def split1(acc:List[String])(n:Int)(l:List[String]):(List[String],List[String]) = l match {
//                 case Nil => (acc,Nil)
//                 case head :: tail if n > 0 => split1 (acc:+head)(n-1)(tail) 
//                 case wholeList  => (acc,wholeList)
//             }

//         // val split = (List[String]())
                
            
//         print( split1 ( List[String]() ) (3) (list) )

//     } 
// } 
  

