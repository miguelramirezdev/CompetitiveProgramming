
while 1 :
    n=input();
    if n=="0 0":
        break

    a= set(map(int, input().split()))
    b= set(map(int, input().split()))
    w=len(a-b)
    x=len(a.intersection(b))
    y=len(b-a);
    z=w+x+y
    print(f"{w} {x} {y} {z}")

