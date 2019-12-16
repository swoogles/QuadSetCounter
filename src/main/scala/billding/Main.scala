package billding

import org.scalajs.dom
import dom.document

object Main {
  var count = 0
  def toggleColor() =
    if (document.body.getAttribute("style").contains("green")) {
      document.body.setAttribute("style", "background-color: red")
    } else {
      count += 1
      document.getElementById("counter").innerHTML = count.toString
      document.body.setAttribute("style", "background-color: green")
    }

  def main(args: Array[String]): Unit = {
    document.body.setAttribute("style", "background-color: green")
    document.getElementById("counter").innerHTML = count.toString
    dom.window.setInterval(() => toggleColor(), 10000)
  }
}
