# Java 8 solution to FooBarQix problem


##Problème:
Write a program that displays numbers from 1 to 100. One number per line. 
Observe the following rules:
  . If the number is divisible by 3 or contains 3, write "Foo" instead of 3.
  . If the number is divisible by 5 or contains 5, write "Bar" instead of 5.
  . If the number is divisible by 7 or contains 7, write "Qix" instead of 7.
   
Additional rules:
    . We look at the divisors before the content (ex: 51 -> FooBar)
    . We look at the content in the order in which it appears (ex: 53 -> BarFoo).
    . We look at the multiples in the order Foo, Bar then Qix (ex: 21 -> FooQix)
Examples:
    . 13 contains, 3 so is spelled, "Foo"
    . 15 is divisible by 3 and 5 and contains a 5, so it's spelled "FooBarBar."
    . 33 contains two times 3 and is divisible by 3 so is written "FooFooFooFoo".

Here are the first lines: 
`1
2
FooFoo
4
BarBar
Foo
QixQix
8
Foo 
Bar 
…`
