object Solution {
    
     def fibonacci(x:Int):Int = {
          if(x == 0 || x == 1)
              return 0;
         if(x == 2 || x == 3)
             return 1;
         fibonacci(x - 1) + fibonacci(x - 2)
     }

    def main(args: Array[String]) {
         /** This will handle the input and output**/
         println(fibonacci(readInt()))

    }
}
