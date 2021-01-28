import kotlin.math.abs

//Савелий Соломатов
fun main() {
  //Boolean 40
  var yes = true;
  var no = false;
  print("Введите кординату где стоит конь по вертикали(от 1 до 8):")
  var x1 = readLine()!!.toInt()
  print("Введите кординату где стоит конь по горизонтали(от 1 до 8):")
  var y1 = readLine()!!.toInt()
  print("Введите кординату куда пойдёт конь по вертикали(от 1 до 8):")
  var x2 = readLine()!!.toInt()
  print("Введите кординату куда пойдёт конь по горизонтали(от 1 до 8):")
  var y2 = readLine()!!.toInt()
  var v = abs (x1-x2)
  var g = abs(y1-y2)
  var h = abs(x1-x2)+ abs(y1-y2)
  print(yes.and((h == 3 )&&((g==1)||(g==2)&&((h==1)||(h==2)))))
}