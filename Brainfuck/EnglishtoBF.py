s1=input()
s2=list(s1)
s3=[ord(j) for j in s2]
for i in range(0,len(s2)):
    loop=int(s3[i]/10)
    remain=s3[i]%10
    for j in range(0,loop):
        print("+",end="")
    print()
    print("[>++++++++++<-]")
    print(">",end="")
    for j in range(0,remain):
        print("+",end="")
    print(".")
    print("<<")
    
        
