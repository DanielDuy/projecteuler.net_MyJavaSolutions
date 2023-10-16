product_found = False

for a in range(1, 1000):
    if product_found:
        break
    for b in range(1, 1000):
        if product_found:
            break
        for c in range(1, 1000):
            if (a < b < c) and (a**2+b**2 == c**2) and (a+b+c == 1000):
                print("{} {} {}".format(a, b, c))
                print(a*b*c)
                product_found = True
                break
