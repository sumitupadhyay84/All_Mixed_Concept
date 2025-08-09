<!DOCTYPE html>
<html>
  <head>
    <title>Hello World!</title>
    <link rel="stylesheet" href="styles.css" />
  </head>
  // real example of closure;
  <body>
      <button id="green">Green</button>
      <button id="orange">Orange</button>
      <script> // closure provide the access of child function from parent function lexical scope. 
      function clickHandler(color){
        return function(){
         document.body.style.backgroundColor = `${color}` // access color by child function
        }
     }
     document.getElementById("green").onclick=clickHandler("green"); // onclick required function to executing.
     document.getElementById("orange").onclick=clickHandler("orange");
  </script>
 </body>
</html>
