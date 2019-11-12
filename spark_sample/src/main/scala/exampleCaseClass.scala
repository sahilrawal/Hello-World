package testScala

object exampleCaseClass {
  def main (args:Array[String]): Unit ={

     val s1 = new Person("Peter",21);
     val s2 = new Person("Mark",22);
     val s3 = new Person("Ying",23);
     val s4 = new Person("Peter",21);

      println(s1.hashCode())
    println(s2.hashCode())
    println(s3.hashCode())
    println(s4.hashCode())



    for(person <- List(s1,s2,s3,s4)){

      person match{

        case Person("Peter",21) => println("Hi Peter")
        case Person("Mark",22) => println("Hi Mark")
        case Person("Ying",23) => println("Hi Ying")
        case _ =>println("Hey !!!")
      }

    }
  }


  case class Person(name:String,age:Int)

}
