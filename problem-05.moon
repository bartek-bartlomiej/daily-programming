first = (a, _) -> a
last = (_, b) -> b

cons = (a, b) -> (f) -> f(a, b)

car = (pair) -> pair(first)
cdr = (pair) -> pair(last)


pair = cons(3, 4)

print(car(pair))
print(cdr(pair))
