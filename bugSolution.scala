```scala
trait Addable[T] {
  def add(x: T, y: T): T
}

object AddableInstances {
  implicit val intAddable: Addable[Int] = new Addable[Int] {
    override def add(x: Int, y: Int): Int = x + y
  }

  implicit val stringAddable: Addable[String] = new Addable[String] {
    override def add(x: String, y: String): String = x + y
  }
}

class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T])(implicit addable: Addable[T]): T = {
    addable.add(this.value, other.value)
  }
}

object Main extends App {
  import AddableInstances._
  val intInstance = new MyClass[Int](10)
  val stringInstance = new MyClass[String]("Hello")

  println(intInstance.myMethod(new MyClass[Int](5))) // Output: 15
  println(stringInstance.myMethod(new MyClass[String]("World"))) // Output: HelloWorld
  // println(intInstance.myMethod(stringInstance)) // Compile-time error now
}
```