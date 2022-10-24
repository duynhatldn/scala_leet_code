object Solution {
    def haveConflict(event1: Array[String], event2: Array[String]): Boolean = {
        event1(1) >= event2(0) && event2(1) >= event1(0)
    }
}




// object Solution {
//     def haveConflict(event1: Array[String], event2: Array[String]): Boolean = {
//         var e11: Float = event1(0).split(":")(0).toFloat + event1(0).split(":")(1).toFloat/100
//         var e12: Float = event1(1).split(":")(0).toFloat + event1(1).split(":")(1).toFloat/100
//         var e21: Float = event2(0).split(":")(0).toFloat + event2(0).split(":")(1).toFloat/100
//         var e22: Float = event2(1).split(":")(0).toFloat + event2(1).split(":")(1).toFloat/100
//         e11 <= e21 && e21 <= e12 || e21 <= e11 && e11 <= e22
//     }
// }