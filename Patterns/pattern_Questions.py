# Square Pattern
N = int(input("Enter Value of N(for Square Pattern): "))

for i in range(0, N):
    for j in range(0, N):
        print(N, end="")
    print(end="\n")

# Triangular Star Pattern
N = int(input("Enter Value of N(for Triangular Star Pattern): "))

for i in range(1, N+1):
    for j in range(0, i):
        print('*', end='')
    print(end='\n')

# Triangular Number Pattern
N = int(input("Enter Value of N(for Triangular Number Pattern): "))

for i in range(1, N+1):
    for j in range(0, i):
        print(i, end='')
    print(end='\n')

# Reverse Number Pattern
N = int(input("Enter Value of N(Reverse Number Pattern): "))

for i in range(1, N+1):
    r = i
    for j in range(0, i):
        print(r, end='')
        r -= 1
    print(end='\n')

# Alpha Pattern
N = int(input("Enter Value of N(Alpha Pattern): "))

for i in range(0, N):
    ch = ord('A') + i
    for j in range(-1, i):
        print(chr(ch), end='')
    print(end='\n')

# Character Pattern
N = int(input("Enter Value of N(for Character Pattern): "))

for i in range(0, N):
    ch = ord('A') + i
    for j in range(-1, i):
        print(chr(ch), end='')
        ch = ch + 1
    print(end='\n')

# Interesting Alphabets
N = int(input("Enter Value of N(Interesting Alphabets): "))

for i in range(1, N+1):
    ch = ord('A') + N - i
    for j in range(0, i):
        print(chr(ch), end='')
        ch += 1
    print(end='\n')

# Mirror Number Pattern
N = int(input("Enter Value of N(Mirror Number Pattern): "))

for i in range(1, N+1):
    for j in range(0, N-i):
        print(' ', end='')
    for j in range(1, i+1):
        print(j,end='')
    print(end='\n')

# Inverted Number Pattern
N = int(input("Enter Value of N(for Inverted Number Pattern): "))

for i in range(N, 0, -1):
    for j in range(0, i):
        print(i, end='')
    print()

# Star Pattern
N = int(input("Enter Value of N(for Star Pattern): "))

for i in range(1, N+1):
    for j in range(0, N-i):
        print(' ', end='')
    x = 2*i - 1
    for x in range(0, x):
        print('*', end='')
    print()

# Triangle of Numbers
N = int(input("Enter Value of N(for Triangular Number): "))

for i in range(1, N+1):
    for j in range(0, N-i):
        print(' ', end='')
    for k in range(i, 2*i):
        print(k, end='')
    for l in range(2*i-2, i-1, -1):
        print(l, end='')
    print()

# Diamond of Stars
N = int(input("Enter Odd Value of N(for Diamond Star): "))

n1 = N//2 + 1
n2 = N - n1
for i in range(1, n1+1):
    for j in range(i, n1):
        print(' ', end='')
    for k in range(0, 2*i-1):
        print('*', end='')
    print()
for i in range(n2, 0, -1):
    for j in range(0, n2-i+1):
        print(' ', end='')
    for k in range(2*i-1, 0, -1):
        print('*', end='')
    print()

# Pyramid Number Pattern
N = int(input("Enter Value of N(for Pyramid Number Pattern): "))

for i in range(1, N+1):
    for j in range(N, i, -1):
        print(' ', end='')
    for k in range(i, 0, -1):
        print(k, end='')
    for l in range(1, i):
        print(l+1, end='')
    print()




