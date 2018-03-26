# Sudo Compiler For N (Ugly Mess) ps. only works with the print statements and main function right now. must use Compile.bat with jar file in cmd to use ```Compile.bat %filename%.n```

<br />

##The N Language
---
The N Language was a language that I tried to design that took inspiration from swift, python and java.

<br />

##Syntax
---
###Functions

A function in the N language uses the key word of ```func``` followed by the name of the function and parameters.

```
func funcName() {
    // Some Code
}

func setVar(x) {
    // Some Code
}
```

A function that has a return:

```
func get() : var {
    // Some Code
    return x
}
```

###Variables

Variables start with either the keyword ```var``` or ```let``` (for constants).

```
var x;
let y = 5;
```

###Conditionals

The if statement:

```
if true {
    // Some Code
}
```

###Loops

The while loop:

```
while true {
    // Some Code
}
```

The for loop:

```
for i 0 to 10 {
    // Some Code
}
```

The for each loop:

```
foreach c in s {
    // Some Code
}
```

###Printing output

To print output into the console, there are three methods that can be used:

```
print(var);
println();
println(var);
printf("%d%f%s%n", var);
```

Escape sequences will also work with these print statements ```\n```, ```\t```, ```\\```, ```\'``` and ```\"```.
