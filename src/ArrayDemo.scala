import scala.io.StdIn.*
object ArrayDemo
{
  def main(args:Array[String]): Unit = {

  println("Enter the number of student records: ")
  var rows = readInt
  var students = Array.ofDim[String](rows,4) //5*4 table or matrix

  var i = 0
  while (i<rows) {
    students(i)(0) = readLine("Enter the student Name: ")
    students(i)(1) = readLine("Enter the student Address: ")
    students(i)(2) = readLine("Enter the student Phone: ")
    students(i)(3) = readLine("Enter the student Email: ")
    println("---------------")
    i = i + 1
  }
      for irow <- students do
        for icol <- irow do
          println(icol)
        println("------------------------")
  }
}



