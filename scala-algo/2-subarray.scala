
  
// // object ClassName extends App {
// //         (c:Double) => [c,c]
// // }
// object GFG
// { 
//     // Main method 
//     def main(args:Array[String]):Unit =
//     { 
//         def LCM(nums: List[Int], k: Int, acc: List[Int]): List[Int] = {
//             // println(s"$nums, $acc, $k")
//             nums match {
//                 case Nil => acc
//                 case x :: xs  if x == 1 => LCM(xs , k, acc)
//                 case x :: xs  if k % x == 0 => LCM(xs , k,acc :+ x)
//                 case x :: xs => LCM(xs , k ,acc)
//             }
//         }

//         // val tempLCM = LCM(List(3,6,2,7,1), 6,List[Int]())
//         // val tempLCM = LCM(List(3,6,2,7,1), 6,List[Int]())

//         // println(tempLCM)
//         def countTo(l: List[Int], count: Int): Int = {
//             println(s"$l, $count")
//             l match {
//                 case Nil => count
//                 case x :: xs => countTo(xs , count +(x :: xs).length )
//             }
//         }
//         // println(countTo(tempLCM,1))



//         // def innerSlide(ll: List[List[Int]], len:Int, acc: List[List[Int]]): List[List[Int]] = {
//         //     println(s"$ll, $acc, $len")
//         //     nums match {
//         //         case Nil => acc
//         //         case x :: xs => innerSlide(xs, len-1, acc :+ x)
//         //     }
//         // }
//         // println(List(3,6,2,7,1).sliding(1).foreach(println))

//             val l = List(3)

//             // val tempLCM = LCM(l, k,List[Int]())
//             val tempLCM = LCM(l, 2,List[Int]())
//             print(countTo(tempLCM,0))

//         def subarrayLCM(nums: Array[Int], k: Int): Int = {
//             // val l = nums.toList
//             val l = List(3,6,2,7,1)

//             // val tempLCM = LCM(l, k,List[Int]())
//             val tempLCM = LCM(l, 6,List[Int]())
//             print(countTo(tempLCM,1))
//             countTo(tempLCM,1)
            
//         }
//         // subarrayLCM(Array[3],2)
//         // print(subarrayLCM(Array[3],2))

//     } 
// } 