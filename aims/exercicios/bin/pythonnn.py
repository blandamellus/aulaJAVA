from turtle import end_fill


N = int(input("Entre c núm decimal "))
if(N>=16):
  print("16 * 1")
  N=N-16
  b16=1
else:
    print(16 * 0)
    b16=0
if(N>=8):
    print("8 * 1")
    b16=0
if(N>=8):
   print("8 * 1")
   N=N-8
   b8=1
else:
   print("8 * 0")
   b8=0
if(N>=4):
    print("4 * 1")
    N=N-4
    b4=1
else:
    print("4 * 0")
    b4=0
if(N>=2):
    print("2 * 1")
    N=N-2
    b2=1
else:
    print("2 * 0")
    b2=0
if(N>=1):
    print(1 * 1)
    N=N-1
    b1=1
else:
    print(1 * 0)
    b1=0
print("em binário fica =", b16, b8, b4, b2, b1)
end_fillb