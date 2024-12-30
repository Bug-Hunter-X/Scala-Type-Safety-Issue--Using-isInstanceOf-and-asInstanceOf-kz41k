```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): T = {
    if (this.value.isInstanceOf[Int] && other.value.isInstanceOf[Int]) {
      this.value.asInstanceOf[Int] + other.value.asInstanceOf[Int] 
    } else if (this.value.isInstanceOf[String] && other.value.isInstanceOf[String]) {
      this.value.asInstanceOf[String] + other.value.asInstanceOf[String] 
    } else {
      throw new IllegalArgumentException("Unsupported type")
    }
  }
}

object Main extends App {
  val intInstance = new MyClass[Int](10)
  val stringInstance = new MyClass[String]("Hello")

  println(intInstance.myMethod(new MyClass[Int](5))) // Output: 15
  println(stringInstance.myMethod(new MyClass[String]("World"))) // Output: HelloWorld
  println(intInstance.myMethod(stringInstance)) // Throws IllegalArgumentException
}
```